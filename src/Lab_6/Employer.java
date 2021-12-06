package Lab_6;

public class Employer {

    public static final String RESET = "\033[0m";
    public static final String BLACK_BOLD = "\033[1;30m";

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
        return BLACK_BOLD + "ФИО: " + RESET + FIO +
                BLACK_BOLD + "; " + "Дата рождения: " + RESET + birthdayDate +
                BLACK_BOLD + "; Должность: " + RESET + position +
                BLACK_BOLD + "; Город: " + RESET + nameOfCity +
                BLACK_BOLD + ";" + RESET;
    }

    public String toTextFile() {
        return "ФИО: " + FIO +
                "; " + "Дата рождения: " + birthdayDate +
                "; Должность: " + position +
                "; Город: " + nameOfCity +
                ";";
    }
}
