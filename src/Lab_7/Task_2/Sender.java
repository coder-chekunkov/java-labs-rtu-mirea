package Lab_7.Task_2;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Sender {

    static final String RESET = "\033[0m";
    static final String RED_BOLD = "\033[1;31m";
    static final String BLUE_BOLD = "\033[1;34m";
    static final String BLACK_BOLD = "\033[1;30m";
    static final String GREEN_BOLD = "\033[1;32m";

    static Scanner sc = new Scanner(System.in);
    static PrintWriter out;
    static BufferedReader in;
    static String name;

    public static void main(String[] args) throws IOException {

        System.out.print(BLACK_BOLD + "Для подключения к серверу введите свое имя: " + RESET);
        name = sc.nextLine();

        Socket clientSocket = new Socket("127.0.0.1", 27001);
        System.out.println(GREEN_BOLD + "Вы подключились к серверу!" + RESET);
        out = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        out.println(name);
        out.flush();

        System.out.println("Для того чтобы " + BLACK_BOLD + "отправить пользователям сообщение " + RESET +
                "- введите текст и нажмите " + BLACK_BOLD + "\"Enter\" ." + RESET);
        System.out.println("Для того чтобы " + BLACK_BOLD + "создать нового кота " + RESET +
                "- введите " + GREEN_BOLD + "\"%create_cat% ." + RESET);
        System.out.println("Для того чтобы " + BLACK_BOLD + "посмотреть всех котов " + RESET +
                "- введите " + GREEN_BOLD + "\"%show_cats% ." + RESET);
        System.out.println("Для того чтобы " + BLACK_BOLD + "отправить кота " + RESET +
                "другим пользователям - введите " + GREEN_BOLD + "\"%send_cat% . " + RESET);
        System.out.println("Для того чтобы " + BLACK_BOLD + "покинуть " + RESET +
                "данный сервер - введите " + RED_BOLD + "%stop%" + RESET);
        showSpace();

        while (true) {
            String message = enterMessage();
            out.println(name);
            out.flush();
            if (message.equals("%stop%")){
                out.println(message);
                out.flush();
                System.out.println("Клиент " + BLACK_BOLD + name + RESET + RED_BOLD + " покинул сервер!" + RESET);
                out.close();
                return;
            }
            out.println(message);
            out.flush();

            String name = in.readLine();
            String word = in.readLine();
            System.out.println(BLACK_BOLD + "%" + name + "%: " + RESET + word);
        }
    }

    public static String enterMessage() {
        System.out.print(BLUE_BOLD + name + RESET + ": ");
        return sc.nextLine();
    }

    public static void showSpace() {
        System.out.println(BLACK_BOLD + "-------------------------" + RESET);
    }
}

