package com.example.automobile;

public class model {
    String repairtype,brand,rdate,mile;
    model()
    {
// Controller
    }
    public model(String repairtybe, String brand, String rdate, String mile) {
        this.repairtype = repairtybe;
        this.brand = brand;
        this.rdate = rdate;
        this.mile = mile;
    }
// database
    public String getName() {
        return repairtype;
    }

    public void setName(String repairtype) { this.repairtype = repairtype; }

    public String getCourse() {
        return brand;
    }

    public void setCourse(String brand) {
        this.brand = brand;
    }

    public String getEmail() {
        return rdate;
    }

    public void setEmail(String rdate) {
        this.rdate = rdate;
    }

    public String getPurl() {
        return mile;
    }

    public void setPurl(String mile) {
        this.mile = mile;
    }
}
