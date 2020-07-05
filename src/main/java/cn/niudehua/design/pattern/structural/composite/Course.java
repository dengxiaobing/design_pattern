package cn.niudehua.design.pattern.structural.composite;

/**
 * @author: deng
 * @datetime: 2020/7/4 12:14 上午
 * @desc:
 */
public class Course extends BaseCatalogComponent {
    private String courseName;
    private double coursePrice;

    public Course(String courseName, double coursePrice) {
        this.courseName = courseName;
        this.coursePrice = coursePrice;
    }

    @Override
    public String getName(BaseCatalogComponent baseCatalogComponent) {
        return this.courseName;
    }

    @Override
    public double getPrice(BaseCatalogComponent baseCatalogComponent) {
        return this.coursePrice;
    }

    @Override
    public void print() {
        System.out.println("Course Name:" + courseName + " Course Price:" + coursePrice);
    }
}
