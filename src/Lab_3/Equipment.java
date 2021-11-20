package Lab_3;

public class Equipment {

    int hands;
    int body;

    public Equipment(int hands, int body) {
        this.hands = hands;
        this.body = body;
    }

    public String toString() {
        return "Урон руками: " + hands + "; Защита корпуса: " + body + ";";
    }

}

