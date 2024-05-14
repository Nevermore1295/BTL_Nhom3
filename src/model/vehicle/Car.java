package model.vehicle;

import model.User;

public class Car extends Vehicle {
    private String car_style;
    private String car_color;
    private String car_transmission;

    public Car(int vehicle_id, String vehicle_name, User vehicle_owner) {
        super(vehicle_id, vehicle_name, vehicle_owner);
    }

    public String getCar_style() {
        return car_style;
    }

    public void setCar_style(String car_style) throws Exception {
        if (car_style.trim().isEmpty()){
            throw new Exception("Dáng xe không được để trống!");
        }
        this.car_style = car_style.trim();
    }

    public String getCar_color() {
        return car_color;
    }

    public void setCar_color(String car_color) throws Exception {
        if(car_color.trim().isEmpty()){
            throw new Exception("Màu xe không được để trống!");
        }
        this.car_color = car_color.trim();
    }

    public String getCar_transmission() {
        return car_transmission;
    }

    public void setCar_transmission(String car_transmission) throws Exception {
        if (car_transmission.trim().isEmpty()){
            throw new Exception("Loại xe không được để trống!");
        }
        this.car_transmission = car_transmission.trim();
    }
}
