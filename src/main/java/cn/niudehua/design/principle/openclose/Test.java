package cn.niudehua.design.principle.openclose;

import java.math.BigDecimal;

/**
 * @author: deng
 * @datetime: 2020/6/20 12:01 上午
 * @desc:
 */
public class Test {
    public static void main(String[] args) {
//        ICourse javaCourse = new JavaCourse(96, "JAVA", new BigDecimal(36));
//        System.out.println("课程ID："+javaCourse.getId());
//        System.out.println("课程名称："+javaCourse.getName());
//        System.out.println("课程价格："+javaCourse.getPrice());

        ICourse javaDiscountCourse = new JavaDiscountCourse(96, "JAVA", new BigDecimal("36"));
        System.out.println("课程ID：" + javaDiscountCourse.getId());
        System.out.println("课程名称：" + javaDiscountCourse.getName());
        System.out.println("课程价格：" + javaDiscountCourse.getPrice());
    }

}
