package validacion;

import cine.cinelugar.Cine;
import cine.cinelugar.Pelicula;
import excepciones.CampoVacioException;
import excepciones.DiaNoValidoException;
import excepciones.EmailException;
import excepciones.LetrasException;
import excepciones.LongitudPasswordException;
import excepciones.PeliculaRegistradaException;
import excepciones.SoloNumerosException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Validaciones {

    public static void validarNombre(String nombre) throws CampoVacioException, LetrasException {
        if (nombre.isEmpty() || nombre == null) {
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

    public static void validarPassword(String password) throws LongitudPasswordException, CampoVacioException {
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

    public static void validarCampo(String campo) throws CampoVacioException {
        if (campo.isEmpty() || campo == null) {
            throw new CampoVacioException(campo + " no puede estar vacio");
        }
    }

    public static void validarNumeros(String str) throws SoloNumerosException, CampoVacioException {
        if (str.isEmpty()) {
            throw new CampoVacioException("duración");
        }
        if (!str.matches("\\d+")) {
            throw new SoloNumerosException("Por favor ingrese solamente dígitos.");
        }
    }

    public static void validarPelicula(String str) throws PeliculaRegistradaException {
        for (Pelicula e : Cine.getListaPeliculas()) {
            if (e.getNombre().equalsIgnoreCase(str)) {
                throw new PeliculaRegistradaException("El nombre ingresado ya existe.");
            }
        }
    }

    public static void validarDiaFuncion(Date fechaFuncion) throws DiaNoValidoException {
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaFuncionLocalDate = fechaFuncion.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        if (fechaFuncionLocalDate.isBefore(fechaActual.plusDays(1))) {
            throw new DiaNoValidoException();
        }
    }
}
