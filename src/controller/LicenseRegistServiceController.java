package controller;

import database.Database;
import database.DatabaseImpl;
import model.Insurance;
import model.LicenseRegist;

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

    public ArrayList<LicenseRegist> sortByName(ArrayList<LicenseRegist> licenseRegists){ return null;}

    public ArrayList<LicenseRegist> sortByCreatedDate(ArrayList<LicenseRegist> licenseRegists){ return null;}
}
