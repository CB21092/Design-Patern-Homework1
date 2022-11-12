package org.example;

public class Factory {
    public SerializeInterface createSer(String serType){
        if (serType == null || serType.isEmpty())
            return null;
        switch (serType){
            case "JSON":
                return new JSONCreator();
            case "ASCII":
                return new XMLCreator();
            default:
                throw new IllegalArgumentException("Unknown Serialization"+serType);
        }
    }
}
