package cine.cinelugar;

import java.io.Serializable;

public class Butaca implements Serializable{
    private Integer posY;
    private Integer posX;
    private boolean existe;
    private boolean ocupada;

    public Butaca(Integer posY, Integer posX) {
        this.posY = posY;
        this.posX = posX;
        this.existe = false;
        this.ocupada = false;
    }

    public Integer getPosY() {
        return posY;
    }

    public Integer getPosX() {
        return posX;
    }

    public void setPosY(Integer posY) {
        this.posY = posY;
    }

    public void setPosX(Integer posX) {
        this.posX = posX;
    }

    public void setExiste(boolean existe) {
        this.existe = existe;
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
