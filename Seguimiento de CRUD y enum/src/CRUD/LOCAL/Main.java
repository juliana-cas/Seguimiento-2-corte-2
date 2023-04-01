package CRUD.LOCAL;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String num = "1";
        ILocal loc = new LocalMetodos();
        while (num != "5"){
            Scanner s = new Scanner(System.in);
            System.out.println("\"Menu \n 1. Agregar  \n 2. Listar \n 3. Editar" +
                    "                    \n 4. Eliminar  \n 5. Salir");
            num = s.next();
            switch (num){
                case "1":{
                    System.out.println("id del local: ");
                    Integer id = s.nextInt();
                    System.out.println("Nombre Local: ");
                    String nombreLocal = s.next();
                    System.out.println("Dirección Local: ");
                    String direccion = s.next();
                    loc.guardar(new Local(id,nombreLocal,direccion));
                    break;
                }
                case "2":{
                    List<Local> localList = loc.encontrarTodo();
                    localList.forEach(System.out::println);
                    break;
                }
                case "3":{
                    System.out.println("EDITAR");
                    System.out.println("id del local: ");
                    Integer id = s.nextInt();
                    System.out.println("Ingrese nombre del local: ");
                    String nombreLocal = s.next();
                    System.out.println("ingrese la direccion del local: ");
                    String direccion = s.next();
                    loc.actualizar(new Local(id,nombreLocal,direccion));
                    break;
                }
                case "4":{
                    System.out.println("ELIMINAR");
                    System.out.println("ingrese el id del registro: ");
                    Integer id = s.nextInt();
                    loc.borrar(loc.encontrarId(id));
                    break;
                }
                case "5":{
                    num = "5";
                    break;
                }
            }
        }
    }
}