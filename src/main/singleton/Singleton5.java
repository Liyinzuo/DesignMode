package main.singleton;


/**
 * 饿汉式单例模式
 *
 * 优点：实现了懒加载 且不会出现内存浪费的问题
 * 缺点：线程并不会安全 相反会有效率的问题
 *
 *
 */
/*public class Singleton5 {


    private static Singleton5 instance;

    // 构造器私有化
    private Singleton5() {

    }

    // 提供公有的获取方法
    public static Singleton5 getInstance() {
        if (instance == null) {
            synchronized(Singleton5.class) {
                instance = new Singleton5();
            }

        }
        return instance;
    }
}*/
