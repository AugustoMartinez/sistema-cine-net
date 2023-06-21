package cine.user;

import cine.cinelugar.Reserva;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario{
    private List listaReserva;
    public Cliente(String email, String password, String nombre, String apellido) {
        super(email, password, nombre, apellido);
        this.listaReserva = new ArrayList<Reserva>();
    }

    public Cliente() {
        super("","","","");
        this.listaReserva = new ArrayList<Reserva>();
    }

    public void agregarReserva(Reserva reserva){
        this.listaReserva.add(reserva);
    }
    
    @Override
    public void logeo() {

    }

    public void registrar(){

    }

    public void reservarFuncion(){

    }
}
