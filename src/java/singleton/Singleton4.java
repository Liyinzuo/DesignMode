package java.singleton;


/**
 * 饿汉式单例模式
 *
 * 优点：实现了懒加载 且不会出现内存浪费的问题 而且线程安全
 * 缺点： 相反会有效率的问题
 */
public class Singleton4 {


    private static Singleton4 instance;

    // 构造器私有化
    private Singleton4() {

    }

    // 提供公有的获取方法
    public static synchronized Singleton4 getInstance() {
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }
}
