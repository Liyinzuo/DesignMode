package main.bridgePattern;

public class BridgeTest {

    public static void main(String[] args) {

        Chicken chicken = new WhiteChicken(new ChinaChicken());
        System.out.println(chicken.eat());

        Chicken chicken1 = new BlackChicken(new OtherCountryChicken());
        System.out.println(chicken1.eat());
    }
}
