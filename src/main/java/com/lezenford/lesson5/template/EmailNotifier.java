package com.lezenford.lesson5.template;

public class EmailNotifier extends Notifier {
    private String mailFrom;

    @Override
    protected void login() {
        // no need to login
    }

    @Override
    protected void send(String mailTo, String subject, String message) {
        // sendmail(mailFrom, mailTo, subject, message);
    }

    @Override
    protected void logout() {
        // no need to logout
    }
}

