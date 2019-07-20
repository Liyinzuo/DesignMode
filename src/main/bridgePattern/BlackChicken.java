package main.bridgePattern;

public class BlackChicken extends Chicken {

    public BlackChicken(IChicken iChicken) {
        super(iChicken);
    }

    public String eat() {
        return "乌骨鸡"+super.eat();
    }
}
