/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cine.cinelugar;

/**
 *
 * @author horus
 */
public class Pelicula {
    private String nombre;
    private boolean baja;
    private Genero genero;
    private Set tipo = new HashSet<String>();
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

    public void darBaja(boolean baja) {
        this.baja = baja;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
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

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
    }

    public Date getFechaEstreno() {
        return fechaEstreno;
    }

}
