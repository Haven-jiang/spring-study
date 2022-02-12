package com.haven.pojo;

import java.util.Date;

public class User {

    private String ptr;

    public User(){
        System.out.println("User的无参构造!");
    }

    public User(String name) {
        this.ptr = name;
    }

    public User(User user) {
        System.out.println(user.getPtr());
    }

    public String getPtr() {
        return ptr;
    }

    public void setPtr(String ptr) {
        this.ptr = ptr;
    }

    public void show() {
        System.out.println("name = " + ptr);
    }

    @Override
    public String toString() {
        return "User{" +
                "ptr='" + ptr + '\'' +
                '}';
    }
}
