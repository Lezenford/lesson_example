package com.lezenford.lesson5.template;

public abstract class Notifier {
    public final void notify(String address, String subject, String message) {
        login();
        send(address, subject, message);
        logout();
        log(address, subject, message);
    }

    // войти в ситему доставки сообщений
    protected abstract void login();
    // отправка сообщения
    protected abstract void send(String address, String subject, String message);

    // выход
    protected abstract void logout();

    // внутреннее логирование, задаем поведение по умолчанию
    protected void log(String address, String subject, String message) {
    }
}