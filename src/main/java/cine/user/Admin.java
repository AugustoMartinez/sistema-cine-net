package cine.user;

public class Admin extends Usuario{
    public Admin(String email, String password, String nombre, String apellido) {
        super(email, password, nombre, apellido);
    }

    public void darAltaAdmin(Gerente ad){
        ad.setAdmin(true);
    }

    public void darBajaAdmin(Gerente ad){
        ad.setAdmin(false);
    }

    @Override
    public void logeo() {

    }
}
