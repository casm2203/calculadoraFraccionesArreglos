/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author SAGICC
 */
public class arreglos extends Calculadora {

    Scanner in = new Scanner(System.in);

    private double array1[] = new double[4];
    private double array2[] = new double[4];
    private double resultado[] = new double[4];

    public double[] getArray1() {
        return array1;
    }

    public void setArray1(double[] array1) {
        this.array1 = array1;
    }

    public double[] getArray2() {
        return array2;
    }

    public void setArray2(double[] array2) {
        this.array2 = array2;
    }

    public double[] getResultado() {
        return resultado;
    }

    public void setResultado(double[] resultado) {
        this.resultado = resultado;
    }

    public void llenarArray1() {
        for (int i = 0; i < array1.length; i++) {
            System.out.print("-Ingrese el número en la posición:" + (i) + ": ");
            this.array1[i] = in.nextInt();
        }
    }

    public void llenarArray2() {
        for (int i = 0; i < array1.length; i++) {
            System.out.print("+Ingrese el número en la posición:" + (i) + ": ");
            this.array2[i] = in.nextInt();
        }
    }

    @Override
    public void suma() {
        for (int i = 0; i < this.resultado.length; i++) {
            this.resultado[i] = this.array1[i] + this.array2[i];
            System.out.println("+Indice : " + i + " Resultado: " + resultado[i]);
        }
    }

    @Override
    public void resta() {
        for (int i = 0; i < resultado.length; i++) {
            this.resultado[i] = this.array1[i] - this.array2[i];
            System.out.println("-Indice : " + i + " Resultado: " + resultado[i]);
        }

    }

    @Override
    public void producto() {
        for (int i = 0; i < resultado.length; i++) {
            this.resultado[i] = this.array1[i] * this.array2[i];
            System.out.println("-Indice : " + i + " Resultado: " + resultado[i]);
        }
    }

    @Override
    public void div() {
        for (int i = 0; i < resultado.length; i++) {
            this.resultado[i] = this.array1[i] / this.array2[i];
            System.out.println("-Indice : " + i + " Resultado: " + resultado[i]);
        }
    }

    @Override
    void mostrar() {
        System.out.println("---Utilizaste las funciones de la calculadora de arreglos---");
    }
}
