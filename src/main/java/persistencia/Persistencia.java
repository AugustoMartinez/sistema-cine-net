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
            Cine.setListaUsuarios(usuarioPersistenceCollecion.ReadFromFile(usuarioFile));
            Cine.setListaPeliculas(peliculaPersistenceCollecion.ReadFromFile(peliculaFile));
            Cine.setListaFunciones(funcionPersistenceCollecion.ReadFromFile(funcionFile));
            Cine.setListaSalas(salaPersistenceCollecion.ReadFromFile(salaFile));
        }catch (Exception e){
            System.out.println("Algo se rompio al leer los datos");
        }    
    }
}
