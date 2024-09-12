package OrientacionAObjetos;

public class Cerdo extends Animal{
    int kilosCarne;
    public Cerdo(int peso, String sonido, int kilosCarne) {
        super(peso, sonido);
        this.kilosCarne = kilosCarne;
        this.sonido = sonido;
    }

    @Override
    public void comunicarse() {
        System.out.println("El cerdo hace " + sonido);
    }
}
