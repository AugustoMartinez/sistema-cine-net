package cine.cinelugar;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Sala implements Serializable{
    private Integer id;
    private String nombre;
    private Butaca[][] butacas;
    private Integer capacidad;
    private Boolean atmos;

    public Sala(int filas, int columnas) {
        this.id = Cine.getListaSalas().size()+1;
        this.nombre="Sala " + id;
        this.butacas=new Butaca[filas][columnas];
        this.capacidad=0;
        this.atmos=false;
        inicializarButacas();
    }
    
    private void inicializarButacas() {
        for (int i = 0; i < butacas.length; i++) {
            for (int j = 0; j < butacas[i].length; j++) {
                butacas[i][j] = new Butaca(i, j);
            }
        }
    }

    public Boolean getAtmos() {
        return atmos;
    }

    public void setAtmos(Boolean atmos) {
        this.atmos = atmos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
