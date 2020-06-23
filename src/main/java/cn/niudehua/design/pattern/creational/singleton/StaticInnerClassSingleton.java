package cn.niudehua.design.pattern.creational.singleton;

/**
 * @author: deng
 * @datetime: 2020/6/23 9:32 下午
 * @desc:
 */
public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton() {
    }

    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }


}
