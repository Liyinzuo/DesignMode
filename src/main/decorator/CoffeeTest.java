package main.decorator;

import main.decorator.coffeeMode.Coffee1;
import main.decorator.dosing.Dosing1;
import main.decorator.dosing.Dosing3;

public class CoffeeTest {

    public static void main(String[] args) {
        // 装饰者模式下单 一份咖啡 多种配料
        Drink drink = new Coffee1();
        System.out.println("收钱" + drink.cost());
        System.out.println("描述" + drink.getDes());

        // 加配料
        drink = new Dosing1(drink);
        System.out.println("加入配料收钱" + drink.cost());
        System.out.println("加入配料描述" + drink.getDes());

        /*// 再加
        drink = new Dosing3(drink);
        System.out.println("加入配料收钱" + drink.cost());
        System.out.println("加入配料描述" + drink.getDes());*/

    }
}
