package cn.niudehua.design.pattern.structural.bridge;

/**
 * @author: deng
 * @datetime: 2020/7/5 10:52 上午
 * @desc:
 */
public class ICBCBank extends Bank {

    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国工商银行账号");
        account.openAccount();
        return account;
    }
}
