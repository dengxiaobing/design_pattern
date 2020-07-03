package cn.niudehua.design.pattern.structural.adapter.objectadapter;

/**
 * @author: deng
 * @datetime: 2020/7/3 9:42 上午
 * @desc:
 */
public class Test {
    public static void main(String[] args) {
        Target concreteTarget = new ConcreteTarget();
        concreteTarget.request();
        Target adapter = new Adapter();
        adapter.request();
    }
}
