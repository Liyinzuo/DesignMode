package main.factory.abstractFactory;

/**
 * 抽象工厂模式
 *
 *
 */
public interface AbstractFactory {

    // 让下面工厂子类具体实现
    Animal getAnimal(String type);

}
