package cine.user;

import cine.cinelugar.Reserva;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario{
    List listaReserva = new ArrayList<Reserva>();
    public Cliente(String email, String password, String nombre, String apellido) {
        super(email, password, nombre, apellido);
    }

    public Cliente() {
        super("","","","");
    }

    @Override
    public void logeo() {

    }

    public void registrar(){

    }

    public void reservarFuncion(){

    }
}
