package Lab_6;

public class Employer {

    String FIO;
    String birthdayDate;
    String position;
    String nameOfCity;

    public Employer(String FIO, String birthdayDate, String position, String nameOfCity) {
        this.FIO = FIO;
        this.birthdayDate = birthdayDate;
        this.position = position;
        this.nameOfCity = nameOfCity;
    }

    public String toString() {
        return "ФИО: " + FIO + "; " + "Дата рождения: " + birthdayDate + "; Должность: " + position +
                "; Город: " + nameOfCity + ";";
    }

}
