package cn.niudehua.design.pattern.structural.decorator.v2;

/**
 * @author: deng
 * @datetime: 2020/7/2 9:57 下午
 * @desc:
 */
public abstract class BaseDecorator extends BaseBattercake {
    private BaseBattercake baseBattercake;

    public BaseDecorator(BaseBattercake baseBattercake) {
        this.baseBattercake = baseBattercake;
    }

    @Override
    protected String getDesc() {
        return this.baseBattercake.getDesc();
    }

    @Override
    protected int cost() {
        return this.baseBattercake.cost();
    }
}
