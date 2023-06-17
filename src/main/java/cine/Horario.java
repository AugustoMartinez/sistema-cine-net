package cine;

public enum Horario {
    MAÑANA("10:00"), MEDIODIA("12:30"), TARDE("16:00"), TARDENOCHE("19:00"), NOCHE("21:30"), MEDIANOCHE("23:00");

    private String horario;

    Horario(String horario) {
        this.horario = horario;
    }

    public String getHorario() {
        return horario;
    }
}
