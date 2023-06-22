package cine.cinelugar;

import cine.Costos;
import java.io.Serializable;
import java.util.LinkedList;

public class Reserva implements Serializable{
    private String funcion;
    private LinkedList<String> butaca;
    private Integer numTicket;
    private Integer costos;
    private String sala;

    public Reserva(String funcion, LinkedList<String> butaca, Integer numTicket, String sala) {
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
            if(funcion.contains(e.getTipo())){
                costo=e.getCosto();
            }
        }
        
        return costo*butaca.size();
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
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

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
    
}
