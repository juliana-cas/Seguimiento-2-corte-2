package CRUD.Empleados;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String num = "1";
        IEmpleados emp = new EmpleadosMetodos();
        while (num != "5"){
            Scanner s = new Scanner(System.in);
            System.out.println("\"Menu \n 1. Agregar  \n 2. Listar \n 3. Editar" + "\n 4. Eliminar  \n 5. Salir");
            num = s.next();
            switch (num){
                case "1":{
                    System.out.println("id del Empleado: ");
                    Integer id = s.nextInt();
                    System.out.println("Nombre Empleado: ");
                    String nombreEmp = s.next();
                    System.out.println("Numero de cedula: ");
                    int cedula = s.nextInt();
                    emp.guardar(new Empleados(id, nombreEmp, cedula));
                    break;
                }
                case "2":{
                    List<Empleados>empleadosList = emp.encontrarTodo();
                    empleadosList.forEach(System.out::println);
                    break;
                }
                case "3":{
                    System.out.println("EDITAR");
                    System.out.println("id del empleado: ");
                    Integer id = s.nextInt();
                    System.out.println("Ingrese nombre del empleado: ");
                    String nombreEmp = s.next();
                    System.out.println("ingrese el numero de cedula: ");
                    Integer cedula = s.nextInt();
                    emp.actualizar(new Empleados(id,nombreEmp,cedula));
                    break;
                }
                case "4":{
                    System.out.println("ELIMINAR");
                    System.out.println("ingrese el id del registro: ");
                    Integer id = s.nextInt();
                    emp.borrar(emp.encontrarId(id));
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