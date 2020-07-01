package cn.niudehua.design.pattern.creational.singleton;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @author: deng
 * @datetime: 2020/6/23 9:47 下午
 * @desc:
 */
public class HungrySingleton implements Serializable {
    private static HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton() {
        if (hungrySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    public Object readResolve() {
        return hungrySingleton;
    }

    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class hungrySingletonClass = HungrySingleton.class;
        Constructor declaredConstructor = hungrySingletonClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        HungrySingleton instance = HungrySingleton.getInstance();
        Field hungrySingleton = instance.getClass().getDeclaredField("hungrySingleton");
        hungrySingleton.setAccessible(true);
        hungrySingleton.set(instance, null);
        HungrySingleton newInstance = (HungrySingleton) declaredConstructor.newInstance();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }
}
