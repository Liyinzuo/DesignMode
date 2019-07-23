package main.decorator.dosing;

import main.decorator.Decorator;
import main.decorator.Drink;

public class Dosing3 extends Decorator {

    public Dosing3(Drink obj) {
        super(obj);
        setDes("配料3");
        setPrice(3.0f);
    }
}
