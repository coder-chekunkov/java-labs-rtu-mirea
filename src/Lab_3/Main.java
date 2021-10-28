package Lab_3;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    static ArrayList<Creature> masCreature = new ArrayList<>();
    static CreateField createField = new CreateField();

    public static void main(String[] args) {
        makeCreature();
        showHeroes();
        System.out.println(" ");
        System.out.println("-------------------------");
        System.out.println(" ");
        CreateField.makeFields();
    }

    //Метод, в котором создается 10 существ:
    public static void makeCreature(){
        String[] names_of_creatures = {"Андрей", "Борис", "Вова", "Глеб", "Дмитрий",
                "Елена", "Жора", "Зина", "Илья", "Коля"};
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            String name_creatures = names_of_creatures[i];
            int hp_creatures = rnd.nextInt(15)+1;
            int damage_creatures = rnd.nextInt(5)+1;
            int hands_creatures = rnd.nextInt(2)+1;
            int body_creatures = rnd.nextInt(2)+1;
            Creature new_creature = new Creature(name_creatures, hp_creatures, damage_creatures, hands_creatures, body_creatures);
            masCreature.add(new_creature);
        }
    }

    //Метод, в котором отображаются созданные существа:
    public static void showHeroes() {
        for (Creature c : masCreature) {
            System.out.println(c.toString());
        }
    }

}
