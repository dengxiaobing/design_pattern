package cn.niudehua.design.pattern.creational.factorymethod;

/**
 * @author: deng
 * @datetime: 2020/6/21 10:29 上午
 * @desc:
 */
public class Test {
    public static void main(String[] args) {
        AbstractVideoFactory javaVideoFactory = new JavaVideoFactory();
        AbstractVideoFactory pythonVideoFactory = new PythonVideoFactory();
        AbstractVideoFactory feVideoFactory = new FEVideoFactory();

        Video javaVideo = javaVideoFactory.getVideo();
        Video pythonVideo = pythonVideoFactory.getVideo();
        Video feVideo = feVideoFactory.getVideo();

        javaVideo.produce();
        pythonVideo.produce();
        feVideo.produce();
    }
}
