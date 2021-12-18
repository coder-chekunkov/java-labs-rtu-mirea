package Lab_7;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static final String RESET = "\033[0m";
    public static final String RED_BOLD = "\033[1;31m";
    public static final String BLACK_BOLD = "\033[1;30m";
    public static final String GREEN_BOLD = "\033[1;32m";
    static Scanner sc = new Scanner(System.in);

    private static BufferedWriter out;

    public static void main(String[] args) throws IOException {

        Socket clientSocket = new Socket("127.0.0.1", 27001);
        System.out.println(GREEN_BOLD + "Вы подключились к серверу!" + RESET);

        while (true) {
            out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

            System.out.println(BLACK_BOLD + "Возможные действия: " + RESET);
            System.out.println(BLACK_BOLD + "0." + RESET + " Отключится от сервера.");
            System.out.println(BLACK_BOLD + "1." + RESET + " Отправить сообщение на сервер.");
            System.out.println(BLACK_BOLD + "2." + RESET + " Ввести пароль для получения файла.");
            System.out.print(BLACK_BOLD + "Выберите цифру: " + RESET);
            int number = sc.nextInt();
            switch (number) {
                case 0 -> {
                    System.out.println(RED_BOLD + "Отключение!" + RESET);
                    out.close();
                    return;
                }
                case 1 -> {
                    System.out.print("Введите сообщение, которое хотели бы отправить на сервер: ");
                    String message = sc.next();
                    out.write(message + "\n");
                    out.flush();
                }
                default -> System.out.println(RED_BOLD + "Ошибка!" + RESET);
            }
        }
    }

    public static void showSpace() {
        System.out.println(BLACK_BOLD + "-------------------------" + RESET);
    }
}
