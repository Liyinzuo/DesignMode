package main.decorator;

// 装饰者
public class Decorator extends Drink {
    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        // getPrice 是配料的价格
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        // getDes 被装饰者信息
        return super.getDes() + " " + super.getPrice() + "&&" +obj.getDes();
    }
}
