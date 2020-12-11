package AlimentosApp.java.co.edu.cotecnova.AlimentosApp.Servicio;

//import AlimentosApp.java.co.edu.cotecnova.AlimentosApp.Modelos.AnimalCarnivoro;
import AlimentosApp.java.co.edu.cotecnova.AlimentosApp.Modelos.AnimalHerbivoro;
import AlimentosApp.java.co.edu.cotecnova.AlimentosApp.Modelos.Planta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroHerb {
    private String nombre;
    private String comida;
    private static int id = 1;
    private final List<AnimalHerbivoro> ahList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    /**
     * Permite escribir y tomar la informacion de las clases
     */
    public void alimentarse(){
        System.out.println("Escriba el id del ser vivo:");
        id=sc.nextInt();
        sc.nextLine();
        System.out.println("Escriba el nombre del ser vivo:");
        nombre = sc.nextLine();
        sc.nextLine();
        System.out.println("Escriba el alimento del ser vivo:");
        comida = sc.nextLine();
        Almacenar();
    }

    public void Mostrar(){
        //Planta pl = new Planta(nombre,comida,id);
        for(AnimalHerbivoro ah: ahList){
            System.out.println("Id del ser vivo:"+ah.getId());
            System.out.println("Nombre del ser vivo:"+ah.getNombre());
            System.out.println("Comida del ser vivo:"+ah.getComida());
            System.out.println("");
        }
    }

    private void Editar(){
        Mostrar();
        System.out.println("Seleccione un ser vivo:");
        id=sc.nextInt();
        System.out.println("");
        System.out.println("Usted decidio editar este ser vivo:");
        for(AnimalHerbivoro ah: ahList){
            if(id== ah.getId()){
                System.out.println("Id del ser vivo:"+ah.getId());
                System.out.println("Nombre del ser vivo:"+ah.getNombre());
                System.out.println("Comida del ser vivo:"+ah.getComida());
                System.out.println("");
            }
        }
        alimentarse();
    }

    private void Almacenar(){
        AnimalHerbivoro ah = new AnimalHerbivoro(nombre,comida,id);
        ah.setNombre(nombre);
        ah.setComida(comida);
        ah.setId(id);
        ahList.add(ah);
    }
}
