package Sobreescritura;

public class Main {

    public static void main(String[] args) {
        Deposito d1 = new Deposito(2, 2,2 );
        Deposito d2 = new Deposito(2, 2, 2);
        System.out.println(d1.equals(d2));
    }
}
