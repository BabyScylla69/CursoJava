import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class JuegoAhorcado {
    public int numberOfLettersGuessed(char guess, char[] word)
    {
        int guessAmmount = 0;
        for (char c : word) {
            if (guess == c) {
                guessAmmount++;
            }
        }
        return guessAmmount;
    }
    public char[] changeHiddenLettersGuessed(char guess, char[] hiddenWord, char[] word)
    {
        for (int i = 0; i < word.length; i++)
        {
            if(word[i] == guess)
            {
                hiddenWord[i] = guess;
            }
        }
        return hiddenWord;
    }
    public int returnGuessedLetters(char[] hiddenWord)
    {
        int count = 0;
        for (char c : hiddenWord) {
            if (c != '-') {
                count++;
            }
        }
        return count;
    }
    public boolean isLetterGuessed(char guess, char[] hidden)
    {
        for (char c : hidden) {
            if (c == guess) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        JuegoAhorcado m = new JuegoAhorcado();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int lettersInsideHiddenWord;
        int vidas = 5;

        boolean endGame = true;
        boolean startGame = false;

        System.out.println("Escriba la palabra secreta");
        String palabraSecreta = br.readLine().toLowerCase();

        char[] letras = palabraSecreta.toCharArray();
        char[] mostrarPalabra = new char[letras.length];
        char guess;

        System.out.println("La palabra secreta es: " + palabraSecreta + ", Es correcto? Yes/No");
        String confirmation = br.readLine().toLowerCase();

        if (confirmation.equals("yes"))
        {
            startGame = true;
            endGame = false;

            Arrays.fill(mostrarPalabra, '-');
        }

        while (startGame && !endGame)
        {
            System.out.println("La palabra tiene " + letras.length + " letras");
            System.out.println(Arrays.toString(mostrarPalabra));
            System.out.println("Te quedan " + vidas + " intentos");

            System.out.println("\n");

            System.out.println("Escriba una letra");
            guess = br.readLine().toLowerCase().charAt(0);

            lettersInsideHiddenWord = m.numberOfLettersGuessed(guess, letras);
            System.out.println("La letra que has escrito esta " + lettersInsideHiddenWord + " veces en la palabra secreta");

            if(m.numberOfLettersGuessed(guess, letras) > 0)
            {
                mostrarPalabra = m.changeHiddenLettersGuessed(guess, mostrarPalabra, letras);

                if (m.returnGuessedLetters(mostrarPalabra) == letras.length)
                {
                    System.out.println("Has ganado!");
                    System.out.println("La palabra era: " + Arrays.toString(letras));
                    endGame = true;
                }
            }
            else if(!m.isLetterGuessed(guess, mostrarPalabra))
            {
                vidas--;
            }

            if(vidas == 0)
            {
                System.out.println("Has perdido!");
                System.out.println("La palabra era: " + Arrays.toString(letras));
                endGame = true;
            }
        }

    }
}
