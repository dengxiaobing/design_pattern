package cn.niudehua.design.pattern.creational.singleton;

/**
 * @author: deng
 * @datetime: 2020/6/23 9:47 下午
 * @desc:
 */
public class HungrySingleton {
    private static HungrySingleton hungrySingleton = null;

    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
