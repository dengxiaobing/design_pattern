package cn.niudehua.design.principle.singleresponsibility;

/**
 * @author: deng
 * @datetime: 2020/6/20 1:16 上午
 * @desc:
 */
public class Test {
    public static void main(String[] args) {
//        Bird bird = new Bird();
//        bird.mainMoveMode("大雁");
//        bird.mainMoveMode("鸵鸟");

        // 类的单一职责原则
        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");
        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");
    }
}
