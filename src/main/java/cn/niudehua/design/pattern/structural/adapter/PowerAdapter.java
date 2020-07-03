package cn.niudehua.design.pattern.structural.adapter;

/**
 * @author: deng
 * @datetime: 2020/7/3 9:50 上午
 * @desc:
 */
public class PowerAdapter implements DC5 {
    private AC220 ac220 = new AC220();

    @Override
    public int outputDC5V() {
        int adapterInput = ac220.outputAC220V();

        // 变压器...
        int adapterOutput = adapterInput / 44;
        System.out.println("使用PowerAdapter输入AC: " + adapterInput + "V" + "  输出DC：" + adapterOutput+"V");
        return adapterInput;
    }
}
