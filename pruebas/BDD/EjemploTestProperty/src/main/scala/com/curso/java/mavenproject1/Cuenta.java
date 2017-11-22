/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.java.mavenproject1;

/**
 *
 * @author usuario
 */
public class Cuenta {

    private Double balance = 0.0;

    public Double saldo() {
        return balance;
    }

    public void ingresar(Double cantidad) {
        balance += cantidad;
    }

    public void reintegrar(Double cantidad) {
        if (balance - cantidad < 0) {
            throw new IllegalStateException("No hay dinero");
        } else {
            balance -= cantidad;
        }

    }
}
