package com.srcb.fundfetch.controller;

import com.srcb.fundfetch.service.IMailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/8/6
 */

@Controller
@ResponseBody
public class MailServiceController {

    private final Logger logger = LoggerFactory.getLogger(MailServiceController.class);

    @Autowired
    IMailService mailService;

    @GetMapping("/registermail")
    public void testSendMail() {
        logger.debug("testSendMail");
        String toMail = "642300773@qq.com";
        String subject = "testMail";
        String content = "testtesttest";
        mailService.sendCommonMail(toMail, subject, content);
    }


}
