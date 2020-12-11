package AlimentosApp.java.co.edu.cotecnova.AlimentosApp.Menu;

import AlimentosApp.java.co.edu.cotecnova.AlimentosApp.Servicio.RegistroHerb;

import java.util.Scanner;

public class ModuloHerb {
    public void ModHerb(){
        int op=0;
        Scanner sc =new Scanner(System.in);
        RegistroHerb rh=new RegistroHerb();
        do{
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Biemvenido al modulo de herbivoros");
            System.out.println("1.)Ingresar Ser vivo");
            System.out.println("2.)Mostrar Ser vivo");
            System.out.println("3.)Salir del menu.");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    rh.alimentarse();
                    break;
                case 2:
                    rh.Mostrar();
                    break;
                case 3:
                    System.out.println("Usted decidio regresar al menu principal.");
                    break;
            }
        }while(op!=3);
    }
}
