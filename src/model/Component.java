package model;

import java.io.Serializable;

public class Component implements Serializable {
    private String component_name;
    private int component_quantity;
    private double component_price;

    public Component() {
    }

    public Component(String component_name, int component_quantity, double component_price) {
        try {
            setComponent_name(component_name);
            setComponent_quantity(component_quantity);
            setComponent_price(component_price);
        } catch (Exception e) {
            System.out.println("Lỗi dữ liệu: " + e.toString());
        }
    }

    public String getComponent_name() {
        return component_name;
    }

    public void setComponent_name(String component_name) throws Exception {
        if (component_name.trim().equals("")) {
            throw new Exception("Lỗi bỏ trống dữ liệu!");
        }
        this.component_name = component_name;
    }

    public int getComponent_quantity() {
        return component_quantity;
    }

    public void setComponent_quantity(int component_quantity) throws Exception {
        if(component_quantity < 0) {
            throw new Exception("Số lượng không được nhỏ hơn 0 ");
        }
        this.component_quantity = component_quantity;
    }

    public double getComponent_price() {
        return component_price;
    }

    public void setComponent_price(double component_price) throws Exception {
        if(component_quantity < 0) {
            throw new Exception("Đơn giá không được nhỏ hơn 0 ");
        }
        this.component_price = component_price;
    }
    public double tongTien() {
        return component_quantity * component_price;
    }

    @Override
    public String toString() {
        return "Component{" + "component_name=" + component_name + ", component_quantity=" + component_quantity + ", component_price=" + component_price + '}';
    }

}
