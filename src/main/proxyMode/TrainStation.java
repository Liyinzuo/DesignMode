package main.proxyMode;

/**
 * Created by Administrator on 2019/7/25.
 *
 * 火车站购票 (被代理对象)
 */
public class TrainStation implements ProxyInterFace{

    @Override
    public void buyTicket() {
        System.out.println("从火车站拿票");
    }
}
