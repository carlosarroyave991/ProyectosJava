package AlimentosApp.java.co.edu.cotecnova.AlimentosApp.Menu;

import AlimentosApp.java.co.edu.cotecnova.AlimentosApp.Servicio.RegistroCarn;
//import AlimentosApp.java.co.edu.cotecnova.AlimentosApp.Servicio.RegistroPlan;

import java.util.Scanner;

public class ModuloCarnivoro {
    public void ModCarn(){
        int op=0;
        Scanner sc =new Scanner(System.in);
        RegistroCarn rc=new RegistroCarn();
        do{
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Biemvenido al modulo de Carnivoros");
            System.out.println("1.)Ingresar Ser vivo");
            System.out.println("2.)Mostrar Ser vivo");
            System.out.println("3.)Salir del menu.");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    rc.alimentarse();
                    break;
                case 2:
                    rc.Mostrar();
                    break;
                case 3:
                    System.out.println("Usted decidio regresar al menu principal.");
                    break;
            }
        }while(op!=3);
    }
}
