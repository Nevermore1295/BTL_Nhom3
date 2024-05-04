package model;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {
    private String user_name;
    private String user_password;
    private String user_address;
    private String user_phone;
    private String user_fullname;

    public User() {
    }

    public User(String user_fullname, String user_address, String user_phone) {
        try {
            setHoTen(user_fullname);
            setDiaChi(user_address);
            setSdt(user_phone);
        } catch(Exception e) {
            System.out.println("Co loi du lieu User khong hop le " + e.toString());
        }
    }

    public User(String user_fullname, String user_phone) {
        try {
            setHoTen(user_fullname);
            setSdt(user_phone);
        } catch(Exception e) {
            System.out.println("Co loi du lieu User khong hop le " + e.toString());
        }
    }

    public User(String user_fullname) {
        try{
            setHoTen(user_fullname);
        }
        catch(Exception e) {
            System.out.println("Co loi du lieu User khong hop le " + e.toString());
        }

    }

    public String getHoTen() {
        return user_fullname;
    }

    public void setHoTen(String user_fullname) throws Exception {
        if(user_fullname.trim().equals("")) {
            throw new Exception("Tên không được để trống");
        } else if(user_fullname.matches("[^a-zA-Z]+")) {
            throw new Exception("Tên không được có kí tự số");
        }
        this.user_fullname = user_fullname;
    }

    public String getDiaChi() {
        return user_address;
    }

    public void setDiaChi(String user_address) throws Exception {
        if(user_address.trim().equals("")) {
            throw new Exception("Địa chỉ không được để trống");
        }
        this.user_address = user_address;
    }

    public String getSdt() {
        return user_phone;
    }

    public void setSdt(String user_phone) throws Exception {
        if(user_phone.length() < 10) {
            throw new Exception("SDT khong hop le");
        }
        this.user_phone = user_phone;
    }

    @Override
    public String toString() {
        return "User{" + "user_fullname=" + user_fullname + ", user_address=" + user_address + ", user_phone=" + user_phone + '}';
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
        try {
            final User other = (User) obj;
            return Objects.equals(this.user_phone, other.user_phone);
        } catch (ClassCastException e) {
            throw new ClassCastException("Đối tượng người dùng không hợp lệ");
        }
    }
}