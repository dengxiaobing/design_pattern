package cn.niudehua.design.pattern.creational.simplefactory;

/**
 * @author: deng
 * @datetime: 2020/6/21 10:29 上午
 * @desc:
 */
public class Test {
    public static void main(String[] args) {
        // v1
//        JavaVideo javaVideo = new JavaVideo();
//        javaVideo.produce();

        // v2
//        VideoFactory videoFactory = new VideoFactory();
//        Video pythonVideo = videoFactory.getVideo("Python");
//        if (pythonVideo == null) {
//            return;
//        }
//        pythonVideo.produce();

        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if (video == null) {
            return;
        }
        video.produce();
    }
}
