package cn.niudehua.design.principle.singleresponsibility;

/**
 * @author: deng
 * @datetime: 2020/6/21 12:52 上午
 * @desc: 方法的单一职责原则
 */
public class Method {
    private void updateUserInfo(String userName, String address) {
        userName = "niu";
        address = "wuhan";
    }

    private void updateUserInfo(String userName, String... properties) {
        userName = "niu";
        // ...
    }

    private void updateUserName(String userName) {
        userName = "niu";
    }

    private void updateAddress(String address) {
        address = "wuhan";
    }

    private void updateUserInfo(String userName, String address, boolean bool) {
        // 使用bool类型的方法建议拆分单一方法
        if (bool) {
            // todo something1
        } else {
            // todo something2
        }
        userName = "niu";
        address = "wuhan";
    }
}
