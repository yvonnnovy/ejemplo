/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.ejemplojwebunittest;

import static net.sourceforge.jwebunit.junit.JWebUnit.assertTitleEquals;
import static net.sourceforge.jwebunit.junit.JWebUnit.beginAt;
import static net.sourceforge.jwebunit.junit.JWebUnit.clickLink;
import static net.sourceforge.jwebunit.junit.JWebUnit.setBaseUrl;
import static net.sourceforge.jwebunit.junit.JWebUnit.setTextField;
import static net.sourceforge.jwebunit.junit.JWebUnit.submit;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author usuario
 */
public class AppJUnitTest {
    
    @Before
    public void prepare() {
        setBaseUrl("http://localhost:8084/EjemploJWebUnit");
    }

    @Test
    public void test1() {
        beginAt("index.jsp");
        clickLink("login");
        assertTitleEquals("Login");
        setTextField("nombreUsuario", "test");
        setTextField("nombreClave", "test123");
        submit();
        assertTitleEquals("Tres");
    }
}
