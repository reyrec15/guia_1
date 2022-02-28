package com.company;
import javax.swing.JOptionPane;

public class Ejercicio_3 {
    public static void main (String[] args){
        // TODO code application logic here
        String leer;
        double sueldo, mayor=0,menor=10000;
        int i=1, contador=0;
        JOptionPane.showMessageDialog(null,
                "A continuación deberá ingresar el salario de 5 empleados. ",
                "Alerta",
                JOptionPane.WARNING_MESSAGE);
        while(i<=5)
        {
            leer= JOptionPane.showInputDialog("Ingrese el Sueldo del Empleado " +i);
            sueldo= Double.parseDouble(leer);
            if (sueldo < 0){
                JOptionPane.showMessageDialog(null,
                        "El salario de un empleado no puede ser negativo. ",
                        "Alerta",
                        JOptionPane.WARNING_MESSAGE);
            }
            else{
                if(sueldo>300)
                    contador= contador + 1;
                if(sueldo>mayor)
                    mayor=sueldo;
                if(sueldo<menor)
                    menor=sueldo;
                i=i+1;
            }

        }
        JOptionPane.showMessageDialog(null, " El sueldo Mayor es de $: " + mayor +
                "\nEl sueldo Menor es de $: " + menor +
                "\n"+ contador + " Empleados tienen un sueldo mayor de $300");
    }



}
