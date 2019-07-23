package main.compositepattern;

/**
 * Created by Administrator on 2019/7/23.
 */
public class EmployeeTest {

    public static void main(String[] args) {
        // 主管
        Employee one = new Employee("老大", 1, 10000.0); //1
        Employee one1 = new Employee("主管1", 2, 5000.0); //2
        //Employee one2 = new Employee("主管2", 12, 5000.0);

        // 管理组
        Employee two = new Employee("员工1", 3, 3000.0); //3
        Employee two1 = new Employee("员工2", 3, 3000.0); //3
        Employee two2 = new Employee("员工3", 3, 3000.0); //3
        Employee two3 = new Employee("员工4", 3, 3000.0); //3
        Employee two4 = new Employee("员工5", 3, 3000.0); //3

        // 组合
        one.add(one1);
        one1.add(two);
        one1.add(two1);
        one1.add(two2);
        one1.add(two3);
        one1.add(two4);

        System.out.println("董事长 :" + one.toString());
        for (int i = 0; i <one.underLing.size(); i++) {
            System.out.println("主管信息 :" + one.underLing.get(i).toString());
            for (int j = 0; j < one.underLing.get(i).underLing.size(); j++) {
                System.out.println("员工信息 :" + one.underLing.get(i).underLing.get(j).toString());
            }
        }
    }

}
