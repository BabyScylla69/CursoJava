import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculadora {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("introduzca el primer numero");
        float numero1 = Float.parseFloat(br.readLine());
        System.out.println("Introduzca la operacion que desea realizar (+,-,*,/)");
        String operacion = br.readLine();
        System.out.println("introduzca el segundo numero");
        float numero2 = Float.parseFloat(br.readLine());

        float resultado = 10f;
        Boolean canPrint = true;
        if(operacion.equals("+"))
        {
            resultado = numero1 + numero2;
        } else if (operacion.equals("-")) {
            resultado = numero1 - numero2;
        } else if (operacion.equals("*")) {
            resultado = numero1 * numero2;
        } else if (operacion.equals("/")) {
            resultado = numero1 / numero2;
        } else {
            System.out.println("operador no valido");
            canPrint = false;
        }

        if(canPrint){System.out.println("El resultado es: " + resultado);}
    }
}
