package cine.cinelugar;

import cine.Costos;

public class Reserva {
    private Funcion funcion;
    private Butaca butaca;
    private Integer numTicket;
    private Costos costos;
    private Sala sala;

    public Reserva(Funcion funcion, Butaca butaca, Integer numTicket, Costos costos, Sala sala) {
        this.funcion = funcion;
        this.butaca = butaca;
        this.numTicket = numTicket;
        this.costos = costos;
        this.sala = sala;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }

    public Butaca getButaca() {
        return butaca;
    }

    public void setButaca(Butaca butaca) {
        this.butaca = butaca;
    }

    public Integer getNumTicket() {
        return numTicket;
    }

    public void setNumTicket(Integer numTicket) {
        this.numTicket = numTicket;
    }

    public Costos getCostos() {
        return costos;
    }

    public void setCostos(Costos costos) {
        this.costos = costos;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
    
}
