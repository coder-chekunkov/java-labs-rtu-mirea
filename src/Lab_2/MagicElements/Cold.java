package Lab_2.MagicElements;

import Lab_2.Logic.Element;

public class Cold implements Element {
    @Override
    public int getDamage() {
        return 6;
    }

    @Override
    public String getElementName() {
        return "Холод";
    }
}

