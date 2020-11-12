package com.qiqu.util;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import java.util.Random;

public class CodeUtil {
    public static String getCode(){
        String[] beforeShuffle = new String[] {
                "0","1", "2", "3", "4", "5", "6", "7", "8", "9",
                "a","b", "d", "c", "e", "f", "g", "h", "i", "j",
                "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
                "u", "v","w", "x", "y", "z" };
        StringBuffer code=new StringBuffer();
        for (int i = 0; i <6 ; i++) {
            code.append(beforeShuffle[new Random().nextInt(32)]);
        }
       return code.toString();
    }
    public static void SendMail2(String mail,String code) {

        //做链接前的准备工作  也就是参数初始化
        Properties properties = new Properties();
        properties.setProperty("mail.smtp.host", "smtp.qq.com");//发送邮箱服务器
        properties.setProperty("mail.smtp.port", "465");//发送端口
        properties.setProperty("mail.smtp.auth", "true");//是否开启权限控制
        properties.setProperty("mail.debug", "true");//true 打印信息到控制台
        properties.setProperty("mail.transport", "smtp");//发送的协议是简单的邮件传输协议
        properties.setProperty("mail.smtp.ssl.enable", "true");
        //建立两点之间的链接
        System.out.println("执行了2");
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("2394810407@qq.com", "mybrstyfoqogecfh");
                //这里第一个参数是发件人邮箱号码，第二个是邮箱的验证码下面解释
            }
        });
        System.out.println("执行了3");
        //创建邮件对象
        Message message = new MimeMessage(session);
        try {
            //设置发件人
            message.setFrom(new InternetAddress("2394810407@qq.com"));
            //设置收件人
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(mail));//收件人
            //设置主题
            message.setSubject("启趣教育验证码");
            //设置邮件正文  第二个参数是邮件发送的类型
            message.setContent(code, "text/html;charset=UTF-8");
            //发送一封邮件
            Transport transport = session.getTransport();
            transport.connect("2394810407@qq.com", "sweet19960710");
            //这里两个参数是发件人 qq账号和密码
            Transport.send(message);
            System.out.println("执行了");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
