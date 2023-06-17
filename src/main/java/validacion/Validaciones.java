
package validacion;

import excepciones.CampoVacioException;
import excepciones.EmailException;
import excepciones.LetrasException;
import excepciones.LongitudPasswordException;

public class Validaciones {

    public static void validarNombre(String nombre) throws CampoVacioException, LetrasException {
        if (!nombre.matches("[a-zA-Z]+")) {
            throw new LetrasException("El campo debe contener solo letras");
        }
        if (nombre.isEmpty()) {
            throw new CampoVacioException("nombre");
        }
    }
    public static void validarApellido(String nombre) throws CampoVacioException, LetrasException {
        if (!nombre.matches("[a-zA-Z]+")) {
            throw new LetrasException("El campo debe contener solo letras");
        }
        if (nombre.isEmpty()) {
            throw new CampoVacioException("apellido");
        }
    }
    
    public static void validarPassword(String password) throws LongitudPasswordException,CampoVacioException{
        if (password.length() < 8) {
            throw new LongitudPasswordException();
        }
        if (password.isEmpty()) {
            throw new CampoVacioException("contraseña");
        }
    }
    
    public static void validarEmail(String email) throws EmailException, CampoVacioException {
        if (!email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
            throw new EmailException("Email inválido");
        }
        if (email.isEmpty()) {
            throw new CampoVacioException("email");
        }
    }
    
   
}
