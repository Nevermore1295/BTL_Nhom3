package controller;

import model.Bill;
import database.Database;
import database.DatabaseImpl;
import model.Insurance;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
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

    public Set<Bill> readSetDataFromFile(String fileName) {
        return (TreeSet<Bill>) this.database.readDataFromFile(fileName);
    }
    public List<Bill> readListDataFromFile(String fileName) {
        return (ArrayList<Bill>) this.database.readDataFromFile(fileName);
    }

    public Bill searchByBillId(TreeSet<Bill> bills, int id){
        return null;
    }

    public ArrayList<Bill> searchByOwner(TreeSet<Bill> bills, String name){ return null; }

    public ArrayList<Bill> sortByTotalPrice(TreeSet<Bill> bills){ return null;}

    public ArrayList<Bill> sortByCreatedDate(TreeSet<Bill> bills){ return null;}

}
