package cn.niudehua.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: deng
 * @datetime: 2020/6/21 1:22 上午
 * @desc:
 */
public class TeamLeader {
    //    public void checkNumberOfCourse(List<Course> courseList) {
//        System.out.println("课程的数量是："+courseList.size());
//
//    }
    public void checkNumberOfCourse() {
        List<Course> courseList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        System.out.println("课程的数量是：" + courseList.size());
    }
}
