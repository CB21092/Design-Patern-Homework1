package org.example;

import javax.xml.bind.JAXBException;

public interface SerializeInterface {
    void prepareData(Student student) throws JAXBException;
}
