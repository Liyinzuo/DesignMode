package main.adaptive.objectAdaptive;

/**
 * 适配转换
 */
public class RubbishImpl implements IRubbish {

    private Rubbish rubbish;

    public RubbishImpl(Rubbish rubbish) {
        this.rubbish = rubbish;
    }

    @Override
    public String IRubbish() {
        System.out.println("转成湿辣鸡");
        String rubbishName = rubbish.howRubbish();
        String newRubbish = "湿辣鸡";
        return newRubbish;
    }
}
