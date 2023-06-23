package cine.user;

import cine.cinelugar.Reserva;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente extends Usuario {

    private List<Reserva> listaReserva;

    public Cliente(String email, String password, String nombre, String apellido) {
        super(email, password, nombre, apellido);
        this.listaReserva = new ArrayList<Reserva>();
    }

    public Cliente() {
        super("", "", "", "");
        this.listaReserva = new ArrayList<Reserva>();
    }

    public void agregarReserva(Reserva reserva) {
        this.listaReserva.add(reserva);
    }

    public List<Reserva> getListaReserva() {
        return listaReserva;
    }

    public void setListaReserva(List<Reserva> listaReserva) {
        this.listaReserva = listaReserva;
    }

    
    public String retornaStringListaReservas() {
    String txt = "";
    LocalDate fechaActual = LocalDate.now();
    LocalTime horaActual = LocalTime.now();

    for (int i = 0; i < listaReserva.size(); i++) {
        Date fechaReserva = listaReserva.get(i).getFuncion().getDia();
        String horita = listaReserva.get(i).getFuncion().getHorario().getHorario();

        // Convertir la fecha de reserva a LocalDate
        LocalDate fechaReservaLocalDate = fechaReserva.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        // Obtener la hora y los minutos de la hora de reserva
        int hora = Integer.parseInt(horita.substring(0, 2));
        int minutos = Integer.parseInt(horita.substring(3, 5));

        // Crear el objeto LocalTime para la hora de reserva
        LocalTime horaReserva = LocalTime.of(hora, minutos);

        // Comparar la fecha y la hora con la fecha y la hora actual
        if (fechaReservaLocalDate.isAfter(fechaActual) || (fechaReservaLocalDate.isEqual(fechaActual) && horaReserva.isAfter(horaActual))) {
            txt += listaReserva.get(i).toString();
            if (i < listaReserva.size() - 1) {
                txt += "\n\n";
            }
        }
    }
    return txt;
}

    @Override
    public void logeo() {

    }
}
