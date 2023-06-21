package cine.cinelugar;

import cine.Horario;
import java.io.Serializable;
import java.util.Date;

public class Funcion implements Serializable {

    private String nombre; //nombre + tipo
    private Sala sala;
    private Pelicula pelicula;
    private Horario horario;
    private Date dia;

    public Funcion(String nombre, Sala sala, Pelicula pelicula) {
        this.nombre = nombre;
        this.sala = sala;
        this.pelicula = pelicula;
        this.dia = new Date();
    }

    public Funcion() {
        this.dia = new Date();
    }

    @Override
    public String toString() {
        return "Funcion."
                + "\nNombre: " + nombre
                + "\nSala: " + sala
                + "\nPelicula: " + pelicula
                + "\nHorario: " + horario;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

}
