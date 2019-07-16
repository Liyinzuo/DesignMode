package main.factory.abstractFactory;

public class Zoo {

    public static void main(String[] args) {

        AbstractFactory abstractFactory = new BuleFactory();

        abstractFactory.getAnimal("chicken").run();
    }


}
