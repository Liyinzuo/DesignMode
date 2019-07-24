package main.flyweightpattern;

import java.util.Random;

/**
 * Created by Administrator on 2019/7/24.
 */
public class FlyweightTest {
    private static final String[] strings = new String[] {"chicken", "beef", "pig"};
    private static Random random = new Random();

    public static void main(String[] args) {

        for (int i = 0; i <20 ; i++) {
            SameMode s = ModeFactory.getSame(strings[getRandom()]);
            s.setAge(getandom1());
            s.setPrice(getandom1());
            s.food();
        }
    }

    private static int getRandom() {
        return random.nextInt(3);
    }

    private static int getandom1() {
        return random.nextInt(100);
    }


}
