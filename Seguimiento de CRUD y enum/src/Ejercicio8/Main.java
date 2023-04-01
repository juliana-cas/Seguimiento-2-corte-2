package Ejercicio8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        names.add("Juan");
        names.add("Natalia");
        names.add("Sandra");

        System.out.println(names);

        names.set(2,"Juliana");

        System.out.println("nombre añadido en posicion 2: "+names);


    }
}