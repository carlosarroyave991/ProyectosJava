package AlimentosApp.java.co.edu.cotecnova.AlimentosApp.Modelos;

abstract class Animal extends SerVivo {

    public Animal(String nombre, String comer, int id) {
        super(nombre,comer,id);
    }

    @Override
    abstract void alimentarse();

    @Override
    abstract void Mostrar();
}
