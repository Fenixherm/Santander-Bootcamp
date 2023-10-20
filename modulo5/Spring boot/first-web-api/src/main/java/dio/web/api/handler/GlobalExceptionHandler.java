package dio.web.api.handler;


import jakarta.annotation.Resource;
import org.springframework.cglib.proxy.UndeclaredThrowableException;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @Resource
    private MessageSource messageSource; //mensagem de origem das exceções executadas nas requisições
    private HttpHeaders headers(){  //cabeçalho de resposta, mostrando que é um JSON
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }
    private ResponseError responseError(String message,HttpStatus statusCode){ //recebe a mensagem e o erro
        ResponseError responseError = new ResponseError();
        responseError.setStatus("error"); //pode ser customizado.
        responseError.setError(message);
        responseError.setStatusCode(statusCode.value());
        return responseError;
    }
    @ExceptionHandler(Exception.class)
    private ResponseEntity<Object> handleGeneral(Exception e, WebRequest request) { //verifica se a exceção é uma business exception
        if (e.getClass().isAssignableFrom(UndeclaredThrowableException.class)) { //se sim ela chama a outra handler handleBusinessException
            UndeclaredThrowableException exception = (UndeclaredThrowableException) e;
            return handleBusinessException((BusinessException) exception.getUndeclaredThrowable(), request);
        } else {                                                                //se não, vai retornar uma exceção interna
            String message = messageSource.getMessage("error.server", new Object[]{e.getMessage()}, null);
            ResponseError error = responseError(message,HttpStatus.INTERNAL_SERVER_ERROR); // seria interessante mapear outros tipos de erro para garantir que os usuarios receberam resposta com base nas requisições realizadas
            return handleExceptionInternal(e, error, headers(), HttpStatus.INTERNAL_SERVER_ERROR, request);
        }
    }
    @ExceptionHandler({BusinessException.class})
    private ResponseEntity<Object> handleBusinessException(BusinessException e, WebRequest request) { //é chamada pela handleGeneral
        ResponseError error = responseError(e.getMessage(),HttpStatus.CONFLICT); //Vai montar um response error
        return handleExceptionInternal(e, error, headers(), HttpStatus.CONFLICT, request); //a mensagem vai ser de acordo com a mensagem passada pelo Controller
        //e também irá passar um status code chamado CONFLICT.
    }
}
