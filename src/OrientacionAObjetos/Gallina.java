package OrientacionAObjetos;

public class Gallina extends Animal{
    int numeroHuevos;

    public Gallina(int peso, String sonido, int numeroHuevos) {
        super(peso, sonido);
        this.numeroHuevos = numeroHuevos;
        this.sonido = sonido;
    }

    @Override
    public void comunicarse() {
        System.out.println("La gallina hace " + sonido);
    }
}
