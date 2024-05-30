package model;

import java.io.Serializable;
import java.util.Date;

public class Service implements Serializable {
    private Date service_created_date;
    private String service_id;

    public Date getService_created_date() {
        return service_created_date;
    }

    public void setService_created_date(Date service_created_date) {
        this.service_created_date = service_created_date;
    }

    public String getService_id() {
        return service_id;
    }

    public void setService_id(String service_id) {
        this.service_id = service_id;
    }
}
