package OrientacionAObjetos;

public class Persona {
    public static int numInstancias = 0;
    public Persona()
    {
        numInstancias++;
        System.out.println("numInstancias = " + numInstancias);
    }
}
