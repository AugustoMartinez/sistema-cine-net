/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author horus
 */
public class LongitudPasswordException extends Exception {
    public LongitudPasswordException() {
        super("El password debe tener al menos 8 caracteres");
    }
}

