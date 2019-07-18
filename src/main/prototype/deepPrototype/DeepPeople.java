package main.prototype.deepPrototype;


import java.io.*;

public class DeepPeople implements Serializable ,Cloneable{

    private String name;
    private int age;
    private String home;
    private DeepFood deepFood;

    public DeepPeople(String name, int age, String home) {
        this.name = name;
        this.age = age;
        this.home = home;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public DeepFood getDeepFood() {
        return deepFood;
    }

    public void setDeepFood(DeepFood deepFood) {
        this.deepFood = deepFood;
    }

    @Override
    public String toString() {
        return "DeepPeople{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", home='" + home + '\'' +
                ", deepFood=" + deepFood +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepPeople deepPeople = (DeepPeople) super.clone();
        deepPeople.setDeepFood(this.deepFood.clone());
        return deepPeople;
    }

}
