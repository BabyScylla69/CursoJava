import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class EjerciciosMetodos {
    public void booleanCheck(Boolean bool)
    {
        if(bool)
        {
            System.out.println("Si, eso es cierto");
        }
        else if (!bool)
        {
            System.out.println("No, eso es falso");
        }
    }

    public void cube(int value)
    {
        int resultado = value * value * value;
        System.out.println("value = " + resultado);
    }

    public void kmToM(float value)
    {
        float resultado;
        resultado = value * 1000f;
        System.out.println(value + " km/h son " + resultado +" m/h");
    }

    public void calculaPerimetro(int alto, int ancho)
    {
        int resultado;
        resultado = 2*alto + 2*ancho;
        System.out.println("El area es de " + resultado);
    }

    public void areaTriangulo(int base, int altura)
    {
        float resultado = (base*altura)/2f;
        System.out.println("el area es " + resultado);
    }

    public void areaYPerimetroCirculo(int radio)
    {
        System.out.println(radio * Math.PI * 2);
        System.out.println(Math.PI*radio*radio);
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        EjerciciosMetodos i;
        i = new EjerciciosMetodos();
        BufferedReader rb = new BufferedReader(new InputStreamReader(System.in));

//        ex 1
//        Boolean check;
//        System.out.println("Escriba true or false");
//        check = Boolean.parseBoolean(rb.readLine());
//        i.booleanCheck(check);

//        ex 2
//        i.cube(3);

//        ex 3
//        i.kmToM(13.4f);

//        ex 4
//        i.calculaPerimetro(3,4);

//        ex 5
//        i.areaTriangulo(2,4);

//        ex 6
//        i.areaYPerimetroCirculo(3);
    }
}
