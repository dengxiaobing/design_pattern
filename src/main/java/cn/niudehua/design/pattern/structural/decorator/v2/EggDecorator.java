package cn.niudehua.design.pattern.structural.decorator.v2;

/**
 * @author: deng
 * @datetime: 2020/7/2 9:59 下午
 * @desc:
 */
public class EggDecorator extends BaseDecorator {
    public EggDecorator(BaseBattercake baseBattercake) {
        super(baseBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}
