/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.curso.easybmaven0001;

/**
 *
 * @author jose maria
 */
public class Cuenta0002 {
    private Double balance = 0.0;

    public Cuenta0002() {
    }

    public void ingresar(Double cantidad) {
        balance += cantidad;
    }

    public Double getBalance() {
        return balance;
    }
}
