package cn.niudehua.design.pattern.structural.facade;

/**
 * @author: deng
 * @datetime: 2020/7/2 4:38 下午
 * @desc:
 */
public class QualifyService {
    public boolean isAvailable(PointsGift pointsGift) {
        System.out.println("校验" + pointsGift.getName() + " 积分资格通过");
        return true;
    }
}
