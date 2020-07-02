package cn.niudehua.design.pattern.structural.decorator.v1;

/**
 * @author: deng
 * @datetime: 2020/7/2 8:51 下午
 * @desc:
 */
public class BattercakeWithEgg extends Battercake {
    @Override
    protected String getDesc() {
        return super.getDesc() + "加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}
