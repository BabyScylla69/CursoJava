import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LecturaGrados {
    public static void main(String[] args)  throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca la temperatura en centigrados, por favor: ");
        String txt = br.readLine();

        float centigrados= Float.parseFloat(txt);
        float fahrenheit= centigrados*(9f/5f) + 32f;
        System.out.println(fahrenheit);
    }
}
