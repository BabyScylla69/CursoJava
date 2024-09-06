import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LecturaMult {
    public static void main(String[] args)  throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca un valor, por favor: ");
        String txt = br.readLine();

        int cantidad = Integer.parseInt(txt);
        System.out.println(cantidad*2);
        System.out.println(cantidad*3);
    }
}
