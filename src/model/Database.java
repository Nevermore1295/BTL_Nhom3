package model;

public interface Database {

    public void writeToFile(Object obj, String fileName);

    public Object readDataFromFile(String fileName);
}
