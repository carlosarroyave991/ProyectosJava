package co.edu.cotecnova.holamundospring;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Usuario {
    private String nombre;
    private String apellido;
}
