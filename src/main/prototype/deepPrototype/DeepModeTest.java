package main.prototype.deepPrototype;

public class DeepModeTest {

    public static void main(String[] args) {
        // 第一种方式深克隆 通过重写cloneable的clone方法
        DeepFood deepFood = new DeepFood("food");
        DeepPeople deepPeople = new DeepPeople("深度", 2, "shanghai");
        deepPeople.setDeepFood(deepFood);

        try {
            DeepPeople deepPeople1 = (DeepPeople) deepPeople.clone();
            System.out.println(deepPeople1);
            System.out.println(deepPeople == deepPeople1);
        }catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
    }
}
