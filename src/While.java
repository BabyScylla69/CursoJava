import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class While {
    public static void main(String[] args) throws NumberFormatException, IOException {
        boolean fin = false;
        BufferedReader rb = new BufferedReader(new InputStreamReader(System.in));
        String text;
        while(!fin)
        {
            System.out.println("Escribe tu nombre");
            text = rb.readLine();

            if(text.isEmpty())
            {
                System.out.println("Nombre vacio");
            }
            else
            {
                System.out.println("Tu nombre es: " + text + ", es eso correcto?");
                System.out.println("si / no");
                text = rb.readLine();

                if(text.equals("si"))
                {
                    fin = true;
                }
            }
        }
    }
}
