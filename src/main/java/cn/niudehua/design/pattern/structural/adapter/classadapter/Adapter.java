package cn.niudehua.design.pattern.structural.adapter.classadapter;

/**
 * @author: deng
 * @datetime: 2020/7/3 9:35 上午
 * @desc:
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        // ...
        super.adapteeRequest();
        // ...
    }
}
