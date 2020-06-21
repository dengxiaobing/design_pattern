package cn.niudehua.design.pattern.creational.factorymethod;

/**
 * @author: deng
 * @datetime: 2020/6/21 2:57 下午
 * @desc:
 */
public class FEVideoFactory extends AbstractVideoFactory{
    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
