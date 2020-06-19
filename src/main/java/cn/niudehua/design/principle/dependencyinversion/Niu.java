package cn.niudehua.design.principle.dependencyinversion;

/**
 * @author: deng
 * @datetime: 2020/6/20 12:27 上午
 * @desc:
 */
public class Niu {
    // v1 -->面向实现
//        public void studyJavaCourse() {
//        System.out.println("Niu在学习Java");
//    }
//
//    public void studyPythonCourse() {
//        System.out.println("Niu在学习Python");
//    }
//    public void studyGolangCourse() {
//        System.out.println("Niu在学习Golang");
//    }

    // v2 -->接口方法实现
//    public void studyProgrammingCourse(ICourse course) {
//        course.studyProgrammingCourse();
//    }

    // v3 -->构造注入
//    private ICourse iCourse;
//
//    public Niu(ICourse iCourse) {
//        this.iCourse = iCourse;
//    }
//
//    public void studyProgrammingCourse() {
//        iCourse.studyProgrammingCourse();
//    }

    // v4 setter注入
    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyProgrammingCourse() {
        iCourse.studyProgrammingCourse();
    }
}
