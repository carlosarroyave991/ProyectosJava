package co.edu.cotecnova.modelos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    private String nombre;
    private String apellido;
    private String username;
    private String contrasena;

}


