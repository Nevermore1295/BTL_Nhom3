package model;

import model.vehicle.Vehicle;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Service implements Serializable {
    private Component component;
    private Vehicle vehicle;
    private Date service_created_date;
    private String service_id;


    public Service() {
    }

    public Service(Component component, Vehicle vehicle, Date service_created_date, String service_id) {
        this.component = component;
        this.vehicle = vehicle;
        this.service_created_date = service_created_date;
        this.service_id = service_id;

//        vehicle(bienSoXe, loaiXe, chuSoHuu);
        try {
            setService_created_date(service_created_date);
            setService_id(service_id);
        } catch(Exception e) {
            System.out.println("Có lỗi dữ liệu không hợp lệ " + e.toString());
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.service_id);
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
        final Service other = (Service) obj;
        return Objects.equals(this.service_id, other.service_id);
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    public Date getService_created_date() {
        return service_created_date;
    }

    public void setService_created_date(Date service_created_date) throws Exception {
        if(service_created_date == null) {
            throw new Exception("Ngày chăm sóc không được để trống");
        }
        this.service_created_date = service_created_date;
    }

    public String getService_id() {
        return service_id;
    }

    public void setService_id(String service_id) throws Exception {
        if(service_id.trim().equals("")) {
            throw new Exception("Mã chăm sóc không được để trống");
        }
        this.service_id = service_id;
    }

    public double thanhTien() {
        return component.getComponent_price() * component.getComponent_quantity();
    }
}
