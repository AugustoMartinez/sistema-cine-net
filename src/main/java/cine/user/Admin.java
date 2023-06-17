/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cine.user;

/**
 *
 * @author horus
 */
public class Admin extends Usuario{
    private boolean isAdmin;

    public Admin(String email, String password, String nombre, String apellido) {
        super(email, password, nombre, apellido);
        isAdmin = true;
    }

    void setAdmin(boolean estado){
        isAdmin = estado;
    }

    //ABM Peliculas

    //ABM Funciones

    //ABM Salas
    @Override
    public void logeo() {

    }
}