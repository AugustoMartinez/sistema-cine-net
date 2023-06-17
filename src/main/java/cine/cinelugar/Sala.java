package cine.cinelugar;

import java.util.ArrayList;
import java.util.List;

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
