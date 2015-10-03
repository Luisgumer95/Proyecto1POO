package com.company;


public class Professor extends Person {

    public String matter;

    public String getMatter(){
        return matter;
    }

    public void setMatter(String matter){
        this.matter = matter;
    }

    public void data(){

        System.out.println("Name:" + this.getName());
        System.out.println("LastName:" + this.getLastName());
        System.out.println("Id:" + this.getId());
        System.out.println("Age:" + this.getAge());
        System.out.println("Matter:" + this.getMatter());
    }
}
