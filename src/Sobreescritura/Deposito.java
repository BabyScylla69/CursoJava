package Sobreescritura;

import java.util.Objects;

public class Deposito implements Comparable<Deposito>{
    int alto, ancho, largo, volumen;

    public Deposito(int alto, int ancho, int largo) {
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }

    @Override
    public boolean equals(Object o)
    {
       if(!(o instanceof Deposito)) return false;
       Deposito dep = (Deposito) o;
       return (getAlto() * getAncho() * getLargo() == dep.getAlto() * dep.getAncho() * dep.getLargo());
    }

    public int getAlto() {
        return alto;
    }
    public int getAncho() {
        return ancho;
    }
    public int getLargo() {
        return largo;
    }
    public int getVolumen() { return getAlto() * getAncho() * getLargo();}

    @Override
    public int hashCode()
    {
        return Objects.hash(getAlto(), getAncho(), getLargo());
    }

    @Override
    public int compareTo(Deposito o) {
        double volumeThis = this.getAlto() * this.getLargo() * this.getAncho();
        double volumeOther = o.getAlto() * o.getLargo() * o.getAncho();
        return Double.compare(volumeThis, volumeOther);
    }
}
