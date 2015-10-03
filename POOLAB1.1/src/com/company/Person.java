package com.company;

public class Person {

    private String name, lastName;
    private int id, age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void data(){

        System.out.println("Name:" + this.getName());
        System.out.println("LastName:" + this.getLastName());
        System.out.println("Id:" + this.getId());
        System.out.println("Age:" + this.getAge());
    }





}
