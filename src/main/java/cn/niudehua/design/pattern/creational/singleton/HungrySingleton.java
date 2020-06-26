package cn.niudehua.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * @author: deng
 * @datetime: 2020/6/23 9:47 下午
 * @desc:
 */
public class HungrySingleton implements Serializable {
    private static HungrySingleton hungrySingleton = null;

    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }


    public Object readResolve() {
        return hungrySingleton;
    }
}
