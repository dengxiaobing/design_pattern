package cn.niudehua.design.principle.openclose;

import java.math.BigDecimal;

/**
 * @author: deng
 * @datetime: 2020/6/19 12:19 上午
 * @desc:
 */
public class JavaCourse implements ICourse {
    private Integer id;
    private String name;
    private BigDecimal price;

    public JavaCourse(Integer id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public BigDecimal getPrice() {
        return this.price;
    }


}
