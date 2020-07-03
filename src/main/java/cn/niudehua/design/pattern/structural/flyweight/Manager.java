package cn.niudehua.design.pattern.structural.flyweight;

/**
 * @author: deng
 * @datetime: 2020/7/3 11:28 下午
 * @desc:
 */
public class Manager implements Employee {
    @Override
    public void report() {
        System.out.println(reportContent);
    }

    // 内部状态
    private String title = "部门经理";

    // 外部状态
    private String department;
    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }
}
