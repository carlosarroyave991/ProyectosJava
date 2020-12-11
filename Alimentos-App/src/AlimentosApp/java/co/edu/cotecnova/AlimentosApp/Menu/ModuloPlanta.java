package AlimentosApp.java.co.edu.cotecnova.AlimentosApp.Menu;


import AlimentosApp.java.co.edu.cotecnova.AlimentosApp.Servicio.RegistroPlan;

import java.util.Scanner;

/**
 * Modulo para escoger que operacion realizar con la clase planta
 * @author Carlos Arroyave
 * @since 2020
 */
public class ModuloPlanta {

    public void ModPlan(){
        int op=0;
        Scanner sc =new Scanner(System.in);
        RegistroPlan rp=new RegistroPlan();
        do{
            System.out.println("Biemvenido al modulo de planta");
            System.out.println("1.)Ingresar Ser vivo");
            System.out.println("2.)Mostrar Ser vivo");
            System.out.println("3.)Salir del menu.");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    rp.alimentarse();
                    break;
                case 2:
                    rp.Mostrar();
                    break;
                case 3:
                    System.out.println("Usted decidio regresar al menu principal.");
                    break;
            }
        }while(op!=3);
    }
}
