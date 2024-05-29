package controller;

import model.Bill;
import model.Database;
import model.DatabaseImpl;
import model.Insurance;

import java.util.ArrayList;
import java.util.TreeSet;

public class BillController {
    Database database;

    public BillController() {
        this.database = new DatabaseImpl();
    }

    public void writeToFile(TreeSet<Bill> bills, String fileName) {
        this.database.writeToFile(bills, fileName);
    }

    public void writeToFile(ArrayList<Bill> bills, String fileName) {
        this.database.writeToFile(bills, fileName);
    }

    public ArrayList<Insurance> readDataFromFile(String fileName) {
        return (ArrayList<Insurance>) this.database.readDataFromFile(fileName);
    }
}
