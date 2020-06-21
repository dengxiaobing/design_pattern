package cn.niudehua.design.pattern.creational.factorymethod;

/**
 * @author: deng
 * @datetime: 2020/6/21 2:56 下午
 * @desc:
 */
public class FEVideo extends Video {

    @Override
    public void produce() {
        System.out.println("录制FE视频");
    }
}
