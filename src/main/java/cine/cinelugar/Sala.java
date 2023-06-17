/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cine.cinelugar;

/**
 *
 * @author horus
 */
public class Sala {
    private Integer id;
    static private Integer idActual = 1;
    private List listaButacas = new ArrayList<Butaca>();
    private Integer capacidad;

    public Sala(Integer id, Integer capacidad) {
        this.id = ++Sala.idActual;
        this.capacidad = capacidad;
    }

    public Integer getId() {
        return id;
    }
    public void aniadirButaca(Butaca but) {
        this.listaButacas.add(but);
    }

    public void eliminarButaca(Butaca but) {
        this.listaButacas.remove(but);
    }

    public Integer getCapacidad() {
        return capacidad;
    }

}

