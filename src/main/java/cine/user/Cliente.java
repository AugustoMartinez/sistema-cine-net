/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cine.user;

import cine.cinelugar.Reserva;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author horus
 */
public class Cliente extends Usuario{
    List listaReserva = new ArrayList<Reserva>();
    public Cliente(String email, String password, String nombre, String apellido) {
        super(email, password, nombre, apellido);
    }

    @Override
    public void logeo() {

    }

    public void registrar(){

    }

    public void reservarFuncion(){

    }
}
