package cine.cinelugar;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sala implements Serializable{
    private Integer id;
    private String nombre;
    private Butaca[][] butacas;
    private Integer capacidad;
    private Boolean atmos;
    private Boolean disponible;
    private Boolean baja;

    public Sala(int filas, int columnas) {
        this.id = Cine.getListaSalas().size()+1;
        this.nombre="Sala " + id;
        this.butacas=new Butaca[filas][columnas];
        this.capacidad=0;
        this.atmos=false;
        this.disponible=false;
        this.baja = false;
        inicializarButacas();
    }
    
    private void inicializarButacas() {
        for (int i = 0; i < butacas.length; i++) {
            for (int j = 0; j < butacas[i].length; j++) {
                butacas[i][j] = new Butaca(i, j);
            }
        }
    }

    public Boolean getBaja() {
        return baja;
    }

    public void setBaja(Boolean baja) {
        this.baja = baja;
    }
    

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
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

        @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Sala other = (Sala) obj;
        return Objects.equals(nombre, other.nombre);
    }
}
