package cine.cinelugar;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;


public class Pelicula implements Serializable{
    private String nombre;
    private boolean baja;
    private String genero;
    private HashMap<String, Boolean> tipo;
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
        this.setearTipos();
        this.baja=false;
    }

    public Pelicula() {
        this.setearTipos();
        this.baja=false;
    }

    @Override
    public String toString() {
        return "Pelicula" + 
                "\nNombre: " + nombre + 
                "\nGenero: " + genero + 
                "\nDuración: " + duracion +
                "\nTipo: " +  tipo +
                "\nClasificación: " + clasificacion +
                "\nEstreno: " + fechaEstreno +
                "\nDescripción: " + descripcion  ;
    }
    
    public void agregarTipo(boolean tipo, String str){
        this.tipo.put(str, tipo);
    }

    private void setearTipos(){
        this.tipo = new HashMap<>();
        this.tipo.put("2D", false);
        this.tipo.put("2D ATMOS", false);
        this.tipo.put("3D", false);
        this.tipo.put("3D ATMOS", false);
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

    public HashMap<String, Boolean> getTipo() {
        return tipo;
    }

    public void setTipo(HashMap<String, Boolean> tipo) {
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
