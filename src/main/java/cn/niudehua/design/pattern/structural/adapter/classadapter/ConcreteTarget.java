package cn.niudehua.design.pattern.structural.adapter.classadapter;

/**
 * @author: deng
 * @datetime: 2020/7/3 9:34 上午
 * @desc:
 */
public class ConcreteTarget implements Target {

    @Override
    public void request() {
        System.out.println("具体的目标实现方法");
    }
}
