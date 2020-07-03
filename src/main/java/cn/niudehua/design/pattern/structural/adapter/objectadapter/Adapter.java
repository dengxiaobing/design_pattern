package cn.niudehua.design.pattern.structural.adapter.objectadapter;


/**
 * @author: deng
 * @datetime: 2020/7/3 9:35 上午
 * @desc:
 */
public class Adapter implements Target {
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        // ...
        adaptee.adapteeRequest();
        // ...
    }
}
