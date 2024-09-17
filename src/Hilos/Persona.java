package Hilos;

public class Persona implements Runnable{

    static final Object mutex = new Object();
    @Override
    public void run() {
        synchronized (mutex)
        {
            try{
                for (int i = 0; i < 3; i++) {
                    System.out.println("operación " + i);
                    Thread.sleep(10);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
