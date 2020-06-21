package cn.niudehua.design.pattern.creational.abstractfactory;

/**
 * @author: deng
 * @datetime: 2020/6/21 7:11 下午
 * @desc:
 */
public class PythonVideo extends AbstractVideo {
    @Override
    public void produce() {
        System.out.println("录制Python视频");
    }
}
