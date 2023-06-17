package cine.user;

import excepciones.CampoVacioException;
import excepciones.EmailException;
import excepciones.LetrasException;
import excepciones.LongitudPasswordException;

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

    public void setEmail(String email) throws EmailException,CampoVacioException{
        if (!email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
            throw new EmailException("Email inválido");
        }else if(email.isEmpty()){
        throw new CampoVacioException("email");
        }else{
            this.email = email;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws LongitudPasswordException,CampoVacioException {
        if (password.length() < 8) {
        throw new LongitudPasswordException();
    }else if(password.isEmpty()){
        throw new CampoVacioException("contraseña");
    }
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws LetrasException,CampoVacioException{
        if (!nombre.matches("[a-zA-Z]+")) {
            throw new LetrasException("El campo debe contener solo letras");
        }else if(nombre.isEmpty()){
        throw new CampoVacioException("nombre");
        }else{
            this.nombre = nombre;
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) throws LetrasException,CampoVacioException{
        if (!apellido.matches("[a-zA-Z]+")) {
            throw new LetrasException("El campo debe contener solo letras");
        }else if(nombre.isEmpty()){
        throw new CampoVacioException(apellido);
        }else{
            this.apellido = apellido;
        }
    }

    public abstract void logeo();

    @Override
    public String toString() {
        return "Informacion del usuario: { \n" +
                "Nombre y apellido: '" + nombre + apellido + "\n" +
                "Contraseña: " + password + "\n" +
                "Email: '" + nombre + '\n' + '}';
    }
}
