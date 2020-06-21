package cn.niudehua.design.pattern.creational.factorymethod;

/**
 * @author: deng
 * @datetime: 2020/6/21 2:43 下午
 * @desc:
 */
public class JavaVideoFactory extends AbstractVideoFactory{
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
