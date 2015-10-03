package com.company;

public class Main {

    public static void main(String[] args) {

        Student student = new Student();
        Professor professor = new Professor();

        student.setId(23885310);
        student.setName("Luis");
        student.setLastName("Mendez");
        student.setAge(20);
        student.setCareer("Computer Engineer");

        professor.setId(23736217);
        professor.setName("Heradocles");
        professor.setLastName("Montero");
        professor.setAge(21); //?
        professor.setMatter("Hardware");

        student.data();
        professor.data();


    }
}
