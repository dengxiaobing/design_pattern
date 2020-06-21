package cn.niudehua.design.pattern.creational.simplefactory;

/**
 * @author: deng
 * @datetime: 2020/6/21 10:27 上午
 * @desc:
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java视频");
    }
}
