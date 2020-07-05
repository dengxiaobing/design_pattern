package cn.niudehua.design.pattern.structural.bridge;

/**
 * @author: deng
 * @datetime: 2020/7/5 10:38 上午
 * @desc:
 */
public class DepositAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开定期账号");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个定期账号");
    }
}
