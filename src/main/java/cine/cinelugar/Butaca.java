package cine.cinelugar;

public class Butaca {
    private Integer posY;
    private Integer posX;
    private boolean existe;
    private boolean ocupada;

    public Butaca(Integer posY, Integer posX) {
        this.posY = posY;
        this.posX = posX;
        this.existe = true;
        this.ocupada = false;
    }

    public Integer getPosY() {
        return posY;
    }

    public Integer getPosX() {
        return posX;
    }

    public boolean isExiste() {
        return existe;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }
}
