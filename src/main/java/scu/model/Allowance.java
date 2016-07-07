package scu.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by DAi on 16/7/7.
 */
@Entity
public class Allowance {
    private int emplno;
    private Date date;
    private Double regive;
    private Double wegive;
    private Double foodgive;
    private Double specallow;
    private Double accumfund;
    private Double allowratio;
    private double allow;

    public int getEmplno() {
        return emplno;
    }

    public void setEmplno(int emplno) {
        this.emplno = emplno;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getRegive() {
        return regive;
    }

    public void setRegive(Double regive) {
        this.regive = regive;
    }

    public Double getWegive() {
        return wegive;
    }

    public void setWegive(Double wegive) {
        this.wegive = wegive;
    }

    public Double getFoodgive() {
        return foodgive;
    }

    public void setFoodgive(Double foodgive) {
        this.foodgive = foodgive;
    }

    public Double getSpecallow() {
        return specallow;
    }

    public void setSpecallow(Double specallow) {
        this.specallow = specallow;
    }

    public Double getAccumfund() {
        return accumfund;
    }

    public void setAccumfund(Double accumfund) {
        this.accumfund = accumfund;
    }

    public Double getAllowratio() {
        return allowratio;
    }

    public void setAllowratio(Double allowratio) {
        this.allowratio = allowratio;
    }

    public double getAllow() {
        return allow;
    }

    public void setAllow(double allow) {
        this.allow = allow;
    }
}
