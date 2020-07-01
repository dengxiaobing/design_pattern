package cn.niudehua.design.pattern.creational.prototype.abstractprototype;

/**
 * @author: deng
 * @datetime: 2020/7/1 11:04 上午
 * @desc:
 */
public class B extends A{
    public static void main(String[] args) throws CloneNotSupportedException {
        B b = new B();
        B bTmp = (B) b.clone();
        System.out.println(b);
        System.out.println(bTmp);
    }
}
