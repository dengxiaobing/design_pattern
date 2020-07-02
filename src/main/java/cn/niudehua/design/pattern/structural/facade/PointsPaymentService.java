package cn.niudehua.design.pattern.structural.facade;

/**
 * @author: deng
 * @datetime: 2020/7/2 4:40 下午
 * @desc:
 */
public class PointsPaymentService {
    public boolean pay(PointsGift pointsGift) {
        // 扣减积分
        System.out.println("支付" + pointsGift.getName() + "积分成功");
        return true;
    }
}
