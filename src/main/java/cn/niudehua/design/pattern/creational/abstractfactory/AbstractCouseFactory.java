package cn.niudehua.design.pattern.creational.abstractfactory;

/**
 * @author: deng
 * @datetime: 2020/6/21 7:07 下午
 * @desc:
 */
public abstract class AbstractCouseFactory {
    abstract AbstractVideo getVideo();
    abstract AbstractArticle getArticle();

}
