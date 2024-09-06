import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LecturaArea {
    public static void main(String[] args)  throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca el alto, por favor: ");
        String txt = br.readLine();

        int alto = Integer.parseInt(txt);

        System.out.println("Introduzca el ancho, por favor: ");
        txt = br.readLine();

        int ancho = Integer.parseInt(txt);
        int area = alto * ancho;
        System.out.println("El area es: " + area);
    }
}
