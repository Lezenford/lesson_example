package com.lezenford.lesson5.template;

public class FacebookNotifier extends Notifier {
    @Override
    protected void login() {
// login to facebook
    }

    @Override
    protected void send(String address, String subject, String message) {
// send facebook message
    }

    @Override
    protected void logout() {
// logout from facebook
    }

    // переопределяем поведение шага внутреннего логирования
    @Override
    protected void log(String address, String subject, String message) {
// не будем внутренне логировать нотификацию по FB, ибо это избыточно.
    }
}