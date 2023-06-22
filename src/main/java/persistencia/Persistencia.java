package persistencia;

import cine.cinelugar.*;
import cine.user.Usuario;
import java.util.ArrayList;
import java.util.List;

public class Persistencia {
    public static String datosFile="Datos";
    public static String usuarioFile="Usuarios";
    public static String peliculaFile="Peliculas";
    public static String funcionFile="Funciones";
    public static String salaFile="Salas";
    public static String reservasFile="Reservas";
    
    public static void leerDatos(){
        PersistenceCollecion<String> datosPersistenceCollecion=new PersistenceCollecion<>();
        PersistenceCollecion<Usuario> usuarioPersistenceCollecion = new PersistenceCollecion<>();
        PersistenceCollecion<Pelicula> peliculaPersistenceCollecion = new PersistenceCollecion<>();
        PersistenceCollecion<Funcion> funcionPersistenceCollecion = new PersistenceCollecion<>();
        PersistenceCollecion<Sala> salaPersistenceCollecion = new PersistenceCollecion<>();
        try{
            List<String> listaDatos=new ArrayList<>();
            listaDatos=datosPersistenceCollecion.ReadFromFile(datosFile);
            Cine.setDireccion(listaDatos.get(0));
            Cine.setNombre(listaDatos.get(1));
        }catch (Exception e){
            System.out.println("Algo se rompio al leer los datos del cine");
        }    
        
        try{
            Cine.setListaUsuarios(usuarioPersistenceCollecion.ReadFromFile(usuarioFile));
        }catch (Exception e){
            System.out.println("Algo se rompio al leer los datos de los usuarios");
        }  
        
        try{
            Cine.setListaPeliculas(peliculaPersistenceCollecion.ReadFromFile(peliculaFile));
        }catch (Exception e){
            System.out.println("Algo se rompio al leer los datos de la pelicula");
        }  
        
        try{
            Cine.setListaFunciones(funcionPersistenceCollecion.ReadFromFile(funcionFile));
        }catch (Exception e){
            System.out.println("Algo se rompio al leer los datos de las funciones");
        }  
        
        try{
            Cine.setListaSalas(salaPersistenceCollecion.ReadFromFile(salaFile));
        }catch (Exception e){
            System.out.println("Algo se rompio al leer los datos de las salas");
        }  
    }
    
    public static void actualizarDatosCine(){
        List<String> datosCine=new ArrayList<>();
        datosCine.add(Cine.getDireccion());
        datosCine.add(Cine.getNombre());
        PersistenceCollecion<String> datosPersistenceCollecion = new PersistenceCollecion<>();
        try {
            datosPersistenceCollecion.WriteIntoFile(datosCine, datosFile);
        } catch (Exception e) {
            System.out.println("Fallo la carga de datos del cine");
        }
    }
    
    public static void actualizarUsuarios(){
        List<Usuario> listaUsuarios=new ArrayList<>();
        listaUsuarios=Cine.getListaUsuarios();
        PersistenceCollecion<Usuario> usuariosPersistenceCollecion = new PersistenceCollecion<>();
        try {
            usuariosPersistenceCollecion.WriteIntoFile(listaUsuarios, usuarioFile);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void actualizarPeliculas(){
        PersistenceCollecion<Pelicula> peliculaPersistenceCollecion = new PersistenceCollecion<>();
        try {
            peliculaPersistenceCollecion.WriteIntoFile(Cine.getListaPeliculas(), peliculaFile);
        } catch (Exception e) {
            System.out.println("Fallo la carga de peliculas");
        }
    }
    
    public static void actualizarFunciones(){
        PersistenceCollecion<Funcion> funcionesPersistenceCollecion = new PersistenceCollecion<>();
        try {
            funcionesPersistenceCollecion.WriteIntoFile(Cine.getListaFunciones(), funcionFile);
        } catch (Exception e) {
            System.out.println("Fallo la carga de funciones");
        }
    }
    
    public static void actualizarSalas(){
        PersistenceCollecion<Sala> salasPersistenceCollecion = new PersistenceCollecion<>();
        try {
            salasPersistenceCollecion.WriteIntoFile(Cine.getListaSalas(), salaFile);
        } catch (Exception e) {
            System.out.println("Fallo la carga de salas");
        }
    }
    
    
}
