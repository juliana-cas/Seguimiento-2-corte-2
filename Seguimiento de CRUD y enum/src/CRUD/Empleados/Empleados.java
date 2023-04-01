package CRUD.Empleados;

public class Empleados {

    public int id;
    private String nombre;
    private int cedula;

    public Empleados(int id, String nombre, int cedula) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Empleados:\n" +
                "id=" + id + "\n" +
                "nombre= " + nombre +"\n"+
                "cedula= " + cedula;
    }
}