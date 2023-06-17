package cine.user;

import excepciones.CampoVacioException;
import excepciones.EmailException;
import excepciones.LetrasException;
import excepciones.LongitudPasswordException;
import validacion.Validaciones;

public abstract class Usuario {

    private String email;
    private String password;
    private String nombre;
    private String apellido;

    public Usuario() {
    }

    public Usuario(String email, String password, String nombre, String apellido) {
        this.email = email;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws EmailException, CampoVacioException {
        try{
            Validaciones.validarEmail(email);
            this.email=email;
        }catch(EmailException | CampoVacioException e){
            System.out.println(e.getMessage());
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws LongitudPasswordException, CampoVacioException {
        try{
            Validaciones.validarPassword(password);
            this.password=password;
        }catch(LongitudPasswordException | CampoVacioException e ){
            System.out.println(e.getMessage());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws LetrasException, CampoVacioException {
        try {
            Validaciones.validarNombre(nombre);
            this.nombre = nombre;
        } catch (LetrasException | CampoVacioException e) {
            System.out.println(e.getMessage());
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) throws LetrasException, CampoVacioException {
        try {
            Validaciones.validarApellido(nombre);
            this.apellido = apellido;
        } catch (LetrasException | CampoVacioException e) {
            System.out.println(e.getMessage());
        }
    }

    public abstract void logeo();

    @Override
    public String toString() {
        return "Informacion del usuario: { \n"
                + "Nombre y apellido: '" + nombre + apellido + "\n"
                + "Contraseña: " + password + "\n"
                + "Email: '" + nombre + '\n' + '}';
    }
}
