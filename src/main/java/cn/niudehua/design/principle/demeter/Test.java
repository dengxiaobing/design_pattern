package cn.niudehua.design.principle.demeter;

/**
 * @author: deng
 * @datetime: 2020/6/21 1:26 上午
 * @desc: 迪米特法则 最少知道原则
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
