package cn.niudehua.design.pattern.structural.composite;

/**
 * @author: deng
 * @datetime: 2020/7/5 10:04 上午
 * @desc:
 */
public class Test {
    public static void main(String[] args) {
        BaseCatalogComponent linuxCourse = new Course("Linux课程", 11);
        BaseCatalogComponent windowsCourse = new Course("windows课程", 11);

        BaseCatalogComponent javaCourseCatalog = new CourseCatalog("Java课程目录",2);
        BaseCatalogComponent javaSECourse = new Course("JavaSE课程", 55);
        BaseCatalogComponent javaEECourse = new Course("JavaEE课程", 66);
        BaseCatalogComponent javaWebCourse = new Course("JavaWeb课程", 77);
        BaseCatalogComponent designPattern = new Course("Java设计模式", 88);

        javaCourseCatalog.add(javaSECourse);
        javaCourseCatalog.add(javaEECourse);
        javaCourseCatalog.add(javaWebCourse);
        javaCourseCatalog.add(designPattern);

        BaseCatalogComponent imoocMainCourseCatalog = new CourseCatalog("慕课网课程主目录",1);
        imoocMainCourseCatalog.add(linuxCourse);
        imoocMainCourseCatalog.add(windowsCourse);
        imoocMainCourseCatalog.add(javaCourseCatalog);

        imoocMainCourseCatalog.print();
    }
}
