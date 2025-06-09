package org.example.models;

import java.util.Comparator;

public class Student {
    private String Name;
    private String Surname;
    private int grade;
    private int age;
    public Student(String name,String surname,int grade,int age){
     this.Name=name;
     this.Surname=surname;
     this.grade=grade;
     this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
//    @Override
    //TODO ???
//    public int compareTo(Student student) {
//    return this.grade.compareTo(student.getGrade());
//    }

    public String toString(){
        return Name + " "
                + Surname + ", grade: " + grade;
    }
}
