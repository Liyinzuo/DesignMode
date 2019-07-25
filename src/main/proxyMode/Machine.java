package main.proxyMode;

/**
 * Created by Administrator on 2019/7/25.
 *
 * 代理对象
 */
public class Machine implements ProxyInterFace{
    private TrainStation station = new TrainStation();

    @Override
    public void buyTicket() {
        station.buyTicket();
    }
}
