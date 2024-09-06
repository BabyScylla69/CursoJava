import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LecturaCaja {
    public static void main(String[] args)  throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Introduzca un nombre, por favor: ");
    String txt = br.readLine();
    String nombre = txt;

    System.out.println("Introduzca un material, por favor: ");
    txt = br.readLine();
    String material = txt;

    System.out.println("Introduzca las dimensiones, por favor: ");
    txt = br.readLine();
    String dimensiones = txt;

    System.out.println("Introduzca un comentario, por favor: ");
    txt = br.readLine();
    String comentario = txt;

    System.out.println(nombre + " ha pedido una caja de " +material+" con unas dimensiones " +dimensiones+". " +comentario+".");
    }
}
