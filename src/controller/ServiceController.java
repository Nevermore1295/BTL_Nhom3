package controller;

import database.Database;
import database.DatabaseImpl;
import model.Service;

import java.util.ArrayList;

public class ServiceController {
    Database database;

    public ServiceController() {
        this.database = new DatabaseImpl();
    }

    public void writeToFile(ArrayList<Service> services, String fileName) {
        this.database.writeToFile(services, fileName);
    }

    public ArrayList<Service> readDataFromFile(String fileName) {
        return (ArrayList<Service>) this.database.readDataFromFile(fileName);
    }
}
