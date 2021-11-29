package Lab_6;

import java.util.Scanner;

public class AddMyself {

    static Scanner sc = new Scanner(System.in);

    public static Employer setMyselfEmployer() {
        System.out.print("Введите ФИО работника: ");
        String FIO = sc.nextLine();
        System.out.print("Введите дату рождения работника: ");
        String birthdayDate = sc.nextLine();
        System.out.print("Введите должность работника: ");
        String position = sc.nextLine();
        System.out.print("Введите город работника: ");
        String nameOfCity = sc.nextLine();

        return new Employer(FIO, birthdayDate, position, nameOfCity);
    }

}
