package main.facedemode;

/**
 * Created by Administrator on 2019/7/24.
 */
public class SuperMarket {

    private FaceInterface pur;
    private FaceInterface pro;

    public SuperMarket() {
        this.pur = new Purchase();
        this.pro = new Production();
    }

    public void getPur() {
        pur.food();
    }

    public void getPro() {
        pro.food();
    }

}
