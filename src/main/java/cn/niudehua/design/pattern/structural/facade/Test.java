package cn.niudehua.design.pattern.structural.facade;

/**
 * @author: deng
 * @datetime: 2020/7/2 4:55 下午
 * @desc:
 */
public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("烘干机");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointsGift);
    }
}
