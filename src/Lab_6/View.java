package Lab_6;

import java.util.Comparator;
import java.util.Scanner;

import static Lab_6.Main.masEmployer;
import static Lab_6.Main.masTask;

public class View {

    public static final String RESET = "\033[0m";
    public static final String RED_BOLD = "\033[1;31m";
    public static final String BLACK_BOLD = "\033[1;30m";
    public static final String GREEN_BOLD = "\033[1;32m";

    static Scanner sc = new Scanner(System.in);

    public static void menu() {
        System.out.println("--------------------------");
        System.out.println(" ");
        System.out.println(BLACK_BOLD + "Возможные действия: " + RESET);
        System.out.println(BLACK_BOLD + "0." + RESET + " Остановить программу.");
        System.out.println(BLACK_BOLD + "1." + RESET + " Добавить сотрудника рандомно.");
        System.out.println(BLACK_BOLD + "2." + RESET + " Добавить сотрудника самостоятельно.");
        System.out.println(BLACK_BOLD + "3." + RESET + " Вывести всех работников.");
        System.out.println(BLACK_BOLD + "4." + RESET + " Добавить задачу самостоятельно.");
        System.out.println(BLACK_BOLD + "5." + RESET + " Вывести все задачи.");
        System.out.println(BLACK_BOLD + "6." + RESET + " Вывести задачу с максимальным гонораром.");
        System.out.println(BLACK_BOLD + "7." + RESET + " Вывести ТОП-3 сотрудников по выполнению заданий.");
        System.out.println(BLACK_BOLD + "8." + RESET + " Сохранить спиоск сотрудников в файл.");
        System.out.println(BLACK_BOLD + "9." + RESET + " Сохранить отчет о выполненных заданиях в файл.");
        System.out.print(BLACK_BOLD + "Выберите цифру: " + RESET);
        int number = sc.nextInt();
        switch (number) {
            case 0 -> System.exit(0);
            case 1 -> {
                masEmployer.add(AddRandom.setRandomEmployer());
                System.out.println(GREEN_BOLD + "Сотрудник добавлен!" + RESET);
                menu();
            }
            case 2 -> {
                masEmployer.add(AddMyself.setMyselfEmployer());
                System.out.println(GREEN_BOLD + "Сотрудник добавлен!" + RESET);
                menu();
            }
            case 3 -> {
                showEmployer();
                menu();
            }
            case 4 -> {
                masTask.add(AddMyself.setMySelfTask());
                System.out.println(GREEN_BOLD + "Задача добавлена!" + RESET);
                menu();
            }
            case 5 -> {
                showTask();
                menu();
            }
            case 6 -> {
                showTaskWithMaxFee();
                menu();
            }
//            case 7 -> {
//                menu();
//            }
            case 8 -> {
                SaveEmployer.createFileWithEmployers();
                menu();
            }
//            case 9 -> {
//
//                menu();
//            }
            default -> {
                System.out.println(RED_BOLD + "Ошибка!" + RESET);
                menu();
            }
        }
    }

    public static void showEmployer() {
        System.out.println(" ");
        System.out.println(GREEN_BOLD + "Все сотрудники: " + RESET);
        for (Employer employer : masEmployer) {
            System.out.println(employer.toString());
        }
    }

    public static void showTask() {
        System.out.println(" ");
        System.out.println(GREEN_BOLD + "Все задачи: " + RESET);
        for (Task task : masTask) {
            System.out.println(task.toString());
        }
    }

    public static void showTaskWithMaxFee() {
        System.out.println(" ");
        System.out.println(GREEN_BOLD + "Задача с максимальным гонораром: " + RESET);
        Object taskWithMaxFee = masTask.stream().max(Comparator.comparing(Task::getFee)).orElse(null);
        System.out.println(taskWithMaxFee);
    }
}
