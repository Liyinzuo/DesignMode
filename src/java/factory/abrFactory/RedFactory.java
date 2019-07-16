package java.factory.abrFactory;

public class RedFactory implements AbstractFactory {


    @Override
    public  Animal getAnimal(String type) {
        if (type.equals("chicken")) {
            return new RedChicken();
        } else if (type.equals("dog")) {
            return new RedDog();
        } else if (type.equals("cat")) {
            return new RedCat();
        } else {
            return null;
        };
    }
}
