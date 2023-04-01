package CRUD.Taller;

public class Registro {

    public int id;
    private String nombre;
    private String placa;
    private String color;

    public Registro(int id, String nombre, String placa, String color) {
        this.id = id;
        this.nombre = nombre;
        this.placa = placa;
        this.color = color;
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

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Registro:\n" +
                "id=" + id +
                "\n nombre='" + nombre + '\'' +
                "\n placa='" + placa + '\'' +
                "\n color='" + color + '\'';
    }
}