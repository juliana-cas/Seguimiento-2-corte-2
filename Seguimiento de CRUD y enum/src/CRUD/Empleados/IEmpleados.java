package CRUD.Empleados;

import java.util.List;

public interface IEmpleados {

    Empleados encontrarId(int id);
    List<Empleados> encontrarTodo();
    void guardar(Empleados empleados);
    void actualizar(Empleados empleados);
    void borrar(Empleados empleados);

}