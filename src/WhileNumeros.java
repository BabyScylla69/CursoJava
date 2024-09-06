import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileNumeros {
    public static void main(String[] args) throws NumberFormatException, IOException {
        boolean fin = false;
        int totalAmount = 0;
        BufferedReader rb = new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.println("Escriba un numero (-1 para salir)");
        while(!fin)
        {
            n = Integer.parseInt(rb.readLine());
            if(n==-1)
            {
                fin = true;
            }
            else
            {
                totalAmount++;
            }
        }

        System.out.println("La cantidad de numeros ha sido: " + totalAmount);
    }
}
