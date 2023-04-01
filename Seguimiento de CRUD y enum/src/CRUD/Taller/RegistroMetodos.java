package CRUD.Taller;

import java.util.ArrayList;
import java.util.List;

public class RegistroMetodos implements IRegistro{

    public ArrayList<Registro> registroList;

    public RegistroMetodos() {
        this.registroList = new ArrayList<Registro>();
    }

    @Override
    public Registro encontrarId(int id) {
        return registroList.stream()
                .filter(registro -> registro.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Registro> encontrarTodo() {
        return registroList;
    }

    @Override
    public void guardar(Registro registro) {
        registroList.add(registro);
    }

    @Override
    public void actualizar(Registro registro) {
        Registro dataVieja = encontrarId(registro.getId());
        if (dataVieja != null){
            registroList.remove(dataVieja);
            registroList.add(registro);
        }
    }

    @Override
    public void borrar(Registro registro) {
        registroList.remove(registro);
    }
}