package cn.niudehua.design.principle.dependencyinversion;

/**
 * @author: deng
 * @datetime: 2020/6/20 12:30 上午
 * @desc:
 */
public class Test {
    public static void main(String[] args) {
        // v1 -->面向实现
//        Niu niu = new Niu();
//        niu.studyJavaCourse();
//        niu.studyPythonCourse();
//        niu.studyGolangCourse();

        // v2 -->接口方法实现
//        Niu niu = new Niu();
//        niu.studyProgrammingCourse(new JavaCourse());
//        niu.studyProgrammingCourse(new PythonCourse());
//        niu.studyProgrammingCourse(new GolangCourse());

        // v3 -->构造注入
//        Niu niu = new Niu(new JavaCourse());
//        niu.studyProgrammingCourse();
//        Niu niu1 = new Niu(new PythonCourse());
//        niu1.studyProgrammingCourse();
//        Niu niu2 = new Niu(new GolangCourse());
//        niu2.studyProgrammingCourse();

        // v4 -->setter 注入
        Niu niu = new Niu();
        niu.setiCourse(new JavaCourse());
        niu.studyProgrammingCourse();
        niu.setiCourse(new PythonCourse());
        niu.studyProgrammingCourse();
        niu.setiCourse(new GolangCourse());
        niu.studyProgrammingCourse();
    }
}
