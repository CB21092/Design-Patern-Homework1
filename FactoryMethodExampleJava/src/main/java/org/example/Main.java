//Student ID: B221202906
//Name: Muhammad Zul Iman
//Surname: Zul Wizaratain
//Course Name: Design Pattern
//Homework 1

package org.example;

import javax.xml.bind.JAXBException;

public class Main {
    public static void main(String[]args) throws JAXBException {
        Student student = new Student("","",1);
        Factory factory = new Factory();
        SerializeInterface serializeInterface = factory.createSer("JSON");
        serializeInterface.prepareData(student);

    }
}