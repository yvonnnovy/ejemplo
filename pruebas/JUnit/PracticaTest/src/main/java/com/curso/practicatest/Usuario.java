/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.practicatest;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public class Usuario {

    private final List<Mensaje> enviados = new ArrayList<>();

    private final List<Mensaje> recibidos = new ArrayList<>();

    public void enviar(Mensaje m, Usuario destinatario) {
        destinatario.getRecibidos().add(m);
        enviados.add(m);
    }

    /**
     * Get the value of recibidos
     *
     * @return the value of recibidos
     */
    public List<Mensaje> getRecibidos() {
        return recibidos;
    }

    /**
     * Get the value of enviados
     *
     * @return the value of enviados
     */
    public List<Mensaje> getEnviados() {
        return enviados;
    }

}
