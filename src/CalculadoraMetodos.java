import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculadoraMetodos {
    public static void sumar(int a, int b)
    {
        int resultado = a + b;
        System.out.println("El resultado es: " + resultado);
    }
    public static void restar(int a, int b)
    {
        int resultado = a - b;
        System.out.println("El resultado es: " + resultado);
    }

    public static void multiplicar(int a, int b)
    {
        int resultado = a * b;
        System.out.println("El resultado es: " + resultado);
    }

    public static void dividir(int a, int b)
    {
        int resultado = a / b;
        System.out.println("El resultado es: " + resultado);
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            CalculadoraMetodos i;

            int a;
            int b;
            String op;

            System.out.println("Escriba el primer numero");
            a = Integer.parseInt(br.readLine());
            System.out.println("Escriba el segundo numero");
            b = Integer.parseInt(br.readLine());
            System.out.println("Que operacion desea realizar? (+,-,*,/)");
            op = br.readLine();

            switch (op) {
                case "+" -> CalculadoraMetodos.sumar(a, b);
                case "-" -> CalculadoraMetodos.restar(a, b);
                case "*" -> CalculadoraMetodos.multiplicar(a, b);
                case "/" -> CalculadoraMetodos.dividir(a, b);
                default -> System.out.println("operador no valido");
            }
        }
    }
}
