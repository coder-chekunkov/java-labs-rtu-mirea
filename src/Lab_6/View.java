package Lab_6;

import java.util.Scanner;

import static Lab_6.Main.masEmployer;

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
            default -> {
                System.out.println("Ошибка!");
                menu();
            }
        }

    }

    public static void showEmployer() {
        System.out.println("Все сотрудники: ");
        System.out.println(" ");
        for (Employer employer : masEmployer) {
            System.out.println(employer.toString());
        }
    }


}
