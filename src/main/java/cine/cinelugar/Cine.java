package cine.cinelugar;

import cine.user.Usuario;
import java.util.ArrayList;
import java.util.List;

public class Cine {
    private static String direccion="";
    private static List<Sala> listaSalas= new ArrayList<>();
    private static List<Pelicula> listaPeliculas= new ArrayList<>();
    private static String nombre="";
    private static List<Funcion> listaFunciones= new ArrayList<>();
    private static List<Usuario> listaUsuarios= new ArrayList<>();

    public Cine() {
        
    }
    

    public static String getDireccion() {
        return direccion;
    }

    public static void setDireccion(String direccion) {
        Cine.direccion = direccion;
    }

    public static List<Sala> getListaSalas() {
        return listaSalas;
    }

    public static void setListaSalas(List<Sala> listaSalas) {
        Cine.listaSalas = listaSalas;
    }

    public static List<Pelicula> getListaPeliculas() {
        return listaPeliculas;
    }

    public static void setListaPeliculas(List<Pelicula> listaPeliculas) {
        Cine.listaPeliculas = listaPeliculas;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Cine.nombre = nombre;
    }

    public static List<Funcion> getListaFunciones() {
        return listaFunciones;
    }

    public static void setListaFunciones(List<Funcion> listaFunciones) {
        Cine.listaFunciones = listaFunciones;
    }

    public static List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public static void setListaUsuarios(List<Usuario> listaUsuarios) {
        Cine.listaUsuarios = listaUsuarios;
    }
    
    public static boolean buscarUsuarioPorEmail(String email) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }
    
}
