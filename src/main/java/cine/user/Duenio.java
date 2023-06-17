package cine.user;

import java.util.ArrayList;
import java.util.List;

public class Duenio extends Usuario{
    List<Cliente> user = new ArrayList();
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
