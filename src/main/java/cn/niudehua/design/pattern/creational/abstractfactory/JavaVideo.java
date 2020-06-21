package cn.niudehua.design.pattern.creational.abstractfactory;

/**
 * @author: deng
 * @datetime: 2020/6/21 7:11 下午
 * @desc:
 */
public class JavaVideo extends AbstractVideo {
    @Override
    public void produce() {
        System.out.println("录制Java视频");
    }
}
