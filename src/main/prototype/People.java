package main.prototype;

public class People implements Cloneable{

    private String name;
    private int age;
    private String home;

    public People(String name, int age, String home) {
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

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", home='" + home + '\'' +
                '}';
    }


    public People clone() throws CloneNotSupportedException {
        return (People) super.clone();
    }
}
