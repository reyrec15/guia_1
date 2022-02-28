package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	Ejercicio 1
	Al ingresar la nota de un alumno, se desea saber si este aprobó o no una materia
    en el colegio. Para aprobar se necesita una nota mayor o igual a 7.0. Diseñe una
    aplicación en Java que al ingresar la nota muestre con un mensaje en el cual
    indique si el alumno aprobó o no. Además, si la nota está entre 6.50 y 6.99, tiene la
    posibilidad de realizar un examen de suficiencia para aprobar
	 */

        Float nota = 0.00F;
        String nom;

        Scanner in = new Scanner(System.in);
        System.out.println("Por favor ingrese el nombre del alumno:");
        nom = in.nextLine();

        System.out.println("Por favor ingrese la nota de: " + nom);
        //nota = in.nextInt();
        nota = in.nextFloat();

        if(nota >= 7.00){
            System.out.println(nom + " ha aprobado!");
        }
        else if (nota >= 6.50 && nota <= 6.99){
            System.out.println(nom + " tiene la posibilidad de realizar un examen de suficiencia para aprobar");
        }
        else{
            System.out.println(nom + " ha reprobado.... :(");
        }


    }
}
