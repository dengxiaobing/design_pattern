package cn.niudehua.design.pattern.structural.flyweight;

/**
 * @author: deng
 * @datetime: 2020/7/3 11:34 下午
 * @desc:
 */
public class Test {
    private static final String departments[] = {"RD", "QA", "PM", "BD"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String department = departments[(int) (Math.random() * departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();
        }
    }
}
