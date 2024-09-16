package CompararFechas;

import java.text.ParseException;
import java.util.Date;

public class Persona {
    String dni;
    String nombre;
    Date fechaNacimiento;

    public Persona(String dni, String nombre, Date fechaNacimiento) throws ParseException {
        setDni(dni);
        setNombre(nombre);
        setFechaNacimiento(fechaNacimiento);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
