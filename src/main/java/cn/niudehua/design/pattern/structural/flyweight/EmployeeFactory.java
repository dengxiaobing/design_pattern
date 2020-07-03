package cn.niudehua.design.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: deng
 * @datetime: 2020/7/3 11:30 下午
 * @desc:
 */
public class EmployeeFactory {
    private static final Map<String, Employee> EMPLOYEE_MAP = new HashMap();

    public static Employee getManager(String department) {
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);
        if (manager == null) {
            manager = new Manager(department);
            System.out.println("创建部门经理：" + department);
            String reportContent = department + "部门汇报：此次报告的内容....";
            manager.setReportContent(reportContent);
            System.out.println("创建报告内容：" + reportContent);
            EMPLOYEE_MAP.put(department, manager);
        }
        return manager;

    }


}
