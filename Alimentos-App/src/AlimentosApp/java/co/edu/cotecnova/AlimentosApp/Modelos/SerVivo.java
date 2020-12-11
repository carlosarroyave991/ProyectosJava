package AlimentosApp.java.co.edu.cotecnova.AlimentosApp.Modelos;

/**
 *Super clase encargada de almacenar los datos de comida, nombre e id.
 * @autor Carlos Arroyave
 * @since 2020
 */
abstract class SerVivo {
    private String nombre;
    private String comida;
    private int id;


    public SerVivo(String nombre, String comida, int id) {
        this.nombre = nombre;
        this.comida = comida;
        this.id=id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    abstract void alimentarse();

    abstract void Mostrar();
}


