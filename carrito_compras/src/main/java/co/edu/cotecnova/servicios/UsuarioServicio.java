package co.edu.cotecnova.servicios;


import co.edu.cotecnova.modelos.Usuario;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioServicio {
    private List<Usuario> usuarios=new ArrayList<>();

    public List<Usuario> obtenerUsuarios(){
        return usuarios;
    }

    public Usuario obtenerUsuarioPorUserName(String username){
        return usuarios.stream().filter(u->u.getUsername().equals(username)).findAny().orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("Username %s no encontrado",username)));
    }

    public Usuario crearUsuario(Usuario usuario){
        if (usuarios.stream().anyMatch(u -> u.getUsername().equals(usuario.getUsername()))) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, String.format("El usuario %s ya existe", usuario.getUsername()));
        }
        usuarios.add(usuario);
        return usuario;
    }

    public Usuario actualizarUsuario(Usuario usuario, String username){
        Usuario usuarioActualizar = obtenerUsuarioPorUserName(username);
        usuarioActualizar.setNombre(usuario.getNombre());
        usuarioActualizar.setApellido(usuario.getApellido());
        usuarioActualizar.setUsername(usuario.getUsername());
        usuarioActualizar.setContrasena(usuario.getContrasena());
        return usuarioActualizar;
    }

    public void eliminarUsuario(String username){
        Usuario usuarioEliminar = obtenerUsuarioPorUserName(username);
        usuarios.remove(usuarioEliminar);
    }


}
