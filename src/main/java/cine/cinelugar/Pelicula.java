package cine.cinelugar;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Pelicula implements Serializable{
    private String nombre;
    private boolean baja;
    private String genero;
    private HashSet<String> tipo;
    private Integer duracion;
    private String descripcion;
    private String clasificacion;
    private Date fechaEstreno;

    public Pelicula(String nombre, String genero, Integer duracion, String descripcion, String clasificacion, Date fechaEstreno) {
        this.nombre = nombre;
        this.genero = genero;
        this.duracion = duracion;
        this.descripcion = descripcion;
        this.clasificacion = clasificacion;
        this.fechaEstreno = fechaEstreno;
        this.tipo = new HashSet();
    }

    public Pelicula() {
        this.tipo = new HashSet();
    }

    @Override
    public String toString() {
        return "Pelicula" + 
                "\nNombre: " + nombre + 
                "\nGenero: " + genero + 
                "\nDuración: " + duracion +
                "\nTipo: " + tipo + 
                "\nClasificación: " + clasificacion +
                "\nEstreno: " + fechaEstreno +
                "\nDescripción: " + descripcion  ;
    }
    
    
    public void agregarTipo(String tipo){
        this.tipo.add(tipo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isBaja() {
        return baja;
    }

    public void setBaja(boolean baja) {
        this.baja = baja;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public HashSet<String> getTipo() {
        return tipo;
    }

    public void setTipo(HashSet<String> tipo) {
        this.tipo = tipo;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public Date getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(Date fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }
}
