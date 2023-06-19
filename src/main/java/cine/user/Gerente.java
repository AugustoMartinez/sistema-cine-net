package cine.user;

public class Gerente extends Usuario{
    private boolean isAdmin;

    public Gerente (String email, String password, String nombre, String apellido) {
        super(email, password, nombre, apellido);
        isAdmin = true;
    }

    public Gerente() {
        this.isAdmin = true;
    }

    
    
    public void setAdmin(boolean estado){
        isAdmin = estado;
    }

    public boolean getIsAdmin() {
        return isAdmin;
    }


    //ABM Peliculas

    //ABM Funciones

    //ABM Salas
    @Override
    public void logeo() {

    }
}
