package cn.niudehua.design.pattern.structural.bridge;

/**
 * @author: deng
 * @datetime: 2020/7/5 10:51 上午
 * @desc:
 */
public abstract class Bank {
    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();
}
