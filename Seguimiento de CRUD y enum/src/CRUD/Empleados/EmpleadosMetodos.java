package CRUD.Empleados;

import java.util.ArrayList;
import java.util.List;

public class EmpleadosMetodos implements IEmpleados {

    public List<Empleados> empleadosList;

    public EmpleadosMetodos() {
        this.empleadosList = new ArrayList<>();
    }

    @Override
    public Empleados encontrarId(int id) {
        return empleadosList.stream()
                .filter(empleados -> empleados.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Empleados> encontrarTodo() {
        return empleadosList;
    }

    @Override
    public void guardar(Empleados empleados) {
        empleadosList.add(empleados);
    }

    @Override
    public void actualizar(Empleados empleados) {
        Empleados datosViejos = encontrarId(empleados.getId());
        if (datosViejos != null){
            empleadosList.remove(datosViejos);
            empleadosList.add(empleados);
        }

    }

    @Override
    public void borrar(Empleados empleados) {
        empleadosList.remove(empleados);
    }
}