/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplocapas.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author iconotc
 */
public class AritmeticaTest {

    @Test(timeout = 1000)
    public void forzarTimeoutTest(){
        System.out.println("Forzar un timeout");
        Aritmetica a = new Aritmetica();
        int resultado = a.forzarTimeout();
        assertEquals(0, resultado);
    }
    @Test
    public void testMediaValoresOk() {
        System.out.println("Media con valores correctos");
        List<Double> numeros = Arrays.asList(2.0, 2.0, 2.0);
        Aritmetica instance = new Aritmetica();
        Double expResult = 2.0;
        Double result = instance.media(numeros);
        assertEquals(expResult, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMediaListaNula() {
        System.out.println("Media con lista nula");
        List<Double> numeros = null;
        Aritmetica instance = new Aritmetica();
        instance.media(numeros);
    }

    @Test(expected = RuntimeException.class)
    public void testMediaValoresNegativos() {
        System.out.println("Media con valores negativos");
        List<Double> numeros = Arrays.asList(1.0, -1.0);
        Aritmetica instance = new Aritmetica();
        instance.media(numeros);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMediaListaVacia() {
        System.out.println("Media con la lista sin valores");
        List<Double> numeros = new ArrayList<>();
        Aritmetica instance = new Aritmetica();
        instance.media(numeros);
    }
}
