package com.Haven.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //等价于 <bean id="user" class="com.Haven.pojo.User"/>
@Scope("prototype")
public class User {

    public String name;

    @Value("Haven") //相当于 <property name="name" value="Haven"/>
    public void setName(String name) {
        this.name = name;
    }
}
