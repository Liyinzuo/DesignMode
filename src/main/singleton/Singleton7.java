package main.singleton;


/**
 * 饿汉式单例模式 静态内部类
 *
 * 推荐使用
 */
public class Singleton7 {
    // 构造器私有化
    private Singleton7() {

    }

    // 静态内部类不会在一开始被装载 所有没有内存消耗问题 JVM在装载静态内部类是线程安全的 只有在使用内部类才会去装载 所以线程是安全的
    private static class SingletonInstance {
        private static final Singleton7 singleton7 = new Singleton7();
    }

    // 提供静态公有获取方法
    public static synchronized Singleton7 getInstance() {
        return SingletonInstance.singleton7;
    }
}
