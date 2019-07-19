package main.adaptive.objectAdaptive;

/**
 * 使用者 湿垃圾桶
 */
public class TrashCan {

    public void RubbishToIn(IRubbish rubbish) {
        String name = rubbish.IRubbish();

        if (name == "湿辣鸡"){
            System.out.println("湿辣鸡入桶成功");
        } else {
            System.out.println("罚款200");
        }
    }
}
