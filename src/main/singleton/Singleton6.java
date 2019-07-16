package main.singleton;


/**
 * 饿汉式单例模式 双重检查模式
 *
 * 优点：实现了懒加载 且不会出现内存浪费的问题 而且线程安全 推荐使用
 */
public class Singleton6 {

    // volatile声明作用即是内存变量共享的作用
    private static volatile Singleton6 instance;

    // 构造器私有化
    private Singleton6() {

    }

    // 提供公有的获取方法
    public static synchronized Singleton6 getInstance() {

            if (instance == null) {
                synchronized (Singleton6.class) {
                    if (instance == null) {
                        instance = new Singleton6();
                    }
                }
            }

        return instance;
    }
}
