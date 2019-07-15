package java.singleton;


/**
 * 单例模式 枚举
 *
 * 优点：防止多线程同步问题， 而且还能防止反序列化重新创建新的对象
 */
enum Singleton {

    INSTANCE;

    public void updateInstance () {

    }
}
