package main;


import java.util.concurrent.*;

/**
 * Created by Administrator on 2019/7/25.
 */
public class ExcetorsTest {

    public static void main(String[] args) throws Exception{
        ExecutorService service = Executors.newCachedThreadPool();
        Task t = new Task();
        Future<Integer> f = service.submit(t);
        Future<Integer> f1 = service.submit(t);
        System.out.println(""+f.get());
        System.out.println(""+f1.get());

        /*service.shutdown();
        service.awaitTermination(10, TimeUnit.SECONDS);*/

    }

}

class Task implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        Integer a = 0;
        System.out.println("计算子方法");
        for (int i = 0; i <10 ; i++) {
            a++;
        }
        return a;
    }
}
