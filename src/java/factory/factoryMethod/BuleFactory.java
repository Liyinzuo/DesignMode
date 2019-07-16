package java.factory.factoryMethod;

public class BuleFactory extends FactoryMethod {
    @Override
    public Animal getAnimal(String type) {
        if (type.equals("chicken")) {
            return new BlueChinken();
        } else if (type.equals("dog")) {
            return new BlueDog();
        } else if (type.equals("cat")) {
            return new BuleCat();
        } else {
            return null;
        }
    }
}
