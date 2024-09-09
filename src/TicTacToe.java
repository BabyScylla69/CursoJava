import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TicTacToe {

    public String[] resetField()
    {
        return new String[]{" ", " ", " ", " ", " ", " ", " ", " ", " "};
    }
    public void printField(String[] pos, int player)
    {
        System.out.println("Introduzca una posicion jugador " + player +"\n");
        System.out.println(" " + pos[0] + " | " + pos[1] + " | " + pos[2] + "       1 | 2 | 3");
        System.out.println("-----------     -----------");
        System.out.println(" " + pos[3] + " | " + pos[4] + " | " + pos[5] + "       4 | 5 | 6");
        System.out.println("-----------     -----------");
        System.out.println(" " + pos[6] + " | " + pos[7] + " | " + pos[8] + "       7 | 8 | 9");
    }
    public boolean checkFreeSpot(int pos, String[] positions)
    {
        if (!positions[pos-1].equals(" "))
        {
            System.out.println("Posicion invalida, vuelva a intentarlo");
            return false;
        }
        return true;
    }
    public String[] handleInput(int pos, int player, String[] positions)
    {
        if(player == 1)
            positions[pos-1] = "X";
        else
            positions[pos-1] = "O";

        return positions;
    }
    public int winCondition(String[] positions, int player)
    {
        int count = 0;
        if (player == 1)
        {
            if(positions[0].equals("X"))
            {
                if (positions[1].equals("X") && positions[2].equals("X") || positions[4].equals("X") && positions[8].equals("X") || positions[3].equals("X") && positions[6].equals("X"))
                    return 1;
            }
            else if(positions[4].equals("X"))
            {
                if(positions[1].equals("X") && positions[7].equals("X") || positions[2].equals("X") && positions[6].equals("X") || positions[3].equals("X") && positions[5].equals("X"))
                    return 1;
            }
            else if (positions[8].equals("X"))
            {
                if(positions[2].equals("X") && positions[5].equals("X") || positions[6].equals("X") && positions[7].equals("X"))
                    return 1;
            }
        }
        else if(player == 2)
        {
            if(positions[0].equals("O"))
            {
                if (positions[1].equals("O") && positions[2].equals("O") || positions[3].equals("O") && positions[6].equals("O") || positions[4].equals("O") && positions[8].equals("O"))
                    return 1;
            }
            else if(positions[4].equals("O"))
            {
                if(positions[1].equals("O") && positions[7].equals("O") || positions[2].equals("O") && positions[6].equals("O") || positions[3].equals("O") && positions[5].equals("O"))
                    return 1;
            }
            else if (positions[8].equals("O"))
            {
                if(positions[2].equals("O") && positions[5].equals("O") || positions[6].equals("O") && positions[7].equals("O"))
                    return 1;
            }
        }

        for (int i = 0; i < positions.length; i++)
        {
            if(positions[i].equals(" "))
            {
                count++;
            }
        }
        if (count == 0)
            return 0;
        return -1;
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        TicTacToe m = new TicTacToe();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int player = 1;
        int turn = 0;
        int selection;
        boolean fin = false;
        String[] positions = m.resetField();
        while (!fin)
        {
            if (turn%2==0)
                player = 1;
            else
                player = 2;

            m.printField(positions, player);
            selection = Integer.parseInt(br.readLine());

            if(m.checkFreeSpot(selection, positions))
            {
                positions = m.handleInput(selection, player, positions);
                turn++;
            }

            if(m.winCondition(positions, player) == 0)
            {
                System.out.println("Empate");
                fin = true;
            } else if (m.winCondition(positions, player) == 1) {
                System.out.println("Gana player 1");
                fin = true;
            } else if (m.winCondition(positions, player) == 2) {
                System.out.println("Gana player 2");
                fin = true;
            }
        }

    }
}