package cn.niudehua.design.principle.openclose;

import java.math.BigDecimal;

/**
 * @author: deng
 * @datetime: 2020/6/20 12:06 上午
 * @desc:
 */
public class JavaDiscountCourse extends JavaCourse{
    public JavaDiscountCourse(Integer id, String name, BigDecimal price) {
        super(id, name, price);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().multiply(new BigDecimal("0.8"));
    }
}
