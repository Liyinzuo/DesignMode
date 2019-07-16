package main.factory.simpleFactory;

/**
 * 简单工厂模式/静态工厂模式
 * 是由一个工厂对象决定创建处哪一种产品类的实例
 * 定义一个创建对象的类，由这个类来封装实例化对象行为的代码
 *
 * 缺点可扩展性差 类型太多的话代码并不美观 而且因为所有的对象创建都是由这个简单工厂创建 所以一旦出问题 其他都会受牵连
 */
public class SimpleFactory {

    public static Animal getAnimal(String type) {
        if (type.equals("cat")) {
            return new Cat();
        }else if (type.equals("dog")) {
            return new Dog();
        } else {
            return new Chicken();
        }
    }
}


