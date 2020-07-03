package cn.niudehua.design.pattern.structural.adapter;

/**
 * @author: deng
 * @datetime: 2020/7/3 9:47 上午
 * @desc:
 */
public class AC220 {
    public int outputAC220V() {
        int output = 220;
        System.out.println("输出交流电：" + output + "V");
        return output;
    }
}
