package cn.niudehua.design.pattern.structural.decorator.v1;

/**
 * @author: deng
 * @datetime: 2020/7/2 9:52 下午
 * @desc:
 */
public class BattercakeWithEggSausage extends BattercakeWithEgg {
    @Override
    protected String getDesc() {
        return super.getDesc() + "加一条香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
