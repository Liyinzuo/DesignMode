package main.chainmode;

/**
 * Created by Administrator on 2019/7/25.
 */
public class Apple extends ChainInterFace {


    @Override
    public void fruit(ChainInterFace chainInterFace) {
        if (chainInterFace == null) {
            System.out.println("吃个平果先");
        }
    }
}
