
package validacion;

import excepciones.CampoVacioException;
import excepciones.EmailException;
import excepciones.LetrasException;
import excepciones.LongitudPasswordException;

public class Validaciones {

    public static void validarNombre(String nombre) throws CampoVacioException, LetrasException {
        if (nombre.isEmpty() || nombre==null) {
            throw new CampoVacioException("nombre");
        }
        if (!nombre.matches("[a-zA-Z]+")) {
            throw new LetrasException("El nombre solo se admite letras");
        }
        
    }
    public static void validarApellido(String nombre) throws CampoVacioException, LetrasException {
        if (nombre.isEmpty()) {
            throw new CampoVacioException("apellido");
        }
        if (!nombre.matches("[a-zA-Z]+")) {
            throw new LetrasException("El apellido solo admite letras");
        }
        
    }
    
    public static void validarPassword(String password) throws LongitudPasswordException,CampoVacioException{
        if (password.isEmpty()) {
            throw new CampoVacioException("contraseña");
        }
        if (password.length() < 8) {
            throw new LongitudPasswordException();
        }
    }
    
    public static void validarEmail(String email) throws EmailException, CampoVacioException {
        if (email.isEmpty()) {
            throw new CampoVacioException("email");
        }
        if (!email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
            throw new EmailException("Email inválido");
        }
        
    }
    
   
}
