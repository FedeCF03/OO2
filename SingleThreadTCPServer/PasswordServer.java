import java.io.PrintWriter;
import java.util.Random;

public class PasswordServer extends SingleThreadTCPServer {
    private final Random random = new Random();

    public void handleMessage(String message, PrintWriter out) {
        String[] args = message.split(" ");
        if (args.length != 3) {
            out.println("longitud invaldia");
            return;
        }

        String caracter = args[0];
        String numero = args[1];
        String simbolo = args[2];

        out.println(generarContra(caracter, numero, simbolo));
    }

    private String generarContra(String letters, String numbers, String specialChars) {
        StringBuilder password = new StringBuilder(8);

        password.append(getRandomChar(letters));

        password.append(getRandomChar(numbers));

        password.append(getRandomChar(specialChars));

        while (password.length() < 8) {
            String source = random.nextBoolean() ? letters : numbers;
            password.append(getRandomChar(source));
        }

        // Shuffle the characters
        return shuffleString(password.toString());
    }

    private char getRandomChar(String source) {
        return source.charAt(random.nextInt(source.length()));
    }

    private String shuffleString(String input) {
        char[] characters = input.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            int randomIndex = random.nextInt(characters.length);
            char temp = characters[i];
            characters[i] = characters[randomIndex];
            characters[randomIndex] = temp;
        }
        return new String(characters);
    }
}
