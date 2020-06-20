package cn.niudehua.design.principle.singleresponsibility;

/**
 * @author: deng
 * @datetime: 2020/6/21 12:50 上午
 * @desc: 接口的单一职责原则
 */
public class CourseImpl implements ICourseContent, ICourseManger {

    @Override
    public String courseName() {
        return null;
    }

    @Override
    public byte[] courseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
