package cn.niudehua.design.principle.interfacesegregation;

/**
 * @author: deng
 * @datetime: 2020/6/21 1:10 上午
 * @desc:
 */
//public class Dog implements IAnimalAction {
//
//    @Override
//    public void eat() {
//
//    }
//
//    @Override
//    public void fly() {
//
//    }
//
//    @Override
//    public void swim() {
//
//    }
//}

public class Dog implements IEatAnimalAction, ISwimAnimalAction {

    @Override
    public void eat() {

    }

    @Override
    public void swim() {

    }
}
