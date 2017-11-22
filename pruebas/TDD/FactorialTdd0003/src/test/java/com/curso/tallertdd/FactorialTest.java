/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.tallertdd;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Chema
 */
public class FactorialTest {

    @Test
    public void factorialDeCeroDebeValerUno() {
        Calculador c = new Calculador();
        assertEquals(1, c.factorial(0));
    }

    @Test
    public void factorialDeUnoDebeValerUno() {
        Calculador c = new Calculador();
        assertEquals(1, c.factorial(1));
    }

    @Test
    public void factorialDeDosDebeValerDos() {
        Calculador c = new Calculador();
        assertEquals(2, c.factorial(2));
    }

    @Test
    public void factorialDeTresDebeValerSeis() {
        Calculador c = new Calculador();
        assertEquals(6, c.factorial(3));
    }
}