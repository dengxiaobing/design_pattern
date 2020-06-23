package cn.niudehua.design.pattern.creational.singleton;

/**
 * @author: deng
 * @datetime: 2020/6/22 10:32 下午
 * @desc:
 */
public class T implements Runnable {
    @Override
    public void run() {
//        LazySingleton instance = LazySingleton.getInstance();
//        System.out.println(Thread.currentThread().getName() + "获取LazySingleton单例：" + instance);

//        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
//        System.out.println(Thread.currentThread().getName() + "获取LazyDoubleCheckSingleton单例：" + instance);
        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + "获取StaticInnerClassSingleton单例：" + instance);
    }
}
