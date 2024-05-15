package model;

import model.vehicle.Vehicle;

import java.util.Date;

public class Bill {
    private int bill_id;
    private User bill_owner;
    private Vehicle bill_vehicle;
    private RepairService bill_service;
    private Date bill_date_created;
}
