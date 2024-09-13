package Sobreescritura;

public class Deposito {
    int alto, ancho, largo;

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
    public void setAlto(int alto) {
        this.alto = alto;
    }
    public int getAncho() {
        return ancho;
    }
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    public int getLargo() {
        return largo;
    }
    public void setLargo(int largo) {
        this.largo = largo;
    }
}
