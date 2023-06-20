package cine.cinelugar;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Sala implements Serializable{
    private Integer id;
    private String nombre;
    static private Integer idActual = 1;
    private Butaca[][] butacas;
    private Integer capacidad;

    public Sala(int filas, int columnas) {
        this.id = Sala.idActual;
        this.nombre="Sala " + id;
        idActual++;
        this.butacas=new Butaca[filas][columnas];
        this.capacidad=0;
        inicializarButacas();
    }
    
    private void inicializarButacas() {
        for (int i = 0; i < butacas.length; i++) {
            for (int j = 0; j < butacas[i].length; j++) {
                butacas[i][j] = new Butaca(i, j);
            }
        }
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static Integer getIdActual() {
        return idActual;
    }

    public static void setIdActual(Integer idActual) {
        Sala.idActual = idActual;
    }

    public Butaca[][] getButacas() {
        return butacas;
    }

    public void setButacas(Butaca[][] butacas) {
        this.butacas = butacas;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }
    
    

    public Integer getId() {
        return id;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

}
