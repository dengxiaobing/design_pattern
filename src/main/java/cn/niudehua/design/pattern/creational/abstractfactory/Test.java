package cn.niudehua.design.pattern.creational.abstractfactory;

/**
 * @author: deng
 * @datetime: 2020/6/21 9:06 下午
 * @desc:
 */
public class Test {
    public static void main(String[] args) {
        AbstractCouseFactory javaCourseFactory = new JavaCourseFactory();
        AbstractVideo javaVideo = javaCourseFactory.getVideo();
        AbstractArticle javaArticle = javaCourseFactory.getArticle();
        javaVideo.produce();
        javaArticle.produce();
    }
}
