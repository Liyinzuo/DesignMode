package java.factory.abrFactory;

/**
 * 抽象工厂模式
 *
 *
 */
public interface AbstractFactory {

    // 让下面工厂子类具体实现
    abstract Animal getAnimal(String type);

}
