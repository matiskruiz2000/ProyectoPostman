package ServicioRest.demo.controller;

import ServicioRest.demo.dao.UsuarioDao1;
import ServicioRest.demo.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UsuarioDao1 usuarioDao1;

    @GetMapping
    public List<Usuario> listar() {
        return usuarioDao1.findAll();
    }

    @PostMapping
    public void insertar (@RequestBody Usuario usuario){
         usuarioDao1.save(usuario);
    }

    @PutMapping
    public void modificar (@RequestBody Usuario usuario){
         usuarioDao1.save(usuario);
    }

    @DeleteMapping(value="/{id}")
    public void eliminar (@PathVariable("id") Usuario usuario){
        usuarioDao1.deleteById(usuario.getId());
    }

}
