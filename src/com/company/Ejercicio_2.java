package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class Ejercicio_2 {
    public static void main (String[] args){
        int min = 1;
        int max = 3;
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);

        if (randomNum == 1){
            System.out.println("No tiene descuento");
        }
        else if (randomNum == 2){
            System.out.println("Tiene un 5% de descuento");
        }
        else if (randomNum == 3){
            System.out.println("Tiene un 10% de descuento");
        }


        System.out.println(randomNum);

    }
}
