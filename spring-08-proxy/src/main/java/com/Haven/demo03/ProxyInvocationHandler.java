package com.Haven.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//我们用这个类,自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Object obj;

    public void setObj(Object obj) {
        this.obj = obj;
    }

    //生成的到代理类
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
    }

    @Override //处理代理实例, 并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(obj, args);
        seeHouse();
        heTong();
        fare();
        return result;
    }

    //看房
    public void seeHouse() {
        System.out.println("中介带你看房");
    }

    //合同
    public void heTong() {
        System.out.println("签租赁合同");
    }

    //收中介费
    public void fare() {
        System.out.println("收中介费");
    }
}
