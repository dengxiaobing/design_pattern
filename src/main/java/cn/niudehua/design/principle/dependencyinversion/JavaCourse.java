package cn.niudehua.design.principle.dependencyinversion;

/**
 * @author: deng
 * @datetime: 2020/6/20 12:33 上午
 * @desc:
 */
public class JavaCourse implements ICourse{
    @Override
    public void studyProgrammingCourse() {
        System.out.println("Niu在学习Java");
    }
}
