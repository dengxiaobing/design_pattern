package cn.niudehua.design.pattern.creational.abstractfactory;

/**
 * @author: deng
 * @datetime: 2020/6/21 7:10 下午
 * @desc:
 */
public class PythonCourseFactory extends AbstractCouseFactory {
    @Override
    AbstractVideo getVideo() {
        return new PythonVideo();
    }

    @Override
    AbstractArticle getArticle() {
        return new PythonArticle();
    }
}
