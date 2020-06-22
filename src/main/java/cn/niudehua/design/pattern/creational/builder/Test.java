package cn.niudehua.design.pattern.creational.builder;

/**
 * @author: deng
 * @datetime: 2020/6/22 9:19 下午
 * @desc:
 */
public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);
        Course course = coach.makeCourse("Java设计模式精讲", "Java设计模式PPT", "Java设计模式精讲视频", "Java设计模式精讲手记", "Java设计模式精讲问答");
        System.out.println(course);
    }
}
