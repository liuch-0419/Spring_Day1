package com.baizhi.entity;

import java.util.*;

public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private String[] as;
    private List<String> tels;
    private Set<String>  ss;
    private Map<String,String> maps;
    private Properties  properties;

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSs(Set<String> ss) {
        this.ss = ss;
    }

    public void setTels(List<String> tels) {
        this.tels = tels;
    }

    public void setAs(String[] as) {
        this.as = as;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setId(Integer id) {
        this.id = id;
     }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", as=" + Arrays.toString(as) +
                ", tels=" + tels +
                ", ss=" + ss +
                ", maps=" + maps +
                ", properties=" + properties +
                '}';
    }
}
