package com.Haven.pojo;

public class User {

    public String age;

    public String name;

    public User() {
    }

    public User(String age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "age='" + age + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
