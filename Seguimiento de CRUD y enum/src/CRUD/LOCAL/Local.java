package CRUD.LOCAL;

public class Local {
    public int id;
    private String nombreLocal;
    private String direccion;

    public Local(int id, String nombreLocal, String direccion) {
        this.id = id;
        this.nombreLocal = nombreLocal;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreLocal() {
        return nombreLocal;
    }

    public void setNombreLocal(String nombreLocal) {
        this.nombreLocal = nombreLocal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Local= " +
                "id=" + id +
                ", nombreLocal='" + nombreLocal + '\'' +
                ", direccion='" + direccion + '\'';
    }
}