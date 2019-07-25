package main.chainmode;

/**
 * Created by Administrator on 2019/7/25.
 *
 *
 */
public abstract class ChainInterFace {

    private ChainInterFace chainInterFace;


    public ChainInterFace getChainInterFace() {
        return chainInterFace;
    }

    public void setChainInterFace(ChainInterFace chainInterFace) {
        this.chainInterFace = chainInterFace;
    }


    //责任下发
    abstract public void fruit(ChainInterFace chainInterFace);
}
