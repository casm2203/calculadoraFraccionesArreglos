/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;


/**
 *
 * @author csuarez25
 */
public class calcula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        fraccion f1 = new fraccion();        
        arreglos vector1 = new arreglos();
        System.out.println("---Calculadora de Fracciones---");

        System.out.println("-Ingresa los datos de la fraccion 1-");
        System.out.print("Ingresar el numerador de la fracción 1: ");
        int fracNume1 = in.nextInt();
        f1.setNumerador(fracNume1);

        System.out.print("Ingresar el denominador de la fracción 1: ");
        int fracDeno1 = in.nextInt();
        f1.setDenominador(fracDeno1);

        fraccion f2 = new fraccion();
        System.out.println("-Ingresa los datos de la fraccion 2-");
        System.out.print("Ingresar el numerador de la fracción 2: ");
        int fracNume2 = in.nextInt();
        f2.setNumerador(fracNume2);

        System.out.print("Ingresar el denominador de la fracción 2: ");
        int fracDeno2 = in.nextInt();
        f2.setDenominador(fracDeno2);

        calculadorafraccion calc1 = new calculadorafraccion();
        
        calc1.setF1(f1);
        calc1.setF2(f2);
        System.out.println("--Resultados--");
        System.out.print("La suma de los fracciones es: ");
        calc1.suma();
        System.out.print("La resta de los fracciones es: ");
        calc1.resta();
        System.out.print("El producto de los fracciones es: ");
        calc1.producto();
        System.out.print("La division de los fracciones es: ");
        calc1.div();
        calc1.mostrar();     
        
        
        System.out.println("---Calculadora de Arreglos---");

        

        System.out.println("-LLenar vector 1: ");
        vector1.llenarArray1();

        System.out.println("-LLenar vector 2: ");
        vector1.llenarArray2();
        System.out.println("-La suma de los vectores es: ");
        vector1.suma();
        System.out.println("-La resta de los vectores es: ");
        vector1.resta();
        System.out.println("-El producto de los vectores es: ");
        vector1.producto();
        System.out.println("-La division de los vectores es: ");
        vector1.div();
        vector1.mostrar();

    }

}
