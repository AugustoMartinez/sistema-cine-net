package cine.cinelugar;

import cine.user.Usuario;
import java.util.ArrayList;
import java.util.List;

public class Cine {
    private String direccion;
    private List<Sala> listaSalas;
    private List<Pelicula> listaPeliculas;
    private String nombre;
    private List<Funcion> listaFunciones;
    private List<Usuario> listaUsuarios;

    public Cine(String direccion, String nombre) {
        this.direccion = direccion;
        this.listaSalas = new ArrayList<>();
        this.listaPeliculas = new ArrayList<>();
        this.nombre = nombre;
        this.listaFunciones = new ArrayList<>();
        this.listaUsuarios = new ArrayList<>();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Sala> getListaSalas() {
        return listaSalas;
    }

    public void setListaSalas(List<Sala> listaSalas) {
        this.listaSalas = listaSalas;
    }

    public List<Pelicula> getListaPeliculas() {
        return listaPeliculas;
    }

    public void setListaPeliculas(List<Pelicula> listaPeliculas) {
        this.listaPeliculas = listaPeliculas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Funcion> getListaFunciones() {
        return listaFunciones;
    }

    public void setListaFunciones(List<Funcion> listaFunciones) {
        this.listaFunciones = listaFunciones;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    
    
    
    
    
    
}
