//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PrimerDia {
    public static void main(String[] args) {
        // ex 1
        int n = 4;
        // ex 2
        String text = "hola";
        // ex 3
        float flt = 10.0f;
        // ex 4
        int a;
        a = 7;
        int b = a; // Sólo hay que modificar esta línea
        System.out.println(b); // debería mostrar 7
        //ex 5
        String tituloDeLaPelicula;
        String  camelCaseBienPuesto;
        int edadDelMonstruo;
        //ex 6
        int i = 7;
        i = 5;
        i = 3;
        System.out.println(i); // ¿Cuánto valdrá i? 3
        //ex 7
        int j = 2;
        double d = 10.2d;
        char c = 'c';

        System.out.println("i = " + j);
        System.out.println("d = " + d);
        System.out.println("c = " + c);
        //ex 8
        int x = 5;
        int y = 7;
        int aux = x;

        x = y;
        y = aux;
        System.out.println(x); //Debería mostrar 7
        System.out.println(y); //Debería mostrar 5
    }
}