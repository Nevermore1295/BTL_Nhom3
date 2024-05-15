package controller;

import model.RepairService;

import java.util.ArrayList;
import java.util.Comparator;

public class RepairServiceController {
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
    public ArrayList searchVehicleByVehicleName(ArrayList<RepairService> dsQly, String vehicle_name) {
        ArrayList<RepairService> list = new ArrayList<>();
        if(vehicle_name.length() > 0) {
            for(RepairService x : dsQly) {
                if(x.getVehicle().getVehicle_name().matches(vehicle_name)) {
                    list.add(x);
                }
            }
        }
        return list;
    }
}