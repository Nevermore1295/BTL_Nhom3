package model;

import java.util.Date;

public class LicenseRegist {
    private User license_user;
    private String license_level;
    private Date license_date_created;

    public User getLicense_user() {
        return license_user;
    }

    public void setLicense_user(User license_user) {
        this.license_user = license_user;
    }

    public String getLicense_level() {
        return license_level;
    }

    public void setLicense_level(String license_level) {
        this.license_level = license_level;
    }

    public Date getLicense_date_created() {
        return license_date_created;
    }

    public void setLicense_date_created(Date license_date_created) {
        this.license_date_created = license_date_created;
    }
}
