package Lab_7;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    static final String RESET = "\033[0m";
    static final String RED_BOLD = "\033[1;31m";
    static final String BLACK_BOLD = "\033[1;30m";
    static final String GREEN_BOLD = "\033[1;32m";

    static ServerSocket serverSocket;
    static Socket clientSocket;
    static BufferedReader in;
    static BufferedWriter out;

    static String mainPassword = "12345";

    public static void main(String[] args) throws IOException {

        serverSocket = new ServerSocket(27001);

        System.out.println(GREEN_BOLD + "Сервер был запущен!" + RESET);
        showSpace();
        System.out.println(GREEN_BOLD + "Ожидание подключений" + RESET);
        showSpace();

        clientSocket = serverSocket.accept();
        System.out.println(GREEN_BOLD + "Соединение установленно." + RESET);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        while (true) {
            out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
            String word = in.readLine();
            if (word == null) {
                System.out.println(RED_BOLD + "Соединение прерванно." + RESET);
                in.close();
                return;
            } else {
                if (word.charAt(0) == '$') {
                    if (checkPassword(word)) {
                        System.out.println(GREEN_BOLD + "Пользователь ввел верный пароль: " + RESET + word + "$");
                        out.write("1" + "\n");
                    } else {
                        System.out.println(RED_BOLD + "Пользователь ввел не верный пароль: " + RESET + word + "$");
                        out.write("0" + "\n");
                    }
                    out.flush();
                } else {
                    System.out.println(BLACK_BOLD + "Полученное сообщение: " + RESET + word);
                }
            }
        }
    }

    public static boolean checkPassword(String buff_password) {
        StringBuilder new_password = new StringBuilder();
        for (int i = 1; i < buff_password.length(); i++) {
            new_password.append(buff_password.charAt(i));
        }
        return new_password.toString().equals(mainPassword);
    }


    public static void showSpace() {
        System.out.println(BLACK_BOLD + "-------------------------" + RESET);
    }
}
