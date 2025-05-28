package tcp.server.reply;

import java.io.PrintWriter;

public class EchoHandler implements IMessageHandler {

    @Override
    public void handleMessage(String message, PrintWriter out) {
        out.println(message);
    }
}