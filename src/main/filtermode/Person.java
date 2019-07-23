package main.filtermode;

/**
 * 过滤器模式: 过滤器顾名思义就是筛选符合/不符合条件的类
 * 实现方式: 创建筛选接口 每种不同筛选需求继承实现需求即可
 */
public class Person {

    private String name;
    private String sex;

    public Person(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
