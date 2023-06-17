package cine;

public enum Costos {
    PELICULA2D("2D",1000), PELICULA3D("3D",2000), PELICULA2D_ATMOS("2D ATMOS",2500), PELICULA3D_ATMOS("3D ATMOS",3000);

    private String tipo;
    private Integer costo;
    private Costos(String tipo, Integer costo){
        this.tipo = tipo;
        this.costo = costo;
    }

    public String getTipo() {
        return tipo;
    }

    public Integer getCosto() {
        return costo;
    }
}
