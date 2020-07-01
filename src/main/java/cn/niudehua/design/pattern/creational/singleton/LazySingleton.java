package cn.niudehua.design.pattern.creational.singleton;

/**
 * @author: deng
 * @datetime: 2020/6/22 10:29 下午
 * @desc:
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton() {
        if (lazySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }

    }

    public static LazySingleton getInstance() {
        synchronized (LazySingleton.class) {
            if (lazySingleton == null) {
                lazySingleton = new LazySingleton();
            }
        }
        return lazySingleton;
    }
}
