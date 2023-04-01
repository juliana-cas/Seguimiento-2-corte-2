package CRUD.Taller;

import java.util.List;

public interface IRegistro {
    Registro encontrarId(int id);
    List<Registro> encontrarTodo();
    void guardar(Registro registro);
    void actualizar(Registro registro);
    void borrar(Registro registro);
}