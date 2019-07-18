package main.prototype.simplePrototype;

import main.prototype.People;

public class ModeTest {

    /**
     * 浅克隆: 不用重新初始化对象，动态获取对象运行时的状态
     *          可以简化对象的创建过程
     *
     * @param args
     */
    public static void main(String[] args) {
        People people = new People("原型", 1, "shanghai");
        System.out.println(people.toString());
        System.out.println("原型HaseCode: "+  people.hashCode());

        People people1 = null;
        try {
            people1 = people.clone();
            System.out.println(people1);
            System.out.println("克隆HaseCode: "+  people1.hashCode());
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(people == people1);

        people.setAge(100);
        System.out.println(people1);

    }
}
