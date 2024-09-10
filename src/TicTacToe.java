import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TicTacToe {

    public String[] resetField()
    {
        return new String[]{" ", " ", " ", " ", " ", " ", " ", " ", " "};
    }
    public boolean checkFreeSpot(int pos, String[] positions)
    {
        return !positions[pos-1].equals(" ");
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
        String check = player == 1? "X": "O";

        if(positions[0].equals(check))
        {
            if (positions[1].equals(check) && positions[2].equals(check) || positions[4].equals(check) && positions[8].equals(check) || positions[3].equals(check) && positions[6].equals(check))
                return player;
        }
        else if(positions[4].equals(check))
        {
            if(positions[1].equals(check) && positions[7].equals(check) || positions[2].equals(check) && positions[6].equals(check) || positions[3].equals(check) && positions[5].equals(check))
                return player;
        }
        else if (positions[8].equals(check))
        {
            if(positions[2].equals(check) && positions[5].equals(check) || positions[6].equals(check) && positions[7].equals(check))
                return player;
        }

        if (!Arrays.asList(positions).contains(" "))
            return 0;
        return -1;
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        TicTacToe m = new TicTacToe();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int player;
        int turn = 0;
        int selection;
        boolean fin = false;
        String[] positions = m.resetField();
        while (!fin)
        {
            player = turn%2==0? 1: 2;

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