package model.vehicle;


import model.User;

public class Motorbike extends Vehicle {
    private int motorbike_enginesize;
    private String motorbike_color;
    private String motorbike_transmission;

    public Motorbike(int vehicle_id, String vehicle_name, User vehicle_owner) {
        super(vehicle_id, vehicle_name, vehicle_owner);
    }

    public int getMotorbike_enginesize() {
        return motorbike_enginesize;
    }

    public void setMotorbike_enginesize(int motorbike_enginesize) throws Exception {
        if (motorbike_enginesize == 0) {
            throw new Exception("Dung tích xe không được để trống!");
        }
        this.motorbike_enginesize = motorbike_enginesize;
    }

    public String getMotorbike_color() {
        return motorbike_color;
    }

    public void setMotorbike_color(String motorbike_color) throws Exception {
        if (motorbike_color.trim().isEmpty()){
            throw new Exception("Màu xe không được để trống!");
        }
        this.motorbike_color = motorbike_color;
    }

    public String getMotorbike_transmission() {
        return motorbike_transmission;
    }

    public void setMotorbike_transmission(String motorbike_transmission) throws Exception {
        if (motorbike_transmission.trim().isEmpty())
        {
            throw new Exception("Loại xe không được để trống!"); //1-Xe số //2-Xe ga //3-Xe côn
        }
        this.motorbike_transmission = motorbike_transmission;
    }
}
