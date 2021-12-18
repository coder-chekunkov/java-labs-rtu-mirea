package Lab_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static final String RESET = "\033[0m";
    public static final String RED_BOLD = "\033[1;31m";
    public static final String BLACK_BOLD = "\033[1;30m";
    public static final String GREEN_BOLD = "\033[1;32m";

    static ServerSocket serverSocket;
    static Socket clientSocket;
    static BufferedReader in;

    public static void main(String[] args) throws IOException {

        serverSocket = new ServerSocket(27001);

        System.out.println(GREEN_BOLD + "Сервер был запущен!" + RESET);
        showSpace();
        System.out.println(GREEN_BOLD + "Ожидание подключений..." + RESET);
        showSpace();

        clientSocket = serverSocket.accept();
        System.out.println(GREEN_BOLD + "Соединение установленно." + RESET);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        while (true) {
            String word = in.readLine();
            if (word == null) {
                showSpace();
                System.out.println(RED_BOLD + "Соединение прерванно." + RESET);
                in.close();
                return;
            } else {
                System.out.println(BLACK_BOLD + "GET MESSAGE: " + RESET + word);
            }

        }
    }

    public static void showSpace() {
        System.out.println(BLACK_BOLD + "-------------------------" + RESET);
    }
}
