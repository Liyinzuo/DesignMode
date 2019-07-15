package java.singleton;


/**
 * 饿汉式单例模式
 *
 * 优点：实现了懒加载 且不会出现内存浪费的问题
 * 缺点：但是线程是不安全
 *
 */
public class Singleton3 {


    private static Singleton3 instance;

    // 构造器私有化
    private Singleton3() {

    }

    // 提供公有的获取方法
    public static Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}
