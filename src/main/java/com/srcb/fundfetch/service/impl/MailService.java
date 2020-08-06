package com.srcb.fundfetch.service.impl;

import com.srcb.fundfetch.service.IMailService;
import org.apache.naming.factory.SendMailFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/8/6
 */

@Service
public class MailService implements IMailService {

    private final Logger logger = LoggerFactory.getLogger(MailService.class);

    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String mailFrom;

    @Override
    public void sendCommonMail(String to, String subject, String content) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(mailFrom);
        simpleMailMessage.setTo(to);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(content);
        mailSender.send(simpleMailMessage);
    }

    @Override
    public void sendHtmlMail(String to, String subject, String content) {

    }

    @Override
    public void sendAttachMail(String to, String subject, String content) {

    }
}
