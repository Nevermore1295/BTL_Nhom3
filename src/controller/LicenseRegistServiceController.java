package controller;

import model.Database;
import model.DatabaseImpl;
import model.LicenseRegist;
import model.RepairService;

import java.util.ArrayList;

public class LicenseRegistServiceController {

    Database database;

    public LicenseRegistServiceController() {
        this.database = new DatabaseImpl();
    }

    public void writeToFile(ArrayList<LicenseRegist> licenseRegists, String fileName) {
        this.database.writeToFile(licenseRegists, fileName);
    }

    public ArrayList<LicenseRegist> readDataFromFile(String fileName) {
       return (ArrayList<LicenseRegist>) this.database.readDataFromFile(fileName);
    }
}
