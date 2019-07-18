package main.builder;

/**
 * 建造者实现类
 * 制造流程与产品分开 解耦
 */
public class HouseBuildImpl extends HouseBuild {

    @Override
    public void buildBase() {
        System.out.println("普通房地基5M");
    }

    @Override
    public void buildWall() {
        System.out.println("普通房砌墙10CM");
    }
}
