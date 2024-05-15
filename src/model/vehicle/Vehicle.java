package model.vehicle;

import model.User;

public class Vehicle {
    private int vehicle_id;
    private String vehicle_name;
    private User vehicle_owner;


    public Vehicle(int vehicle_id, String vehicle_name, User vehicle_owner) {
        this.vehicle_id = vehicle_id;
        this.vehicle_name = vehicle_name;
        this.vehicle_owner = vehicle_owner;
    }

    public Vehicle() {

    }

    public int getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(int vehicle_id) throws Exception {
        if (vehicle_id == 0)
        {
            throw new Exception("ID không được để trống!");
        }
        this.vehicle_id = vehicle_id;
    }

    public String getVehicle_name() {
        return vehicle_name;
    }

    public void setVehicle_name(String vehicle_name) throws Exception {
        if (vehicle_name.trim().isEmpty())
        {
            throw new Exception("Tên không được để trống!");
        }
        this.vehicle_name = vehicle_name;
    }

    public User getVehicle_owner() {
        return vehicle_owner;
    }

    public void setVehicle_owner(User vehicle_owner) {
        this.vehicle_owner = vehicle_owner;
    }

}
