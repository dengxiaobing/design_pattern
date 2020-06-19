package cn.niudehua.design.principle.singleresponsibility;

/**
 * @author: deng
 * @datetime: 2020/6/20 1:05 上午
 * @desc:
 */
public class Bird {
    public void mainMoveMode(String birdName) {
        if ("鸵鸟".equals(birdName)) {
            System.out.println(birdName + "会走");
        } else {
            System.out.println(birdName + "会飞");
        }
    }
}
