package Lab_6;

import java.util.Comparator;
import java.util.Scanner;

import static Lab_6.Main.masEmployer;
import static Lab_6.Main.masTask;

public class View {

    static Scanner sc = new Scanner(System.in);

    public static void menu() {
        System.out.println(" ");
        System.out.println("--------------------------");
        System.out.println(" ");
        System.out.println("Возможные действия: ");
        System.out.println("0. Остановить программу.");
        System.out.println("1. Добавить сотрудника рандомно.");
        System.out.println("2. Добавить сотрудника самостоятельно.");
        System.out.println("3. Вывести всех работников.");
        System.out.println("4. Добавить задачу самостоятельно.");
        System.out.println("5. Вывести все задачи.");
        System.out.println("6. Вывести задачу с максимальным гонораром.");
        System.out.print("Выберите цифру: ");
        int number = sc.nextInt();
        switch (number) {
            case 0 -> System.exit(0);
            case 1 -> {
                masEmployer.add(AddRandom.setRandomEmployer());
                System.out.println("Сотрудник добавлен!");
                menu();
            }
            case 2 -> {
                masEmployer.add(AddMyself.setMyselfEmployer());
                System.out.println("Сотрудник добавлен!");
                menu();
            }
            case 3 -> {
                showEmployer();
                menu();
            }
            case 4 -> {
                masTask.add(AddMyself.setMySelfTask());
                System.out.println("Задача добавлена!");
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
            default -> {
                System.out.println("Ошибка!");
                menu();
            }
        }
    }

    public static void showEmployer() {
        System.out.println(" ");
        System.out.println("Все сотрудники: ");
        System.out.println(" ");
        for (Employer employer : masEmployer) {
            System.out.println(employer.toString());
        }
    }

    public static void showTask() {
        System.out.println(" ");
        System.out.println("Все задачи: ");
        System.out.println(" ");
        for (Task task : masTask) {
            System.out.println(task.toString());
        }
    }

    public static void showTaskWithMaxFee() {
        System.out.println(" ");
        System.out.println("Все задачи: ");
        System.out.println(" ");
        Object taskWithMaxFee = masTask.stream().max(Comparator.comparing(Task::getFee)).orElse(null);
        System.out.println(taskWithMaxFee);

    }
}
