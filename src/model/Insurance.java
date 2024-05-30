package model;

import model.vehicle.Vehicle;

import java.util.Date;

public class Insurance {
    private String insurence_id;
    private Vehicle insurence_vehicle;
    private Date insurence_date_created;
    private double insurence_price;

    public Insurance() {
    }

    public String getInsurence_id() {
        return insurence_id;
    }

    public void setInsurence_id(String insurence_id) {
        this.insurence_id = insurence_id;
    }

    public Vehicle getInsurence_vehicle() {
        return insurence_vehicle;
    }

    public void setInsurence_vehicle(Vehicle insurence_vehicle) {
        this.insurence_vehicle = insurence_vehicle;
    }

    public Date getInsurence_date_created() {
        return insurence_date_created;
    }

    public void setInsurence_date_created(Date insurence_date_created) {
        this.insurence_date_created = insurence_date_created;
    }

    public double getInsurence_price() {
        return insurence_price;
    }

    public void setInsurence_price(double insurence_price) {
        this.insurence_price = insurence_price;
    }
}
