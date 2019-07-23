package main.compositepattern;

import java.util.LinkedList;
import java.util.List;

/**
 * 组合模式:
 * 组合模式应用场景: 多个对象之间可以忽略他们不同，共用对象的属性
 * 就像公司主管管理管理组 管理组管制基层员工一样 他们都有着基本相同的属性、职称、薪资之类的...
 *
 * 组合模式优点: 代码可读性高 随时可以加入员工等职位信息扩展性较好
 * 缺点: 都是实现类违反了依赖倒转的原则
 */
public class Employee {

    private String name;
    private int age;
    private double sale;
    public List<Employee> underLing;

    public Employee(String name, int age, double sale) {
        this.name = name;
        this.age = age;
        this.sale = sale;
        underLing = new LinkedList<Employee>();
    }

    public void add(Employee under) {
        this.underLing.add(under);
    }

    public void remove(Employee under) {
        this.underLing.remove(under);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sale=" + sale +
                '}';
    }
}
