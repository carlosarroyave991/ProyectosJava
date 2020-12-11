package AlimentosApp.java.co.edu.cotecnova.AlimentosApp.Menu;

import java.util.Scanner;

/**
 * Modulo que muestra el menu principal del sistema
 * @author Carlos Arroyave
 */
public class Menu {

    public void menu(){
        int op;
        Scanner sc =new Scanner(System.in);
        do{
            System.out.println("Biemvenido al menu");
            System.out.println("1.)Modulo Plantas");
            System.out.println("2.)Modulo Animales Carnivoros");
            System.out.println("3.)Modulo Animales Herbivoros");
            System.out.println("4.)Salir del menu.");
            op=sc.nextInt();
            switch (op){
                case 1:
                    ModuloPlanta mp=new ModuloPlanta();
                    mp.ModPlan();
                    break;
                case 2:
                    ModuloCarnivoro mc=new ModuloCarnivoro();
                    mc.ModCarn();
                    break;
                case 3:
                    ModuloHerb mh=new ModuloHerb();
                    mh.ModHerb();
                    break;
                case 4:
                    System.out.println("usted decicio salir del sistema");
                    break;
                default:
                    System.out.println("La opcion seleccionada no esta en el rango");
                    break;
            }
        }while(op!=4);
    }
}
