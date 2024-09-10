package OrientacionAObjetos;

public class Gallina extends Animal{
    int numeroHuevos;

    public Gallina(int peso, String sonido, int numeroHuevos) {
        super(peso, sonido);
        this.numeroHuevos = numeroHuevos;
    }

    @Override
    public void comunicarse() {
        super.comunicarse();
    }
}
