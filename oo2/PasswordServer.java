
import tcp.server.reply.IConnectionHandler;
import tcp.server.reply.IMessageHandler;
import tcp.server.reply.SingleConnectionHandler;
import tcp.server.reply.TCPControlLoop;

public class PasswordServer {
    private IMessageHandler handler;
    private IConnectionHandler connectionHandler;
    private TCPControlLoop controlLoop;

    public PasswordServer() {
        this.handler = handler;
        this.connectionHandler = new SingleConnectionHandler(handler);
        this.controlLoop = new TCPControlLoop(connectionHandler);
    }

    public void iniciarSv(String args[]) {
        controlLoop.startLoop(args);
    }
}
