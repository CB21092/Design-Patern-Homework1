package org.example;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
    String name, surname;
    int studentId;

    public Student(String name, String surname, int studentId) {
        name = "iman";
        surname = "zul";
        studentId = 123;
        this.name = name;
        this.studentId = studentId;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
