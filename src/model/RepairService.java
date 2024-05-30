package model;

import model.vehicle.Vehicle;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class RepairService implements Serializable {
    private Date repair_service_created_date;
    private String repair_service_id;
    private Component repair_component;
    private Vehicle repair_vehicle;

    public RepairService() {
    }
    public RepairService(Component repair_component, Vehicle repair_vehicle, Date repair_service_created_date, String repair_service_id) {
        this.repair_component = repair_component;
        this.repair_vehicle = repair_vehicle;
        this.repair_service_created_date = repair_service_created_date;
        this.repair_service_id = repair_service_id;

//        vehicle(bienSoXe, loaiXe, chuSoHuu);
        try {
            setRepair_service_created_date(repair_service_created_date);
            setRepair_service_id(repair_service_id);
        } catch(Exception e) {
            System.out.println("Có lỗi dữ liệu không hợp lệ " + e.toString());
        }
    }
    public void setRepair_service_id(String repair_service_id) throws Exception {
        if(repair_service_id.trim().equals("")) {
            throw new Exception("Mã chăm sóc không được để trống");
        }
        this.repair_service_id = repair_service_id;
    }
    public String getRepair_service_id() {
        return repair_service_id;
    }
    public void setRepair_service_created_date(Date repair_service_created_date) throws Exception {
        if(repair_service_created_date == null) {
            throw new Exception("Ngày chăm sóc không được để trống");
        }
        this.repair_service_created_date = repair_service_created_date;
    }

    public Date getRepair_service_created_date() {
        return repair_service_created_date;
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.repair_service_id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RepairService other = (RepairService) obj;
        return Objects.equals(this.repair_service_id, other.repair_service_id);
    }
    public Component getRepair_component() {
        return repair_component;
    }
    public void setRepair_component(Component repair_component) {
        this.repair_component = repair_component;
    }

    public Vehicle getRepair_vehicle() {
        return repair_vehicle;
    }

    public void setRepair_vehicle(Vehicle repair_vehicle) {
        this.repair_vehicle = repair_vehicle;
    }
    public double totalPrice() {
        return repair_component.totalPrice();
    }
}
