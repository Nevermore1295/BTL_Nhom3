package model;

public class User {
    private String user_name;
    private String user_password;
    private String user_address;
    private String user_phone;
    private String user_fullname;

    public User() {
    }

    public User(String hoTen, String diaChi, String sdt) {
        try {
            setHoTen(hoTen);
            setDiaChi(diaChi);
            setSdt(sdt);
        } catch(Exception e) {
            System.out.println("Co loi du lieu User khong hop le " + e.toString());
        }
    }

    public User(String hoTen, String sdt) {
        try {
            setHoTen(hoTen);
            setSdt(sdt);
        } catch(Exception e) {
            System.out.println("Co loi du lieu User khong hop le " + e.toString());
        }
    }

    public User(String hoTen) {
        try{
            setHoTen(hoTen);
        }
        catch(Exception e) {
            System.out.println("Co loi du lieu User khong hop le " + e.toString());
        }

    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) throws Exception {
        if(hoTen.trim().equals("")) {
            throw new Exception("Tên không được để trống");
        } else if(hoTen.matches("[^a-zA-Z]+")) {
            throw new Exception("Tên không được có kí tự số");
        }
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) throws Exception {
        if(diaChi.trim().equals("")) {
            throw new Exception("Địa chỉ không được để trống");
        }
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) throws Exception {
        if(sdt.length() != 10) {
            throw new Exception("SDT khong hop le");
        }
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return "User{" + "hoTen=" + hoTen + ", diaChi=" + diaChi + ", sdt=" + sdt + '}';
    }
}
