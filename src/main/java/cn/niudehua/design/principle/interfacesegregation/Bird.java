package cn.niudehua.design.principle.interfacesegregation;

/**
 * @author: deng
 * @datetime: 2020/6/21 1:10 上午
 * @desc:
 */
//public class Bird implements IAnimalAction {
//
//    @Override
//    public void eat() {
//        // ...
//    }
//
//    @Override
//    public void fly() {
//        // can't
//    }
//
//    @Override
//    public void swim() {
//
//    }
//}
public class Bird implements IEatAnimalAction, IFlyAnimalAction {

    @Override
    public void eat() {

    }

    @Override
    public void fly() {

    }
}