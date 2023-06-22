package cine.user;


public class Sesion {
    private static String emailLogeado="";
    private static String tipo="";
    
    public Sesion() {
        
    }
    
    public static String getEmailLogeado() {
        return emailLogeado;
    }

    public static void setEmailLogeado(String emailLogeado) {
        Sesion.emailLogeado = emailLogeado;
    }

    public static String getTipo() {
        return tipo;
    }

    public static void setTipo(String tipo) {
        Sesion.tipo = tipo;
    }
    
    
    
    
}
