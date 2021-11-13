package Lab_5;

import java.util.ArrayList;

public class Main {

    static ArrayList<Worker> masWorkers = new ArrayList<>(5);

    public static void main(String[] args) {
        System.out.println("-------------------------");
        System.out.println(" ");
        System.out.println("Введите 5 работников компании.");
        AddWorker addWorker = new AddWorker(masWorkers);

    }
}
