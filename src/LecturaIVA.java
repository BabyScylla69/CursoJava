import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class LecturaIVA {
    public static void main(String[] args)  throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca el precio, por favor: ");
        String txt = br.readLine();

        float precio = Float.parseFloat(txt);
        float precioConIva = precio*1.21f;
        System.out.println(precioConIva);
    }
}
