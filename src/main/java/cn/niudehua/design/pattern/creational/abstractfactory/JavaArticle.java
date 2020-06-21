package cn.niudehua.design.pattern.creational.abstractfactory;

/**
 * @author: deng
 * @datetime: 2020/6/21 7:11 下午
 * @desc:
 */
public class JavaArticle extends AbstractArticle {
    @Override
    public void produce() {
        System.out.println("编写Java文章");
    }
}
