package cn.niudehua.design.principle.demeter;

/**
 * @author: deng
 * @datetime: 2020/6/21 1:21 上午
 * @desc:
 */
public class Boss {

    //    public void commandCheckNumber(TeamLead teamLead) {
//        List<Course> courseList = new ArrayList<>();
//        for (int i = 0; i < 20; i++) {
//            courseList.add(new Course());
//        }
//        teamLead.checkNumberOfCourse(courseList);
//    }
    public void commandCheckNumber(TeamLeader teamLeader) {
        teamLeader.checkNumberOfCourse();
    }
}
