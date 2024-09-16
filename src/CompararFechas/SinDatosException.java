package CompararFechas;

public class SinDatosException extends RuntimeException {
  public static final String SIN_DATOS = "No hay datos en la lista";
  public SinDatosException(String message) {
        super(message);
    }
}
