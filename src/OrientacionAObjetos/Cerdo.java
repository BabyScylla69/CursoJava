package OrientacionAObjetos;

public class Cerdo extends Animal{
    int kilosCarne;
    public Cerdo(int peso, String sonido, int kilosCarne) {
        super(peso, sonido);
        this.kilosCarne = kilosCarne;
    }

    @Override
    public void comunicarse() {
        super.comunicarse();
    }
}
