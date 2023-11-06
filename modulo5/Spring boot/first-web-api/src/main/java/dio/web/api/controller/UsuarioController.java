package dio.web.api.controller;

import dio.web.api.Model.Usuario;
import dio.web.api.Repository.UserRepository;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Tag(name = "Usuario", description = "Usuario management APIs")
@RestController
@RequestMapping("/users")
public class UsuarioController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping()
    public List<Usuario> getUsers(){
        return userRepository.findAll();
    }
    @GetMapping("/{username}")
    public Usuario getOne(@PathVariable("username") String username){
        return userRepository.findByUsername(username);
    }
    @DeleteMapping("/{id}")//As requisiçoes HTTP no navegador so funciona em metodos gets
    public void deleteUser(@PathVariable("id") Integer id){
        userRepository.deleteById(id);
    }
    @PostMapping()
    public void postUser(@RequestBody Usuario usuario){
        userRepository.save(usuario);
    }
    @PutMapping()
    public void putUser(@RequestBody Usuario usuario){
        userRepository.save(usuario);
    }


}
