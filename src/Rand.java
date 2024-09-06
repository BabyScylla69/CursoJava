import java.io.IOException;

public class Rand {
    public static void main(String[] args) throws NumberFormatException, IOException {
        System.out.println(Math.floor(Math.random()*(7-5+1)) + 5);
        String name = "Alvaro";
        int rand = (int) Math.floor(Math.random()*name.length());
        char c = name.charAt(rand);
        System.out.println(c);


    }
}
