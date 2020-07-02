package cn.niudehua.design.pattern.structural.decorator.v2;

/**
 * @author: deng
 * @datetime: 2020/7/2 10:01 下午
 * @desc:
 */
public class SausageDecorator extends BaseDecorator {
    @Override
    protected String getDesc() {
        return super.getDesc() + "加一条香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }

    public SausageDecorator(BaseBattercake baseBattercake) {
        super(baseBattercake);
    }

}
