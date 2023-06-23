package cine.cinelugar;

import cine.Costos;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.LinkedList;

public class Reserva implements Serializable {

    private Funcion funcion;
    private LinkedList<String> butaca;
    private Integer numTicket;
    private Integer costos;
    private final SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    public Reserva(Funcion funcion, LinkedList<String> butaca, Integer numTicket) {
        this.funcion = funcion;
        this.butaca = butaca;
        this.numTicket = numTicket;
        this.costos = generarCosto();
    }

    public Reserva() {

    }

    @Override
    public String toString() {
        String str = "";
        Funcion aux;

        str += "Nombre: " + funcion.getNombre() + "\n"
                + "Horario: " + funcion.getHorario().getHorario() + "\n"
                + "Fecha: " + format.format(funcion.getDia()) + "\n"
                + "Butacas:\n"; 
        
        str+=this.agregarButacas();

        

        return str;
    }

    private Integer generarCosto() {
        int costo = 0;

        for (Costos e : Costos.values()) {
            if (funcion.getNombre().contains(e.getTipo())) {
                costo = e.getCosto();
            }
        }

        return costo * butaca.size();
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

    private String agregarButacas() {
        String texto = "";

        for (int i = 0; i < butaca.size(); i++) {
            texto += ("Butaca " + (i + 1) + " " + butaca.get(i) + "\n");
        }

        return texto;
    }
}
