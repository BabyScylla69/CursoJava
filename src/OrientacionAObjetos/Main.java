package OrientacionAObjetos;

public class Main {
    public static void main(String[] args) {
        Cerdo cerdo = new Cerdo(100, "Oink", 10);
        Vaca vaca = new Vaca(150, "Muu", 10);
        Gallina gallina = new Gallina(20, "Kikiriki", 12);

        cerdo.comunicarse();
        vaca.comunicarse();
        gallina.comunicarse();
    }
}
