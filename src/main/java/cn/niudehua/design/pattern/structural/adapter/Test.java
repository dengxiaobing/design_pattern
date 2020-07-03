package cn.niudehua.design.pattern.structural.adapter;

/**
 * @author: deng
 * @datetime: 2020/7/3 9:53 上午
 * @desc:
 */
public class Test {
    public static void main(String[] args) {
        DC5 powerAdapter = new PowerAdapter();
        powerAdapter.outputDC5V();
    }
}
