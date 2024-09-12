package OrientacionAObjetos;

public abstract class Animal implements IComunicable {
    int peso;
    String sonido;

    public Animal(int peso, String sonido) {
        this.peso = peso;
        this.sonido = sonido;
    }

    public abstract void comunicarse();
}
