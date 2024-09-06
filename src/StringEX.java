import java.io.IOException;
import java.sql.SQLOutput;

public class StringEX {
    public int nameToInt(String txt)
    {
        return  txt.length();
    }
    public char devuelvePrimeraLetra(String s)
    {
        return s.charAt(0);
    }
    public char devuelveUltimaLetra(String s)
    {
        return s.charAt(s.length() - 1);
    }
    public char devuelveEnesimaLetra(String s, int i)
    {
        return s.charAt(i);
    }
    public String devuelveMasLarga(String s1, String s2)
    {
        String resultado = s1;
        if(s1.length()<s2.length())
        {
            resultado = s2;
        }
        return resultado;
    }
    public String devuelveMasLarga2(String s1, String s2, String s3)
    {
        if(s1.length()==s2.length() || s2.length() == s3.length() || s3.length() == s1.length())
        {
            return "Hay al menos dos cadenas iguales";
        }

        if (s2.length() > s1.length())
        {
            if (s2.length()>s3.length())
            {return s2;}
        }
        if (s3.length()> s1.length())
        {
            return s3;
        }

        return s1;

    }
    public String generarNombre(String s1, String s2, String s3)
    {
        String name = "error";
        if(s1.length()>4 && s2.length()>4 && s3.length()>4)
        {
            name = s1.substring(0,3) + s2.substring(0, 3) + s3.substring(0, 3);
        }
        return name;
    }
    public String generarNombre2(String s1, String s2, String s3)
    {
        String name = "error";
        if(s1.length()>4 && s2.length()>4 && s3.length()>4)
        {
            name = String.valueOf(s1.charAt(s1.length()-1)) + String.valueOf(s2.charAt(s2.length()-1)) + String.valueOf(s3.charAt(s3.length()-1));
        }
        return name;
    }
    public String generarNombre3(String s1, String s2, String s3)
    {
        String name = "error";
        if(s1.length()>4 && s2.length()>4 && s3.length()>4)
        {
            name = s1.substring(s1.length()-3,s1.length()) + s2.substring(s2.length()-3,s2.length()) + s3.substring(s3.length()-3,s3.length());
        }
        return name;
    }
    public Boolean tieneLetra(String txt, char c)
    {
        return txt.indexOf(c) != -1;
    }
    public Boolean tieneLetra2(String txt, char c)
    {
        return txt.toLowerCase().indexOf(Character.toLowerCase(c)) != -1;
    }
    public String creaPalabra(char c, int val)
    {
        String palabra = "";
        for(int i = 0; i < val; i++)
        {
            palabra += String.valueOf(c);
        }
        return palabra;
    }
    public String creaPalabraMayus(char c, int val)
    {
        String palabra = "";
        for(int i = 0; i < val; i++)
        {
            palabra += String.valueOf(c);
        }
        return palabra.toUpperCase();
    }
    public String addGuiones(String txt)
    {
        String palabra = "";
        for (int i = 0; i<txt.length(); i++)
        {
            palabra += String.valueOf(txt.charAt(i)) + "-";
        }
        return palabra;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        StringEX stringClass = new StringEX();
        System.out.println(stringClass.nameToInt("Alvaro"));
        System.out.println(stringClass.devuelvePrimeraLetra("Alvaro"));
        System.out.println(stringClass.devuelveUltimaLetra("Alvaro"));
        System.out.println(stringClass.devuelveEnesimaLetra("Alvaro", 3));
        String nombre = "wonderfulDay";
        System.out.println(nombre.substring(3,7));
        System.out.println(stringClass.devuelveMasLarga("Hola", "adios"));
        System.out.println(stringClass.devuelveMasLarga2("Hola", "Adios", "123"));
        System.out.println(stringClass.generarNombre("12345", "12345", "12345"));
        System.out.println(stringClass.generarNombre2("12345", "12345", "12345"));
        System.out.println(stringClass.generarNombre3("12345","12345","12345"));
        System.out.println(stringClass.tieneLetra("hola", 'o'));
        System.out.println(stringClass.tieneLetra2("HOLA", 'a'));
        System.out.println(stringClass.creaPalabraMayus('d', 2));
        System.out.println(stringClass.addGuiones("Hola"));
    }
}
