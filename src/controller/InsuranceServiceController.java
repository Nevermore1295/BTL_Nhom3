package controller;

import database.Database;
import database.DatabaseImpl;

import model.Bill;
import model.Insurance;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class InsuranceServiceController {
    Database database;

    public InsuranceServiceController() {
        this.database = new DatabaseImpl();
    }

    public void writeSetToFile(Set<Insurance> insurances, String fileName) {
        this.database.writeToFile(insurances, fileName);
    }

    public void writeArrayListToFile(List<Insurance> insurances, String fileName) {
        this.database.writeToFile(insurances, fileName);
    }

    public List<Insurance> readListFromFile(String fileName) {
        return (ArrayList<Insurance>) this.database.readDataFromFile(fileName);
    }

    public Set<Insurance> readSetFromFile(String fileName) {
        return (TreeSet<Insurance>) this.database.readDataFromFile(fileName);
    }

    public ArrayList<Insurance> sortByTotalPrice(ArrayList<Insurance> bills){ return null;}
    public ArrayList<Insurance> sortByCreatedDate(TreeSet<Insurance> bills){ return null;}
    public ArrayList<Insurance> sortByVehicleType(ArrayList<Insurance> bills){ return null;}

    public Insurance searchByInsuranceId(TreeSet<Insurance> insurances, String id){
        return null;
    }
    public TreeSet<Insurance> searchByOwner(TreeSet<Insurance> insurances, String id){
        return null;
    }
}
