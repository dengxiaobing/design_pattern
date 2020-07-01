package cn.niudehua.design.pattern.creational.prototype.abstractprototype;

/**
 * @author: deng
 * @datetime: 2020/7/1 11:02 上午
 * @desc:
 */
public abstract class A implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("Class clone method");
        return super.clone();
    }
}
