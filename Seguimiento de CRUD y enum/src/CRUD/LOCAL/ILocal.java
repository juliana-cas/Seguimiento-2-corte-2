package CRUD.LOCAL;

import java.util.List;

public interface ILocal {

    Local encontrarId(int id);
    List<Local> encontrarTodo();
    void guardar(Local local);
    void actualizar(Local local);
    void borrar(Local local);

}