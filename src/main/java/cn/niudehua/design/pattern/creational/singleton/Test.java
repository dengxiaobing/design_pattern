package cn.niudehua.design.pattern.creational.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author: deng
 * @datetime: 2020/6/22 10:33 下午
 * @desc:
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Thread thread1 = new Thread(new T());
//        Thread thread2 = new Thread(new T());
//        Thread thread3 = new Thread(new T());
//        Thread thread4 = new Thread(new T());
//        Thread thread5 = new Thread(new T());
//        Thread thread6 = new Thread(new T());
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        thread4.start();
//        thread5.start();
//        thread6.start();
//
//        System.out.println("program end");

        HungrySingleton instance = HungrySingleton.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        objectOutputStream.writeObject(instance);
        File file = new File("singleton_file");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        HungrySingleton newInstance = (HungrySingleton) objectInputStream.readObject();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);

    }
}
