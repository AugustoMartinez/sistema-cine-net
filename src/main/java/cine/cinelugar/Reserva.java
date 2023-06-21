package cine.cinelugar;

import cine.Costos;
import java.util.LinkedList;

public class Reserva {
    private Funcion funcion;
    private LinkedList<String> butaca;
    private Integer numTicket;
    private Integer costos;
    private Sala sala;

    public Reserva(Funcion funcion, LinkedList<String> butaca, Integer numTicket, Sala sala) {
        this.funcion = funcion;
        this.butaca = butaca;
        this.numTicket = numTicket;
        this.sala = sala;
        this.costos=generarCosto();
    }

    public Reserva() {
       
    }
    
    private Integer generarCosto(){
        int costo=0;
        
        for(Costos e: Costos.values()){
            if(funcion.getNombre().contains(e.getTipo())){
                costo=e.getCosto();
            }
        }
        
        return costo*butaca.size();
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }

    public LinkedList<String> getButaca() {
        return butaca;
    }

    public void setButaca(LinkedList<String> butaca) {
        this.butaca = butaca;
    }

    public Integer getNumTicket() {
        return numTicket;
    }

    public void setNumTicket(Integer numTicket) {
        this.numTicket = numTicket;
    }

    public Integer getCostos() {
        return costos;
    }

    public void setCostos(Integer costos) {
        this.costos = costos;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
    
}
