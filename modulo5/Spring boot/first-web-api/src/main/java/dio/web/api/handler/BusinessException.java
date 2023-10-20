package dio.web.api.handler;

public class BusinessException extends RuntimeException {
    public BusinessException(String mensagem) {
        super(mensagem);
    }

    //varargs pesquisar sobre
    public BusinessException(String mensagem, Object ... params) {
        super(String.format(mensagem, params));
    }
}
