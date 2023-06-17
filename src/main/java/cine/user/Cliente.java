package cine.user;

import cine.cinelugar.Reserva;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cliente extends Usuario{
    List listaReserva = new ArrayList<Reserva>();
    public Cliente(String email, String password, String nombre, String apellido) {
        super(email, password, nombre, apellido);
    }

    public Cliente() {
    }

    @Override
    public void logeo() {

    }

    public void registrar(){

    }

    public void reservarFuncion(){

    }
}
