package cine.cinelugar;


import cine.Clasificacion;
import cine.Genero;
import excepciones.CampoVacioException;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Pelicula {
    private String nombre;
    private boolean baja;
    private Genero genero;
    private Set tipo;
    private Integer duracion;
    private String descripcion;
    private Clasificacion clasificacion;
    private Date fechaEstreno;

    public Pelicula(String nombre, Genero genero, Integer duracion, String descripcion, Clasificacion clasificacion, Date fechaEstreno) {
        this.nombre = nombre;
        this.genero = genero;
        this.duracion = duracion;
        this.descripcion = descripcion;
        this.clasificacion = clasificacion;
        this.fechaEstreno = fechaEstreno;
        this.tipo = new HashSet();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws CampoVacioException{
        if(nombre.isEmpty()){
            throw new CampoVacioException("Nombre película");
        }else{
            this.nombre = nombre;
        }
    }

    public boolean isBaja() {
        return baja;
    }

    public void darBaja(boolean baja) {
        this.baja = baja;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) throws CampoVacioException{
        if(genero.toString().isEmpty()){
            throw new CampoVacioException("Genero");
        }
        this.genero = genero;
    }

    public void agregarTipo(String tipo) {
        this.tipo.add(tipo);
    }

    public void quitarTipo(String tipo) {
        this.tipo.remove(tipo);
    }

    public Integer getDuracion() {
        return duracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) throws CampoVacioException{
        if(descripcion.isEmpty()){
            throw new CampoVacioException(nombre);
        }
        this.descripcion = descripcion;
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
    }

    public Date getFechaEstreno() {
        return fechaEstreno;
    }

    public Set getTipo() {
        return tipo;
    }

    public void setTipo(Set tipo) throws CampoVacioException{
        if(tipo.isEmpty()){
            throw new CampoVacioException(nombre);
        }else{
            this.tipo = tipo;
        }
    }

}