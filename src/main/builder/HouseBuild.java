package main.builder;

/**
 * 建造者抽象类
 */
public abstract class HouseBuild {

    protected House house = new House();

    //建造过程
    public abstract void buildBase();
    public abstract void buildWall();

    //组合建造
    public House getHouse() {
        return house;
    }
}
