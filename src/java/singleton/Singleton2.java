package java.singleton;


/**
 * 饿汉式单例模式 (静态代码块)
 *
 * 优缺点与静态变量一样
 */
public class Singleton2 {

    private static Singleton2 instance;

    static {
        instance = new Singleton2();
    }

    // 构造器私有化
    private Singleton2() {

    }

    // 提供公有的获取方法
    public static Singleton2 getInstance() {
        return instance;
    }
}
