package co.edu.cotecnova.controladores;

//import co.edu.cotecnova.modelos.Usuario;
import co.edu.cotecnova.modelos.Usuario;
import co.edu.cotecnova.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioControlador {
    @Autowired
    private UsuarioServicio usuarioservicio;

    @GetMapping
    public ResponseEntity<List<Usuario>> obtenerUsuarios(){
        return new ResponseEntity<List<Usuario>>(usuarioservicio.obtenerUsuarios(), HttpStatus.OK);
    }

    @GetMapping(value = "/{username}")
    public ResponseEntity<Usuario> obtenerUsuarioPorUserName(@PathVariable ("username") String username){
        return new ResponseEntity<Usuario>(usuarioservicio.obtenerUsuarioPorUserName(username),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Usuario> crearUsuario(@RequestBody Usuario usuario){
        return new ResponseEntity<Usuario>(usuarioservicio.crearUsuario(usuario), HttpStatus.CREATED);
    }

    @PutMapping(value = "/{username}")
    public ResponseEntity<Usuario> actualizarUsuario(@PathVariable String username, @RequestBody Usuario usuario){
        return new ResponseEntity<Usuario>(usuarioservicio.actualizarUsuario(usuario, username), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{username}")
    public ResponseEntity<Void> eliminarUsuario(@PathVariable String username){
      usuarioservicio.eliminarUsuario(username);
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
