package main.adaptive;

import main.adaptive.classAdaptive.RubbishImpl;
import main.adaptive.classAdaptive.TrashCan;

public class RubbishTest {

    public static void main(String[] args) {
        TrashCan trashCan = new TrashCan();
        trashCan.RubbishToIn(new RubbishImpl());
    }
}
