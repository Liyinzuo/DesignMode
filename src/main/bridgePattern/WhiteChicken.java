package main.bridgePattern;

public class WhiteChicken extends Chicken {

    public WhiteChicken(IChicken iChicken) {
        super(iChicken);
    }

    public String eat() {
        return "白羽鸡"+super.eat();
    }
}
