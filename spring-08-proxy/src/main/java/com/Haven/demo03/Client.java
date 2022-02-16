package com.Haven.demo03;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        ProxyInvocationHandler invocationHandler = new ProxyInvocationHandler();
        invocationHandler.setObj(host);
        Rent proxy = (Rent) invocationHandler.getProxy();
        proxy.rent();
    }
}
