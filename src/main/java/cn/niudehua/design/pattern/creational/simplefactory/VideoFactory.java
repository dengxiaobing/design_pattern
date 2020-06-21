package cn.niudehua.design.pattern.creational.simplefactory;

import java.util.List;

/**
 * @author: deng
 * @datetime: 2020/6/21 10:31 上午
 * @desc:
 */
public class VideoFactory {
    //v2
//    public Video getVideo(String type) {
//        if ("Java".equals(type)) {
//            return new JavaVideo();
//        } else if ("Python".equals(type)){
//            return new PythonVideo();
//        }
//        return null;
//
//    }

    Video video = null;


    public Video getVideo(Class c) {
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
        return video;

    }


}
