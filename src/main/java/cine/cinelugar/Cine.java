package cine.cinelugar;

import cine.user.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Cine {

    private static String direccion = "";
    private static List<Sala> listaSalas = new ArrayList<>();
    private static List<Pelicula> listaPeliculas = new ArrayList<>();
    private static String nombre = "";
    private static List<Funcion> listaFunciones = new ArrayList<>();
    private static List<Usuario> listaUsuarios = new ArrayList<>();

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

    //=============================== GESTION USUARIO ===============================
    public static boolean buscarUsuarioPorEmail(String email) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    public static Cliente retornaClientePorEmail(String email) {

        for (Usuario usuario : listaUsuarios) {
            if (usuario.getEmail().equals(email) && usuario instanceof Cliente) {
                return (Cliente) usuario;
            }
        }
        return null;
    }

    public static void reemplazarCliente(Cliente cliente) {
        Boolean flag = false;
        for (int i = 0; i < listaUsuarios.size() && !flag; i++) {
            if (listaUsuarios.get(i).getEmail().equals(cliente.getEmail())) {
                listaUsuarios.set(i, cliente);

                flag = true;
            }
        }
    }

    public static boolean validarLoginYCargarSesion(String email, String contraseña) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getEmail().equals(email) && usuario.getPassword().equals(contraseña)) {

                if (usuario instanceof Cliente) {
                    Sesion.setTipo("Cliente");
                } else if (usuario instanceof Gerente) {
                    Sesion.setTipo("Gerente");
                } else if (usuario instanceof Admin) {
                    Sesion.setTipo("Admin");
                }
                return true;
            }
        }
        return false;
    }

    //=============================== FUNCIONES DE RETORNO ===============================
    public static Funcion retornaFuncion(String nombre) {
        for (Funcion funcion : Cine.getListaFunciones()) {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            String funcStr = funcion.getNombre() + " | " + format.format(funcion.getDia()) + " | " + funcion.getHorario().getHorario();
            if (funcStr.equals(nombre)) {
                return funcion;
            }
        }
        return null;
    }

    public static Pelicula retornaPelicula(String nombre) {
        for (Pelicula pelicula : Cine.getListaPeliculas()) {
            if (nombre.contains(pelicula.getNombre())) {
                return pelicula;
            }
        }
        return null;
    }

    public static Sala retornaSala(String nombre) {
        for (Sala sala : Cine.getListaSalas()) {
            if (nombre.equals(sala.getNombre())) {
                if (!sala.getDisponible()) {
                    return sala;
                } else {
                    JOptionPane.showMessageDialog(null, "La sala seleccionada no está disponible");
                    return null;
                }
            }
        }
        return null;
    }

}
