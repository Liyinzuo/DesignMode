package main.proxyMode;

/**
 * Created by Administrator on 2019/7/25.
 *
 * 代理对象： 在代理模式中，一个类代表另一个类的功能。
 * 实现理念即是为其他对象提供一种代理以控制对复杂且不方便直接获取的对象的访问，为其增加中间层起到访问中转的作用
 *
 * 举例： 购买火车票 假设火车票只能在火车站系统买到
 *       售票机就是代理，他从火车站拿票直接贩卖
 *       我们直接使用售票机买票即可 但是票还是从火车站系统出来的
 *
 * 优点：需求清晰 如果再增加一个不同需求的代理也很方便所以扩展性很好 多了层代理"火车站的票就不会被抢了"安全性高
 * 缺点：多了个代理类，少了一个类的内存
 */
public class ProxyBuyTicket {

    public static void main(String[] args) {
        ProxyInterFace face = new Machine();
        System.out.println("售票机收取手续费");
        face.buyTicket();
    }


}
