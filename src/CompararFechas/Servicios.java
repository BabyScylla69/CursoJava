package CompararFechas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Servicios{
    public Servicios(List<Persona> personas)
    {
        getPersonaMayor(personas);
    }
    public static void getPersonaMayor(List<Persona> personas) throws SinDatosException
    {
        Persona temp = personas.getFirst();
        if (personas.isEmpty())
        {
            throw new SinDatosException(SinDatosException.SIN_DATOS);
        }
        else
            for(Persona persona : personas)
            {
                if (persona.getFechaNacimiento().before(temp.getFechaNacimiento()))
                    temp = persona;
            }
        System.out.println(temp.getNombre());
    }

}
