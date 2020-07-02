package cn.niudehua.design.pattern.structural.facade;

/**
 * @author: deng
 * @datetime: 2020/7/2 4:43 下午
 * @desc:
 */
public class ShippingService {
    public String shipGift(PointsGift pointsGift) {
        // 物流系统的对接逻辑
        System.out.println(pointsGift.getName() + "进入物流系统");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}
