package excepciones;

public class LongitudPasswordException extends Exception {
    public LongitudPasswordException() {
        super("El password debe tener al menos 8 caracteres");
    }
}
