package com.efun.pojo;

import java.util.Map;

public class User {
    private Integer id;
    private String name;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static User toObject(Map<String, Object> map) {

        User user = new User();
        user.setId((Integer) map.get("id"));
        user.setName((String) map.get("name"));
        user.setAge((Integer) map.get("age"));


        return user;
    }
}
