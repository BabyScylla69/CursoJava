import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrays {
    public int[] toArray(int n1, int n2)
    {
        return new int[]{n1, n2};
    }
    public int getFirstElement(int[] a)
    {
        return a[0];
    }
    public int[] setFirstElement(int[] a, int val)
    {
        a[0] = val;
        return a;
    }
    public int getLastElement(int[] a)
    {
        return a[a.length-1];
    }
    public String getMonth(int val)
    {
        String[] month = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        return month[val-1];
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        Arrays a = new Arrays();
        String[] nombres = {"Alvaro", "Pol", "Ola", "Jordi", "Eric"};

        for (int i = 0; i < nombres.length; i++)
        {
            System.out.println(nombres[i]);
        }

        int[] numeros = {1,9,3,8,5,7};

        for (int i = 0; i < numeros.length; i++)
        {
            System.out.println(numeros[i] * 2);
        }

        int[] testArray = a.toArray(2, 3);

        for (int i = 0; i < testArray.length; i++)
        {
            System.out.println(testArray[i]);
        }

        System.out.println(a.getFirstElement(testArray));
        a.setFirstElement(testArray, 5);
        for (int i = 0; i < testArray.length; i++)
        {
            System.out.println(testArray[i]);
        }

        System.out.println(a.getLastElement(testArray));
/*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca un mes del 1-12");
        int month = Integer.parseInt(br.readLine());
        System.out.println("El mes que ha puesto es " + a.getMonth(month));
*/
        // ex 8 int myData = arr[3][2];

        int j = 5;
        int i = 0;
        int[] testArray2 = new int[6];
        while (i < testArray2.length)
        {
            testArray2[i] = j;
            j--;
            i++;
        }
        j = 5;
        for (i = 0; i < testArray2.length; i++)
        {
            testArray2[i] = j;
            j--;
        }
        for (int x = 0; x < testArray2.length; x++)
        {
            System.out.println(testArray2[x]);
        }

    }
}