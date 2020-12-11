package AlimentosApp.java.co.edu.cotecnova.AlimentosApp.Servicio;

import AlimentosApp.java.co.edu.cotecnova.AlimentosApp.Modelos.Planta;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 * Funcion creara para imprimir y escanear la informacion de las clases
 * @autor Carlos Arroyave
 * @since 2020
 */
public class RegistroPlan {
    private String nombre;
    private String comida;
    private static int id =0;
    private final List<Planta> plantaList = new ArrayList<>();


    Scanner sc = new Scanner(System.in);

    /**
     * Permite escribir y tomar la informacion de las clases
     * @autor Carlos Arroyave
     */
    public void alimentarse(){
        System.out.println("Escriba el id del ser vivo:");
        id=sc.nextInt();
        sc.nextLine();
        System.out.println("Escriba el nombre del ser vivo:");
        nombre = sc.nextLine();
        System.out.println("Escriba el alimento del ser vivo:");
        comida = sc.nextLine();
        Almacenar();
    }

    public void Mostrar(){
        //Planta pl = new Planta(nombre,comida,id);
        for(Planta pl: plantaList){
            System.out.println("Id del ser vivo:"+pl.getId());
            System.out.println("Nombre del ser vivo:"+pl.getNombre());
            System.out.println("Comida del ser vivo:"+pl.getComida());
            System.out.println("");
        }
    }

    private void Editar(){
        Mostrar();
        Planta pl = new Planta(nombre,comida,id);
        System.out.println("Seleccione un ser vivo:");
        id=sc.nextInt();
        sc.nextLine();
        System.out.println("Escriba el nuevo nombre:");
        nombre=sc.nextLine();
        pl.setNombre(nombre);
        System.out.println("Escriba la nueva comida:");
        comida=sc.nextLine();
        pl.setComida(comida);
        Almacenar();
    }

    private void Almacenar(){
        Planta pl=new Planta(nombre,comida,id);
        plantaList.add(pl);
    }
}