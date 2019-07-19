package main.adaptive.classAdaptive;

/**
 * 适配转换
 */
public class RubbishImpl extends Rubbish implements IRubbish{

    @Override
    public String IRubbish() {
        System.out.println("转成湿辣鸡");
        String rubbish = super.howRubbish();
        String newRubbish = "湿辣鸡";
        return newRubbish;
    }
}
