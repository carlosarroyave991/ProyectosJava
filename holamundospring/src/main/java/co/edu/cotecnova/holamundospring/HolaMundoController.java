package co.edu.cotecnova.holamundospring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {

@GetMapping("/saludo")
    public String inicio(){
    return "hola mundo";
    }
}
