package OrientacionAObjetos;

public class Animal {
    int peso;
    String sonido;

    public Animal(int peso, String sonido) {
        this.peso = peso;
        this.sonido = sonido;
    }

    public void comunicarse()
    {
        System.out.println(sonido);
    }
}
