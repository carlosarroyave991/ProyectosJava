package AlimentosApp.java.co.edu.cotecnova.AlimentosApp.Modelos;

import AlimentosApp.java.co.edu.cotecnova.AlimentosApp.Servicio.RegistroHerb;
import AlimentosApp.java.co.edu.cotecnova.AlimentosApp.Servicio.RegistroPlan;

public class AnimalHerbivoro extends Animal{

    public AnimalHerbivoro(String nombre, String comida, int id) {
        super(nombre, comida, id);
    }

    @Override
    public void alimentarse(){
        RegistroHerb herb = new RegistroHerb();
        herb.alimentarse();
    }

    @Override
    public void Mostrar(){
        RegistroHerb herb = new RegistroHerb();
        herb.Mostrar();
    }

}

