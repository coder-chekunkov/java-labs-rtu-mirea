package Lab_4;

public class Worker {

    String firstName;
    String lastName;
    int age;
    String sex;
    String nameOfCat;
    String nameOfDepartment;
    String position;
    int salary;
    int prize;
    int yearsOfWork;

    public Worker(String firstName, String lastName, String sex, String nameOfCat, String nameOfDepartment,
                  String position, int yearsOfWork, int age, int salary, int prize) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
        this.nameOfCat = nameOfCat;
        this.nameOfDepartment = nameOfDepartment;
        this.position = position;
        this.salary = salary;
        this.prize = prize;
        this.yearsOfWork = yearsOfWork;
    }

    public String toString() {
        return "Имя: " + firstName + "; Фамилия: " + lastName + "; Возраст: " + age + "; Пол: " + sex
                + "; Имя кота: " + nameOfCat + "; Название отдела: " + nameOfDepartment + "; Должность: "
                + position + "; Зарплата: " + salary + "; Премия: " + prize + "; Годы работы: " + yearsOfWork;
    }
}
