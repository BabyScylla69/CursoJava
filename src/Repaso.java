import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Repaso {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int rand = (int) Math.floor(Math.random()*(5)+1);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean fin = false;
        int chosen;
        int attempt = 3;

        System.out.println("Escriba un numero del 1-5");
        System.out.println("Tienes 3 oportunidades");
        while (!fin && attempt != 0)
        {
            chosen = Integer.parseInt(br.readLine());

            if(chosen == rand)
            {
                fin = true;
            }
            else
            {
                System.out.println("Sigue intentando!");
                attempt--;
                System.out.println("Te quedan " + attempt + " oportunidades");
            }
        }
        if (attempt >0)
        {
            System.out.println("Has ganado!");
        }
        else
        {
            System.out.println("Has perdido..");
        }
    }
}
