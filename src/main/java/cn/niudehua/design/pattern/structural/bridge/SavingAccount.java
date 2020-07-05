package cn.niudehua.design.pattern.structural.bridge;

/**
 * @author: deng
 * @datetime: 2020/7/5 10:38 上午
 * @desc:
 */
public class SavingAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开活期账号");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期账号");
    }
}
