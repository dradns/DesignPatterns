package com.dradns;

public class User {
    //data attributes
    public String name;
    public int  age;
    //constructor
    public User(String name, int age){
        this.name = name;
        this.age = age;
        }
    //Methods
    public void sayHello(){
        System.out.println("Hi new user " + name + "\n" + "my age = " + age);
    }

}
