package OrientacionAObjetos;

public class Vaca extends Animal{
    int litrosLeche;
    public Vaca(int peso, String sonido, int litrosLeche) {
        super(peso, sonido);
        this.litrosLeche = litrosLeche;
        this.sonido = sonido;
    }

    @Override
    public void comunicarse() {
        System.out.println("La vaca hace " + sonido);
    }
}
