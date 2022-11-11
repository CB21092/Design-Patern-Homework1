package org.example;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;
import java.io.OutputStream;


public class XMLCreator implements SerializeInterface {

    @Override
    public void prepareData(Student student) throws JAXBException {
        JAXBContext jaxbContext =  JAXBContext.newInstance(Student.class);

        Marshaller marshaller = jaxbContext.createMarshaller();

        File file = new File("src\\main\\recources\\student.xml");

        marshaller.marshal(student,file);

        JAXBContext jaxbContext1 = JAXBContext.newInstance(Student.class);

        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        Student student1 = (Student) unmarshaller.unmarshal(file);

        System.out.println(student1.getStudentId()+","+student1.getName()+","+student1.getSurname());
    }
}
