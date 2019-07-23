package main.decorator.dosing;

import main.decorator.Decorator;
import main.decorator.Drink;

public class Dosing1 extends Decorator {

    public Dosing1(Drink obj) {
        super(obj);
        setDes("配料111");
        setPrice(1.0f);
    }
}
