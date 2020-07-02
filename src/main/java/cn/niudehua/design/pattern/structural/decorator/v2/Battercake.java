package cn.niudehua.design.pattern.structural.decorator.v2;

/**
 * @author: deng
 * @datetime: 2020/7/2 9:56 下午
 * @desc:
 */
public class Battercake extends BaseBattercake {

    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
