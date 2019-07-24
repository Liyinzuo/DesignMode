package main.flyweightpattern;

import main.facedemode.FaceInterface;

/**
 * Created by Administrator on 2019/7/24.
 * 享元模式: 理念是重用现有的类，通过缓存的构造理念，将状态相同，复用性多且状态变化小的对象存储于缓存中(享元模式在存储于hashmap中)，适用于有着大量的对象实例时使用
 * 优点：如果有相同的业务请求，直接返回在内存中已有的对象，避免重新创建，减少了类的重复创建减少了内存的使用
 * 缺点：实例存于线程共享的堆中，因此有着线程安全问题
 *
 * 即hashmap里最后里面也只有三个对象实例(类模板)
 */
public class SameMode implements FaceInterface{

    private String name;
    private int price;
    private int age;

    public SameMode(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void food() {
        System.out.println("SameMode{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", age=" + age +
                '}');
    }
}
