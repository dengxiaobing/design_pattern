package cn.niudehua.design.pattern.creational.singleton;

/**
 * @author: deng
 * @datetime: 2020/6/23 12:00 上午
 * @desc:
 */
public class LazyDoubleCheckSingleton {
  volatile    private static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    // 创建对象分为以下3个指令 如果不用volatile修饰指令可能会乱序
                    // 1.分配内存给这个对象（分配内存地址）
                    // 2.初始化对象
                    // 3.将lazyDoubleCheckSingleton指向这个内存地址
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }

}
