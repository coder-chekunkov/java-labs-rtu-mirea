package Lab_3;

import java.util.ArrayList;

public class Creature {

    public static final String RESET = "\033[0m";
    public static final String BLACK_BOLD = "\033[1;30m";

    String name;
    int hp;
    int atk;
    ArrayList<Equipment> equipment = new ArrayList<>();

    public Creature(String name, int hp, int atk, Equipment equipment) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.equipment.add(equipment);
    }

    public String toString() {
        return BLACK_BOLD + "Название существа: " + RESET + name +
                BLACK_BOLD + "; Здоровье: " + RESET + hp +
                BLACK_BOLD + "; Атака: " + RESET + atk +
                BLACK_BOLD + "; Экипировка: " + RESET + equipment.toString() + " ;";
    }

    public String getName() {
        return name;
    }

}
