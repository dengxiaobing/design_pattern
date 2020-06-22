package cn.niudehua.design.pattern.creational.builder;

/**
 * @author: deng
 * @datetime: 2020/6/22 9:00 下午
 * @desc:
 */
public abstract class CourseBuilder {


    public abstract void buildCourseName(String courseName);

    public abstract void buildCoursePPT(String coursePPT);

    public abstract void buildCourseVideo(String courseVideo);

    public abstract void buildCourseArticle(String courseArticle);

    public abstract void buildCourseQA(String courseQA);

    public abstract Course makeCourse();


}

