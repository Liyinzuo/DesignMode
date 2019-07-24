package main.decorator.dosing;

import main.decorator.Decorator;
import main.decorator.Drink;

public class Dosing2 extends Decorator {

    public Dosing2(Drink obj) {
        super(obj);
        setDes("配料2");
        setPrice(2.0f);
    }
}
