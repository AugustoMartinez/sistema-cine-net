package cine.cinelugar;

import java.io.Serializable;
import java.util.UUID;

public class Sala implements Serializable, Cloneable {

    private Integer id;
    private String nombre;
    private Butaca[][] butacas;
    private Integer capacidad;
    private Integer filas;
    private Integer columnas;
    private Boolean atmos;
    private Boolean disponible;
    private Boolean baja;
    private String idOculta;

    public Sala() {
        this.id = Cine.getListaSalas().size() + 1;
        this.nombre = "Sala " + id;
        this.capacidad = 0;
        this.filas = 10;
        this.columnas = 18;
        this.butacas = new Butaca[filas][columnas];
        this.atmos = false;
        this.disponible = false;
        this.baja = false;
        this.idOculta = UUID.randomUUID().toString();
        inicializarButacas();
    }

    private void inicializarButacas() {
        for (int i = 0; i < butacas.length; i++) {
            for (int j = 0; j < butacas[i].length; j++) {
                butacas[i][j] = new Butaca(i, j);
            }
        }
    }

    @Override
    public String toString() {
        return "Sala: "
                + "\n   id" + id
                + "\n   nombre=" + nombre
                + "\n   butacas=" + butacas
                + "\n   capacidad=" + capacidad
                + "\n   filas=" + filas
                + "\n   columnas=" + columnas
                + "\n   atmos=" + atmos
                + "\n   disponible=" + disponible
                + "\n   baja=" + baja
                + "\n   idOculta=" + idOculta;
    }

    public boolean salaOcupada(){
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                if(!butacas[i][j].isOcupada()){
                    return false;
                }
            }
        }
        
        return true;
    }
    
    public Integer getFilas() {
        return filas;
    }

    public void setFilas(Integer filas) {
        this.filas = filas;
    }

    public Integer getColumnas() {
        return columnas;
    }

    public void setColumnas(Integer columnas) {
        this.columnas = columnas;
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
    public Object clone() throws CloneNotSupportedException {
        Sala salaCopia = (Sala) super.clone();
        salaCopia.butacas = new Butaca[this.filas][this.columnas];

        for (int i = 0; i < this.filas; i++) {
            for (int j = 0; j < this.columnas; j++) {
                salaCopia.butacas[i][j] = (Butaca) this.butacas[i][j].clone();
            }
        }

        return salaCopia;
    }

}
