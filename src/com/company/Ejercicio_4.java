package com.company;
import javax.swing.*;
import java.util.Scanner;

public class Ejercicio_4 {
    public static void main (String[] args){
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String leer;
        double sueldo, mayor=0,menor=10000;
        int total_numeros = 0;
        int i=1, contador=0;
        System.out.println("Ingrese el total de numeros que desea ingresar:");
        JOptionPane.showInputDialog("Ingrese el total de numeros que desea ingresar: ");
        total_numeros = in.nextInt();
        while(i<=total_numeros)
        {
            leer= JOptionPane.showInputDialog("Ingrese el Sueldo del Empleado " +i);
            sueldo= Double.parseDouble(leer);
            if(sueldo>300)
                contador= contador + 1;
            if(sueldo>mayor)
                mayor=sueldo;
            if(sueldo<menor)
                menor=sueldo;
            i=i+1;
        }
        JOptionPane.showMessageDialog(null, " El sueldo Mayor es de $: " + mayor +
                "\nEl sueldo Menor es de $: " + menor +
                "\n"+ contador + " Empleados tienen un sueldo mayor de $300");
    }
}
