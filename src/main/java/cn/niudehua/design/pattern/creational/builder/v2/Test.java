package cn.niudehua.design.pattern.creational.builder.v2;


import cn.niudehua.design.pattern.creational.builder.v2.Course.CourseBuild;

/**
 * @author: deng
 * @datetime: 2020/6/22 9:39 下午
 * @desc:
 */
public class Test {
    public static void main(String[] args) {
        Course course = new CourseBuild().buildCourseName("Java设计模式精讲课程").buildCoursePPT("Java设计模式课程PPT").buildCourseArticle("Java设计模式精讲课程手记").build();
        System.out.println(course);
    }
}
