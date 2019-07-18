package main.builder;

/**
 * 指挥者
 */
public class HouseDirector {

    HouseBuild houseBuild = null;

    // 通过构造器传入或者set注入

    public HouseDirector(HouseBuild houseBuild) {
        this.houseBuild = houseBuild;
    }

    public void setHouseBuild(HouseBuild houseBuild) {
        this.houseBuild = houseBuild;
    }

    // 建造者的作用 建造顺序交由指挥者
    public House getHouse() {
        houseBuild.buildWall(); //先砌墙
        houseBuild.buildBase(); //再地基

        // 返回建造好的对象
        return houseBuild.getHouse();
    }
}
