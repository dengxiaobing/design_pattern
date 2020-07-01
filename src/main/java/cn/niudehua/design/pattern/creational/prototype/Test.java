package cn.niudehua.design.pattern.creational.prototype;

/**
 * @author: deng
 * @datetime: 2020/7/1 10:12 上午
 * @desc:
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        for (int i = 0; i < 10; i++) {
            Mail mailTmp = (Mail) mail.clone();
            mailTmp.setName("姓名"+i);
            mailTmp.setEmailAddress("邮件地址"+i);
            mailTmp.setContent("恭喜获奖："+i);
            MailUtils.sendMail(mailTmp);
        }
        MailUtils.saveOriginMailRecord(mail);

    }
}
