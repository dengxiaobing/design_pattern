package cn.niudehua.design.pattern.creational.prototype.clone;

import java.util.Date;

/**
 * @author: deng
 * @datetime: 2020/7/1 3:06 下午
 * @desc:
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(0L);
        Pig pig = new Pig("佩奇", date);
        Pig pig2 = (Pig) pig.clone();
        System.out.println(pig);
        System.out.println(pig2);
        pig.getBirthday().setTime(666666666666L);
        System.out.println(pig);
        System.out.println(pig2);
    }
}
