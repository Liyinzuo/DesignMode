package main.builder;

public class buildTest {


    public static void main(String[] args) {
        // 先建造普通
        HouseBuildImpl houseBuild = new HouseBuildImpl();
        // 构造注入指挥者 告诉指挥者建造什么类型
        HouseDirector houseDirector = new HouseDirector(houseBuild);
        // 获取完成对象
        House house = houseDirector.getHouse();


        HighBuildImpl highBuild = new HighBuildImpl();
        houseDirector = new HouseDirector(highBuild);
        House house1 = houseDirector.getHouse();
    }

}
