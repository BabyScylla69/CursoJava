import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RepasoCosteViaje {
    public static int costeHotel(int noches)
    {
        return noches*140;
    }
    public static int costeAvion(String pais)
    {
        String minusculas = pais.toLowerCase();
        return switch (minusculas) {
            case "ovideo" -> 15;
            case "tokyo" -> 700;
            case "madrid", "barcelona" -> 90;
            default -> 0;
        };
    }
    public static int costeCoche(int dias)
    {
        int coste = dias*40;

        if (dias >= 7)
        {
            return coste - 50;
        } else if (dias >= 3) {
            return coste - 20;
        }

        return coste;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int costeHotel;
        int costeAvion;
        int costeCoche;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca la cantidad de noches");
        costeHotel = RepasoCosteViaje.costeHotel(Integer.parseInt(br.readLine()));
        System.out.println("Introduzca donde quiere ir");
        System.out.println("Oviedo | Tokyo | Madrid | Barcelona");
        costeAvion = RepasoCosteViaje.costeAvion(br.readLine());
        System.out.println("Introduzca cuantos dias va a alquilar un coche");
        costeCoche = RepasoCosteViaje.costeCoche(Integer.parseInt(br.readLine()));

        int sumaCostes = costeHotel + costeAvion + costeCoche;
        System.out.println("Coste total: " + sumaCostes);

        int fact = 4;
        int result = 1;

        for(int i = 1; i<fact; i++)
        {
            result *= i;
        }
    }
}
