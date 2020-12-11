package AlimentosApp.java.co.edu.cotecnova.AlimentosApp.Modelos;

import AlimentosApp.java.co.edu.cotecnova.AlimentosApp.Servicio.RegistroPlan;

public class Planta extends SerVivo{
    //private String comer;
    //private Scanner sc= new Scanner(System.in);

    public Planta(String nombre, String comer, int id) {
        super(nombre,comer, id);
        //this.comer = comer;
    }

    @Override
    void alimentarse() {
        RegistroPlan pl=new RegistroPlan();
        pl.alimentarse();
    }
    @Override
    void Mostrar(){
        RegistroPlan pl= new RegistroPlan();
        pl.Mostrar();
    }
}
