package main.bridgePattern;

public abstract class Chicken {

    private IChicken iChicken;

    public Chicken(IChicken iChicken) {
        this.iChicken = iChicken;
    }

    protected String eat() {
        return this.iChicken.eat();
    }
}
