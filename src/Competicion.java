import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Competicion {
    public void sum(int a, int b)
    {
        System.out.println(a+b);
    }
    public void superficie(int a, int b)
    {
        System.out.println(a*b);
    }
    public void volumen(int a, int b, int c)
    {
        System.out.println(a*b*c);
    }
    public int volumenr(int a, int b, int c)
    {
        return a*b*c;
    }
    public void mayor(int a, int b)
    {
        int result;
        if (a < b)
        {
            result = b;
        }
        else
        {
            result = a;
        }
        System.out.println(result);
    }
    public void intBy3(int val)
    {
        for (int i = 0; i<val; i++ )
        {
            if(i%3==0)
            {
                System.out.println(i);
            }
        }
    }
    public void intBy3While(int val)
    {
        int i = 0;
        while (i<val)
        {
            if(i%3==0)
            {
                System.out.println(i);
            }
            i++;
        }
    }
    public void exactDiv(int val)
    {
        for (int i = 1; i<=val; i++)
        {
            if (val%i==0)
            {
                System.out.println(i);
            }
        }
    }
    public void exactDivWhile(int val)
    {
        int i = 1;
        while (i<=val)
        {
            if (val%i==0)
            {
                System.out.println(i);
            }

            i++;
        }
    }
   /* public void enesima(int val, int ene)
    {
        int result;
        for (int i = 0; i <= ene; i++)
        {
            result
        }
    }*/

    public static void main(String[] args) throws NumberFormatException, IOException {
        Competicion c = new Competicion();

        /*System.out.println("hola mundo!");
        String name = "Alvaro";
        System.out.println(name);
        System.out.println("hola " + name);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String txt = br.readLine();
        System.out.println(txt);
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        System.out.println(num1 + num2);

        c.sum(num1, num2);
        c.superficie(num1, num2);
        int num3 = Integer.parseInt(br.readLine());
        c.volumen(num1, num2, num3);
        System.out.println(c.volumenr(num1, num2, num3));
        for (int i = 0; i<=10; i++)
        {
            System.out.println("Puxe Asturies!");
        }
        for (int i = 0; i<=9; i++)
        {
            System.out.println(i);
        }
        for (int i = 0; i<=9; i += 2)
        {
            System.out.println(i);
        }
        for (int i = 0; i<=9; i++)
        {
            if(i%2==0)
                System.out.println(i);
        }*/
        /*for (int i = 0; i<=9; i++)
        {
            if(i%3==0)
                System.out.println(i);
        }*/
        //c.intBy3(100);
        //c.intBy3While(100);
        //c.exactDiv(3);
        c.exactDivWhile(6);
    }
}
