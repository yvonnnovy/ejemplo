/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.curso.practicatest;

import java.util.Objects;

/**
 *
 * @author usuario
 */
public class Mensaje {
    
    private String texto;

    /**
     * Get the value of texto
     *
     * @return the value of texto
     */
    public String getTexto() {
        return texto;
    }

    /**
     * Set the value of texto
     *
     * @param texto new value of texto
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.texto);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mensaje other = (Mensaje) obj;
        return Objects.equals(this.texto, other.texto);
    }

    @Override
    public String toString() {
        return "Mensaje{" + "texto=" + texto + '}';
    }

}
