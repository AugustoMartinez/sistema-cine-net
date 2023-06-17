/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cine.user;

/**
 *
 * @author horus
 */
public class Duenio extends Usuario{
    public Duenio(String email, String password, String nombre, String apellido) {
        super(email, password, nombre, apellido);
    }

    public void darAltaAdmin(Admin ad){
        ad.setAdmin(true);
    }

    public void darBajaAdmin(Admin ad){
        ad.setAdmin(false);
    }

    @Override
    public void logeo() {

    }
}
