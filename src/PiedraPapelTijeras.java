import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PiedraPapelTijeras {

    public static void printOptions()
    {
        System.out.println("1-Piedra, 2-Papel, 3-Tijeras");
    }
    public static int decision(int play1, int play2)
    {
        if(play1 == play2)
        {
            return 0;
        }
        else if (play1 == 1)
        {
            if(play2 == 2)
                return 2;
            else
                return 1;
        }
        else if (play1 == 2)
        {
            if (play2 == 1)
                return 1;
            else
                return 2;

        }
        else if(play1 == 3)
        {
            if(play2 == 1)
                return 2;
            else
                return 1;
        }
        return -1;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int player1Lives = 5;
        int player2Lives = 5;
        int p1Chose = 0;
        int p2Chose = 0;
        int decision;

        boolean fin = false;

        System.out.println("Juego de piedra papel tijeras!");
        while (!fin)
        {
            System.out.println("Player 1: " + player1Lives + " | Player 2: " + player2Lives);

            PiedraPapelTijeras.printOptions();
            System.out.println("Player 1, please choose");
            p1Chose = Integer.parseInt(br.readLine());
            System.out.println("\n\n\n\n\n");
            PiedraPapelTijeras.printOptions();
            System.out.println("Player 2, please choose");
            p2Chose = Integer.parseInt(br.readLine());

            decision = PiedraPapelTijeras.decision(p1Chose, p2Chose);

            switch (decision)
            {
                case 0:
                    System.out.println("Empate");
                case 1:
                    player2Lives--;
                case 2:
                    player1Lives--;
            };

            if (player1Lives == 0)
            {
                System.out.println("Gana player 2!");
                fin = true;
            }
            else if(player2Lives == 0)
            {
                System.out.println("Gana player 1!");
                fin = true;
            }
        }
    }
}