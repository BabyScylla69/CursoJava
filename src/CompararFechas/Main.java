package CompararFechas;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        HashMap<Integer, Persona> personasHash = new HashMap<>();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date fecha1 = formatter.parse("09-05-2003");
        Date fecha2 = formatter.parse("01-01-2000");
        personasHash.put(1, new Persona("54851687E", "Alvaro", fecha1));
        personasHash.put(2, new Persona("12345678A", "Random", fecha2));

        Collection<Persona> coleccionPersonas = personasHash.values();
        List<Persona> listaPersonas = new ArrayList<>(coleccionPersonas);
        new Servicios(listaPersonas);


    }
}
