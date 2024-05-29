package controller;

import model.Database;
import model.DatabaseImpl;
import model.RepairService;
import model.User;

import java.util.ArrayList;

public class UserController {
    Database database;

    public UserController() {
        this.database = new DatabaseImpl();
    }

    public void writeToFile(ArrayList<User> users, String fileName) {
        this.database.writeToFile(users, fileName);
    }

    public ArrayList<User> readDataFromFile(String fileName) {
       return (ArrayList<User>) this.database.readDataFromFile(fileName);
    }
}
