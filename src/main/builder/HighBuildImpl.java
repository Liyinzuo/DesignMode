package main.builder;

/**
 * 建造者实现类
 */
public class HighBuildImpl extends HouseBuild {

    @Override
    public void buildBase() {
        System.out.println("高楼地基500M");
    }

    @Override
    public void buildWall() {
        System.out.println("高楼砌墙10M");
    }
}
