package Lab_3;

import java.util.ArrayList;

public class Creature {

    String name;
    int hp;
    int damage;
    ArrayList<Equipment> masEquipment = new ArrayList<>();

    public Creature(String name, int hp, int damage, int hands, int body){
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        Equipment eq = new Equipment(hands, body);
        masEquipment.add(eq);
    }

    String str = "";
    public String toString(){
        for (Equipment e : masEquipment) {
            str = e.toString();
        }
        return "Имя: " + name + "; Очки здоровья: " + hp + "; Базовая сила атаки: " + damage + "; " + str;
    }
}