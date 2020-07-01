package cn.niudehua.design.pattern.creational.prototype;

import java.text.MessageFormat;

/**
 * @author: deng
 * @datetime: 2020/7/1 10:06 上午
 * @desc:
 */
public class MailUtils {
    public static void sendMail(Mail mail) {
        String outputContent = "收件人：{0}同学，邮件地址：{1}，邮件内容：{2}，发送邮件成功";
        System.out.println(MessageFormat.format(outputContent, mail.getName(), mail.getEmailAddress(), mail.getContent()));
    }

    public static void saveOriginMailRecord(Mail mail) {
        System.out.println("存储originMail记录，originMail：" + mail.getContent());
    }
}
