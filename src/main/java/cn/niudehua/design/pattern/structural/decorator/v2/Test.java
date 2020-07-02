package cn.niudehua.design.pattern.structural.decorator.v2;

/**
 * @author: deng
 * @datetime: 2020/7/2 10:03 下午
 * @desc:
 */
public class Test {
    public static void main(String[] args) {
        BaseBattercake battercake;
        battercake = new Battercake();
        battercake = new EggDecorator(battercake);
        battercake = new SausageDecorator(battercake);
        battercake = new SausageDecorator(battercake);
        System.out.println(battercake.getDesc() + " 销售价格" + battercake.cost());
    }
}
