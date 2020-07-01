package cn.niudehua.design.pattern.creational.singleton;

/**
 * @author: deng
 * @datetime: 2020/6/23 9:32 下午
 * @desc:
 */
public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton() {
        // 反射攻击解决方法
        if (InnerClass.staticInnerClassSingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }


}
