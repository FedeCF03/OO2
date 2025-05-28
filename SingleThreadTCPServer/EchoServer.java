
import java.io.PrintWriter;
import java.net.Socket;

public class EchoServer extends SingleThreadTCPServer {

    public void handleMessage(String message, PrintWriter out) {
        out.println(message);
    }

    public static void main(String[] args) {

        new EchoServer().startLoop(args);

    }

}