package Lab_4;

import java.util.ArrayList;

public class Main {

    static ArrayList<Worker> masWorkers = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("-------------------------");
        System.out.println(" ");
        createWorkers();
        showWorkers();
    }

    public static void createWorkers() {
        String[] firstNames = {"Александр", "Владимир", "Светлана", "Петр", "Николай", "Екатерина",
                "Артем", "Алексей", "Геннадий", "Андрей", "Анастасия", "Никита", "Варвара", "Илья"};
        String[] lastNames = {"Головко", "Черных", "Витали", "Будяну", "Сокол", "Челибидаху", "Мольтке",
                "Бойко", "Дурново", "Гама", "Леонкавалло", "Пуччини", "Вальх", "Кодай"};
        String[] namesOfCats = {"Барсик", "Цунами", "Клеопатра", "Наоми", "Маркиза", "Пират", "Зорро",
                "Валли", "Каспер", "Том", "Гарфилд"};
        String[] namesOfDepartments = {"Разработка", "Финансовый отдел", "Бухгалтерия", "Отдел Рекламы",
                "Отдел набора кадров"};
        String[] positions = {"Junior", "Middle", "Senior"};

        for (int i = 0; i < 20; i++) {
            int numberForFirstName = (int) (Math.random() * firstNames.length);
            String firstName = firstNames[numberForFirstName];

            int numberForLastName = (int) (Math.random() * lastNames.length);
            String lastName = lastNames[numberForLastName];

            int age = 20 + (int) (Math.random() * 45);

            String sex;
            int isSex = (int) (Math.random() * 10);
            if (isSex % 2 == 0) {
                sex = "Мужчина";
            } else {
                sex = "Женщина";
            }

            String nameOfCat;
            int isCat = (int) (Math.random() * 10);
            if (isCat % 2 == 0) {
                nameOfCat = "Отсутсвует";
            } else {
                int numberForNameOfCat = (int) (Math.random() * namesOfCats.length);
                nameOfCat = namesOfCats[numberForNameOfCat];
            }

            int numberForNameOfDepartment = (int) (Math.random() * namesOfDepartments.length);
            String nameOfDepartment = namesOfDepartments[numberForNameOfDepartment];

            int numberForPosition = (int) (Math.random() * positions.length);
            String position = positions[numberForPosition];

            int salary = 60000 + (int) (Math.random() * 350000);

            int prize = (int) (Math.random() * 15000);

            int yearOfWork = 1 + (int) (Math.random() * 5);

            Worker new_worker = new Worker(firstName, lastName, sex, nameOfCat, nameOfDepartment,
                    position, yearOfWork, age, salary, prize);
            masWorkers.add(new_worker);
        }
    }

    public static void showWorkers(){
        for (Worker w: masWorkers) {
            System.out.println(w.toString());
            System.out.println(" ");
        }
    }


}
