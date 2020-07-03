package cn.niudehua.design.pattern.structural.adapter.classadapter;

/**
 * @author: deng
 * @datetime: 2020/7/3 9:35 上午
 * @desc:
 */
public class Test {
    public static void main(String[] args) {
        Target concreteTarget = new ConcreteTarget();
        concreteTarget.request();
        Target target = new Adapter();
        target.request();
    }
}
