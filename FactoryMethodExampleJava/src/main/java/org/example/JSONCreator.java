package org.example;


import com.google.gson.Gson;

public class JSONCreator implements SerializeInterface {
    @Override
    public void prepareData(Student student) {
        Gson gson = new Gson();
        String gsonString = gson.toJson(student);
        System.out.println(gsonString);

    }

}
