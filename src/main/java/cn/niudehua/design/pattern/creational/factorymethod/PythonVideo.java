package cn.niudehua.design.pattern.creational.factorymethod;

/**
 * @author: deng
 * @datetime: 2020/6/21 10:27 上午
 * @desc:
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python视频");
    }
}
