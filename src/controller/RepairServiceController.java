package controller;

import constant.Constants;
import database.Database;
import database.DatabaseImpl;
import model.RepairService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RepairServiceController {
    Database database;

    public RepairServiceController() {
        this.database = new DatabaseImpl();
    }

    public void writeToFile(List<RepairService> repairServices, String fileName) {
        this.database.writeToFile(repairServices, fileName);
    }

    public List<RepairService> readDataFromFile(String fileName) {
        return (ArrayList<RepairService>) this.database.readDataFromFile(fileName);
    }

    public boolean addToList(List<RepairService> data, RepairService newItem) {
        data.add(newItem);
        writeToFile(data, Constants.DATA_REPAIR_SERVICE_PATH);
        return true;
    }

    public boolean updateItem(List<RepairService> data, RepairService updatedItem) {
        int idx = data.indexOf(updatedItem);
        if(idx != -1) {
            data.set(idx, updatedItem);
            writeToFile(data, Constants.DATA_REPAIR_SERVICE_PATH);
            return true;
        }
        return false;
    }

    public boolean delItem(List<RepairService> data, RepairService item) {
        boolean isOk = data.remove(item);
        if(isOk) {
            writeToFile(data, Constants.DATA_REPAIR_SERVICE_PATH);
            return true;
        }

        return false;
    }

    public void sortByTotalPrice(ArrayList<RepairService> x) {
        x.sort(new Comparator<RepairService>() {
            @Override
            public int compare(RepairService o1, RepairService o2) {
                return Double.compare(o1.totalPrice(), o2.totalPrice());
            }
        });
    }
    public void sortByCreatedDate(ArrayList<RepairService> x) {
        x.sort(new Comparator<RepairService>() {
            @Override
            public int compare(RepairService o1, RepairService o2) {
                return o2.getRepair_service_created_date().compareTo(o1.getRepair_service_created_date());
            }
        });
    }
    public List<RepairService> searchVehicleByVehicleName(List<RepairService> dsQly, String vehicle_name) {
//        ArrayList<RepairService> list = new ArrayList<>();
//        if(vehicle_name.length() > 0) {
//            for(RepairService x : dsQly) {
//                if(x.getRepair_vehicle().getVehicle_name().matches(vehicle_name)) {
//                    list.add(x);
//                }
//            }
//        }
        return dsQly.stream().filter(item -> item.getRepair_vehicle().getVehicle_name().matches(vehicle_name)).collect(Collectors.toList());
    }

    public List<RepairService> searchByVehicleLiscenseNumber(List<RepairService> repairServices, String bsx){
        return repairServices.stream().filter(item -> item.getRepair_vehicle().getVehicle_license_number().matches(bsx)).collect(Collectors.toList());
    }
}