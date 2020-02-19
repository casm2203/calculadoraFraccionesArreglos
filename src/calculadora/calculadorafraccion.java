/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author csuarez25
 */
public class calculadorafraccion extends Calculadora {

    private fraccion f1;
    private fraccion f2;

    public calculadorafraccion() {
        this.f1 = null;
        this.f2 = null;
    }

    public fraccion getF1() {
        return f1;
    }

    public void setF1(fraccion f1) {
        this.f1 = f1;
    }

    public fraccion getF2() {
        return f2;
    }

    public void setF2(fraccion f2) {
        this.f2 = f2;
    }

    @Override
    public void suma() {
        double resultadon = (f1.getNumerador() * f2.getDenominador()) + (f1.getDenominador() * f2.getNumerador());
        double resultadod = (f1.getDenominador() * f2.getDenominador());
        double total = resultadon / resultadod;
        System.out.println(total);
    }

    @Override
    public void resta() {
        double resultadon = (f1.getNumerador() * f2.getDenominador()) - (f1.getDenominador() * f2.getNumerador());
        double resultadod = (f1.getDenominador() * f2.getDenominador());
        double total = resultadon / resultadod;
        System.out.println(total);
    }

    @Override
    public void producto() {

        double resultadon = (f1.getNumerador() * f2.getNumerador());
        double resultadod = (f1.getDenominador() * f2.getDenominador());
        double total = resultadon / resultadod;
        System.out.println(total);
    }

    @Override
    public void div() {
        double resultadon = (f1.getNumerador() * f2.getDenominador());
        double resultadod = (f1.getDenominador() * f2.getNumerador());
        double total = resultadon / resultadod;
        System.out.println(total);
    }

    @Override
    public void mostrar() {
        System.out.println( "---Utilizaste las funciones de la calculadora de fracciones---");
    }

}
