package com.company;


public class Student extends Person {

    private String career;

    public String getCareer(){
        return career;
    }

    public void setCareer(String career){
        this.career = career;
    }

    public void data(){

        System.out.println("Name:" + this.getName());
        System.out.println("LastName:" + this.getLastName());
        System.out.println("Id:" + this.getId());
        System.out.println("Age:" + this.getAge());
        System.out.println("Career:" + this.getCareer());
    }

}
