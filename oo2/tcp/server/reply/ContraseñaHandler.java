package tcp.server.reply;

import java.io.PrintWriter;

public class ContraseñaHandler implements IMessageHandler {

    @Override
    public void handleMessage(String message, PrintWriter out) {
        String[] respuesta = message.split(" ");
        if (respuesta.length != 3) {
            Exception e = new IllegalArgumentException(
                    "Formato incorrecto. Debe ser: <usuario> <contraseña> <respuesta>");
        }
        String letras = respuesta[0];
        String numeros = respuesta[1];
        String especialñes = respuesta[2];

        // generar contraseña aleatoria
        StringBuilder contrasena = new StringBuilder();
        for (int j = 0; j < 8; j++) {
            int tipo = (int) (Math.random() * 3);
            switch (tipo) {
                case 0:
                    contrasena.append(letras.charAt((int) (Math.random() * letras.length())));
                    break;
                case 1:
                    contrasena.append(numeros.charAt((int) (Math.random() * numeros.length())));
                    break;
                case 2:
                    contrasena.append(especialñes.charAt((int) (Math.random() * especialñes.length())));
                    break;
            }

        }

    }

}
