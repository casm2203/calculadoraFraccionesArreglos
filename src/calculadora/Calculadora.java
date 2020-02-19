/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author csuarez25
 */
public abstract class Calculadora {

    public abstract void suma(); //se puede tener metodos abstractos y realizar sobrecarga de metodos que es un tipo de polimorfismo

    public abstract void resta();

    public abstract void producto();

    public abstract void div();

    abstract void mostrar();

}
