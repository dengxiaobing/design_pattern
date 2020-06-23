package cn.niudehua.design.pattern.creational.singleton;

/**
 * @author: deng
 * @datetime: 2020/6/22 10:33 下午
 * @desc:
 */
public class Test {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new T());
        Thread thread2 = new Thread(new T());
        Thread thread3 = new Thread(new T());
        Thread thread4 = new Thread(new T());
        Thread thread5 = new Thread(new T());
        Thread thread6 = new Thread(new T());
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();

        System.out.println("main Thread end");
    }
}
