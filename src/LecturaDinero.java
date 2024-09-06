import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LecturaDinero {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca la cantidad de euros, por favor: ");
        String txt = br.readLine();

        int euros = Integer.parseInt(txt);
        int dolares = euros*2;
        System.out.println(dolares);
    }
}
