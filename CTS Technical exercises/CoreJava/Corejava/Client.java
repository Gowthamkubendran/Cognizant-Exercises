import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        final String HOST = "localhost";
        final int PORT = 1234;

        try (Socket socket = new Socket(HOST, PORT)) {
            System.out.println("Connected to server.");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));

            Thread receive = new Thread(() -> {
                try {
                    String msg;
                    while ((msg = in.readLine()) != null) {
                        System.out.println("Server: " + msg);
                    }
                } catch (IOException e) {
                    System.out.println("Connection closed.");
                }
            });

            Thread send = new Thread(() -> {
                try {
                    String msg;
                    while ((msg = consoleInput.readLine()) != null) {
                        out.println(msg);
                    }
                } catch (IOException e) {
                    System.out.println("Error sending message.");
                }
            });

            receive.start();
            send.start();

            receive.join();
            send.join();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
