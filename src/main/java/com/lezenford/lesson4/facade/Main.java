package com.lezenford.lesson4.facade;

import java.io.IOException;
import java.net.InetAddress;

public class Main {
    public static void main(String[] args) throws IOException {
        ConsoleFacade facade = new ConsoleFacade();

        System.out.print("string >");
        String s = facade.getString();
        System.out.println(s);

        System.out.print("int >");
        int n = facade.getInt();
        System.out.println(n);

        System.out.print("ip >");
        InetAddress ip = facade.getIp();
        System.out.println(ip);

    }
}
