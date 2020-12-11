package co.edu.cotecnova.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {
    private String nombre;
    private double precio;
    private String referencia;
    //private String descuento;
}
