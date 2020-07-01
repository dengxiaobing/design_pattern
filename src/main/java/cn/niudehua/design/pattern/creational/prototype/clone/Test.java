package cn.niudehua.design.pattern.creational.prototype.clone;

import cn.niudehua.design.pattern.creational.singleton.HungrySingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @author: deng
 * @datetime: 2020/7/1 3:06 下午
 * @desc:
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        Date date = new Date(0L);
//        Pig pig = new Pig("佩奇", date);
//        Pig pig2 = (Pig) pig.clone();
//        System.out.println(pig);
//        System.out.println(pig2);
//        pig.getBirthday().setTime(666666666666L);
//        System.out.println(pig);
//        System.out.println(pig2);

        // 克隆破坏单例
        HungrySingleton instance = HungrySingleton.getInstance();
        Method declaredMethod = instance.getClass().getDeclaredMethod("clone");
        declaredMethod.setAccessible(true);
        HungrySingleton newInstance = (HungrySingleton) declaredMethod.invoke(instance);
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }
}
