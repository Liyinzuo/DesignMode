package java.factory.factoryMethod;

/**
 * 工厂模式
 *
 * 与简单工厂不同的是由工厂的子类去实现具体的实现方式
 */
public abstract class FactoryMethod {

    public abstract Animal getAnimal(String type);
}


