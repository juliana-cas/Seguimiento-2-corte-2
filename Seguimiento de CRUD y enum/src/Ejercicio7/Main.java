package Ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();


        for (int i = 0; i <= 10; i++){
            num.add(i);
        }
        System.out.println(num);

        int numero = num.get(4);
        System.out.println("numero solo: "+ numero);

        int quitarNum = num.remove(2);
        System.out.println("numero removido: " + quitarNum);
        System.out.println(num);

    }
}