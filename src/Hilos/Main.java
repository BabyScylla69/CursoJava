package Hilos;

public class Main {
    public static void main(String[] args) {
        Thread persona1 = new Thread(new Persona());
        Thread persona2 = new Thread(new Persona());
        persona1.start();
        persona2.start();
    }
}
