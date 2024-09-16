package Sobreescritura;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Deposito> depositos = new ArrayList<>();
        for (int i = 0; i < 5; i++)
        {
            depositos.add(new Deposito(getRandomInt(), getRandomInt(), getRandomInt()));
        }
        sortArray(depositos);
    }

    public static int getRandomInt()
    {
        return (int) Math.floor(Math.random() * (50 - 5 + 1) + 5);
    }
    public static void sortArray(ArrayList<Deposito> arr)
    {
        Collections.sort(arr);
        for (Deposito d : arr) {
            System.out.println(d.getVolumen());
        }
    }
}
