package com.practice.springbootproject.webservicespractice.User;

public class User {
    private String name;
    private Integer id;
    private String country;

    public User(Integer id, String name, String country){
        this.name = name;
        this.id = id;
        this.country = country;
    }

    public User(){
        //Default Constructor
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", country='" + country + '\'' +
                '}';
    }
}
