package cn.niudehua.design.pattern.structural.bridge;

/**
 * @author: deng
 * @datetime: 2020/7/5 10:55 上午
 * @desc:
 */
public class Test {
    public static void main(String[] args) {
        Bank icbcBank = new ICBCBank(new DepositAccount());
        Account icbcAccount = icbcBank.openAccount();
        icbcAccount.showAccountType();

        Bank abcBank = new ABCBank(new SavingAccount());
        Account abcAccount = abcBank.openAccount();
        abcAccount.showAccountType();


        Bank abcBank1 = new ABCBank(new DepositAccount());
        Account abcAccount1 = abcBank1.openAccount();
        abcAccount1.showAccountType();

    }
}
