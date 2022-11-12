package org.example;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;


public class AsciiCreator implements SerializeInterface {

    @Override
    public void prepareData(Student student){
//    public void prepareData(Student student) throws JAXBException {

        byte[] ascii = student.getSurname().getBytes(StandardCharsets.US_ASCII);
        byte[] ascii2 = student.getName().getBytes(StandardCharsets.US_ASCII);
        String asciiSurname = Arrays.toString(ascii);
        String asciiName = Arrays.toString(ascii2);
        int asciiID = (int) student.getStudentId();
        System.out.println(asciiID+","+ascii+","+ascii2);


//        JAXBContext jaxbContext =  JAXBContext.newInstance(Student.class);
//
//        Marshaller marshaller = jaxbContext.createMarshaller();
//
//        File file = new File("src\\main\\recources\\student.xml");
//
//        marshaller.marshal(student,file);
//
//        JAXBContext jaxbContext1 = JAXBContext.newInstance(Student.class);
//
//        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
//
//        Student student1 = (Student) unmarshaller.unmarshal(file);
//
//        System.out.println(student1.getStudentId()+","+student1.getName()+","+student1.getSurname());
    }
}
