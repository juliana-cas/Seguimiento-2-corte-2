package CRUD.Taller;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String num = "1";
        IRegistro reg = new RegistroMetodos();
        while (num != "5"){
            Scanner s = new Scanner(System.in);
            System.out.println("\"Menu \n 1. Agregar  \n 2. Listar \n 3. Editar" + "\n 4. Eliminar  \n 5. Salir");
            num = s.next();
            switch (num){
                case "1":{
                    System.out.println("id del cliente: ");
                    Integer id = s.nextInt();
                    System.out.println("Nombre dueño del carro: ");
                    String nombreEmp = s.next();
                    System.out.println("Placa del carro: ");
                    String placa = s.next();
                    System.out.println("Color del carro: ");
                    String color = s.next();
                    reg.guardar(new Registro(id, nombreEmp, placa, color));
                    break;
                }
                case "2":{
                    List<Registro> RegistroList = reg.encontrarTodo();
                    RegistroList.forEach(System.out::println);
                    break;
                }
                case "3":{
                    System.out.println("EDITAR");
                    System.out.println("id del empleado: ");
                    Integer id = s.nextInt();
                    System.out.println("Ingrese nombre del empleado: ");
                    String nombreEmp = s.next();
                    System.out.println("ingrese el numero de cedula: ");
                    String placa = s.next();
                    System.out.println("Color del carro: ");
                    String color = s.next();
                    reg.actualizar(new Registro(id,nombreEmp,placa,color));
                    break;
                }
                case "4":{
                    System.out.println("ELIMINAR");
                    System.out.println("ingrese el id del registro: ");
                    Integer id = s.nextInt();
                    reg.borrar(reg.encontrarId(id));
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
