package model;

import model.vehicle.Vehicle;

import java.util.Date;

public class Bill {
    private int bill_id;
    private User bill_owner;
    private Vehicle bill_vehicle;
    private RepairService bill_repair_service;
    private Date bill_date_created;

    public int getBill_id() {
        return bill_id;
    }

    public void setBill_id(int bill_id) {
        this.bill_id = bill_id;
    }

    public User getBill_owner() {
        return bill_owner;
    }

    public void setBill_owner(User bill_owner) {
        this.bill_owner = bill_owner;
    }

    public Vehicle getBill_vehicle() {
        return bill_vehicle;
    }

    public void setBill_vehicle(Vehicle bill_vehicle) {
        this.bill_vehicle = bill_vehicle;
    }

    public RepairService getBill_repair_service() {
        return bill_repair_service;
    }

    public void setBill_repair_service(RepairService bill_repair_service) {
        this.bill_repair_service = bill_repair_service;
    }

    public Date getBill_date_created() {
        return bill_date_created;
    }

    public void setBill_date_created(Date bill_date_created) {
        this.bill_date_created = bill_date_created;
    }

    public double totalPrice(){
       return this.getBill_repair_service().totalPrice();
    }
}
