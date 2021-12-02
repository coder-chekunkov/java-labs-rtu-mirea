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

    public static Task setMySelfTask(){
        System.out.print("Введите название задачи: ");
        String name = sc.nextLine();
        System.out.print("Введите кол-во часов на выполнение: ");
        String buff_hoursToComplete = sc.nextLine();
        int hoursToComplete = Integer.parseInt(buff_hoursToComplete);
        System.out.print("Введите описание задачи: ");
        String info = sc.nextLine();
        System.out.print("Введите гонорар за выполнение данной задачи: ");
        String buff_fee = sc.nextLine();
        int fee = Integer.parseInt(buff_fee);
        System.out.print("Введите номер работника, который должен выполнить данную задачу: ");
        String buff_numberEmployer = sc.nextLine();
        int numberEmployer = Integer.parseInt(buff_numberEmployer);
        String status = "Открыта";

        return new Task(name, hoursToComplete, info, fee, numberEmployer, status);
    }

}
