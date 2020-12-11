package AlimentosApp.java.co.edu.cotecnova.AlimentosApp.Modelos;

import AlimentosApp.java.co.edu.cotecnova.AlimentosApp.Servicio.RegistroCarn;

public class AnimalCarnivoro extends Animal{

    public AnimalCarnivoro(String nombre, String comer, int id) {
        super(nombre, comer, id);
    }

    @Override
    public void alimentarse(){
        RegistroCarn carn = new RegistroCarn();
        carn.alimentarse();
    }

    @Override
    public void Mostrar(){
        RegistroCarn carn = new RegistroCarn();
        carn.Mostrar();
    }
}
