import java.io.PrintWriter;

public class RepeatServer extends SingleThreadTCPServer {

    public void handleMessage(String message, PrintWriter out) {
        String[] args = message.split(" ");
        if (args.length != 3) {
            out.println("string invalid");
            return;
        }
        String string = args[0];
        String CantRepetir = args[1];
        String Delimitador = args[2];

        if (string.equals("") || CantRepetir.equals("")) {
            out.println("string invalid");
            return;
        }
        if (Delimitador.equals("") || Delimitador == null) {
            Delimitador = " ";
        }
        out.println(repeatString(string, Integer.parseInt(CantRepetir), Delimitador));
    }

    private String repeatString(String string, int count, String delimiter) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(string);
            if (i < count - 1) {
                result.append(delimiter);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {

        new RepeatServer().startLoop(args);

    }

}
