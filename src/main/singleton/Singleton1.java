package main.singleton;


/**
 * 饿汉式单例模式 (静态变量)
 *
 * 优点：类装载已经完成了实例化 但是线程安全
 * 缺点：提前实例化，没有达到预期的懒加载的效果，如果不使用则会造成内存的浪费
 *
 */
public class Singleton1 {

    // 类装载的时候即已经实例化
    private final static Singleton1 instance = new Singleton1();

    // 构造器私有化
    private Singleton1() {

    }

    // 提供公有的获取方法
    public static Singleton1 getInstance() {
        return instance;
    }
}
