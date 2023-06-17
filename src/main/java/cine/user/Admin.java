package cine.user;

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
