package cine.cinelugar;

import cine.Horario;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

public class Funcion implements Serializable {

    private String nombre; //nombre + tipo
    private Sala sala;
    private Sala salaCopia;
    private Pelicula pelicula;
    private Horario horario;
    private Date dia;
    private UUID idOculta;

    public Funcion(String nombre, Sala sala, Pelicula pelicula) {
        this.nombre = nombre;
        this.sala = sala;
        this.pelicula = pelicula;
        this.dia = new Date();
        this.idOculta= UUID.randomUUID();
    }

    public Funcion() {
        this.dia = new Date();
    }

    @Override
    public String toString() {
        return "Funcion."
                + "\nNombre: " + nombre
                + "\nSala: " + sala
                + "\nSala copia: "+ salaCopia;
                //+ "\nPelicula: " + pelicula
                //+ "\nHorario: " + horario;
    }
    
    public Sala retornaSalaCopia(Sala sala){
        Sala salaAgregar = new Sala();
        salaAgregar.setAtmos(this.sala.getAtmos());
        salaAgregar.setBaja(this.sala.getBaja());
        salaAgregar.setButacas(this.sala.getButacas());
        salaAgregar.setCapacidad(this.sala.getCapacidad());
        salaAgregar.setColumnas(this.sala.getColumnas());
        salaAgregar.setFilas(this.sala.getFilas());
        salaAgregar.setId(this.sala.getId());
        salaAgregar.setNombre(this.sala.getNombre());
        salaAgregar.setDisponible(this.sala.getDisponible());
        
        return salaAgregar;
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

    public Sala getSalaCopia() {
        return salaCopia;
    }

    public void setSalaCopia(Sala salaCopia) {
        this.salaCopia = salaCopia;
    }

    public UUID getIdOculta() {
        return idOculta;
    }

    public void setIdOculta(UUID idOculta) {
        this.idOculta = idOculta;
    }
    
    
}
