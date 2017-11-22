/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.tallertdd;

/**
 *
 * @author Chema
 */
class Calculador {

    int factorial(int valor) {
        if (valor < 0) {
            throw new UnsupportedOperationException();
        } else if (valor < 2) {
            return 1;
        } else {
            return valor * factorial(valor - 1);
        }
    }
}
