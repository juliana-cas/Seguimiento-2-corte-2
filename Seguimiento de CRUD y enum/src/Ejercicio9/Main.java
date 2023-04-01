package Ejercicio9;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
public class Main {

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("carro");
        list.add("moto");
        list.add("futbol");
        list.add("golpes");

        for(Object element : list){
            System.out.println(element);
        }}
}