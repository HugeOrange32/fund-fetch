package com.srcb.fundfetch.service;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/8/6
 */
public interface IMailService {

    /**
     * send common mail without attach
     *
     * @param to
     * @param subject
     * @param content
     */
    void sendCommonMail(String to, String subject, String content);

    /**
     * send mail with html
     *
     * @param to
     * @param subject
     * @param content
     */
    void sendHtmlMail(String to, String subject, String content);

    /**
     * send mail with attach
     *
     * @param to
     * @param subject
     * @param content
     */
    void sendAttachMail(String to, String subject, String content);

}
