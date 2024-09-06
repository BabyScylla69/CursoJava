import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RepasoDNI {

    public static void letraDNI(String dni)
    {
        char letra;
        String obtenDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
        int numeroDNI = Integer.parseInt(dni);
        int resto = numeroDNI%23;
        if (dni.length() == 8)
        {
            letra = obtenDNI.charAt(resto);
            System.out.println("La letra de tu DNI es: " + letra);
            System.out.println(dni + letra);
        }
        else
        {
            System.out.println("null");
        }
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca los numeros de su DNI");
        RepasoDNI.letraDNI(br.readLine());

    }
}
