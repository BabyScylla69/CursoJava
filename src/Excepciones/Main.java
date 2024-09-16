package Excepciones;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        float r = 0;
        try {
            r = getPrecioConIva(120);
        } catch (PrecioDemasiadoAltoException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        System.out.println("r = " + r);
    }

    static float getPrecioConIva(float price) throws PrecioDemasiadoAltoException {
        float r =  price * 1.16f;
        if (price>100) throw new PrecioDemasiadoAltoException();
        return r;
    }

}
