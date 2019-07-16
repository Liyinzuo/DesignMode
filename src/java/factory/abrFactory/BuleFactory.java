package java.factory.abrFactory;

public class BuleFactory implements AbstractFactory {


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
