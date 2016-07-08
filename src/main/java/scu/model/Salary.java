package scu.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by DAi on 16/7/7.
 */
@Entity
public class Salary {
    @Id
    private int emplno;
    private Date date;
    private double total;
    private double cmoney;
    private double dmoney;
    private double tmoney;

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

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getCmoney() {
        return cmoney;
    }

    public void setCmoney(double cmoney) {
        this.cmoney = cmoney;
    }

    public double getDmoney() {
        return dmoney;
    }

    public void setDmoney(double dmoney) {
        this.dmoney = dmoney;
    }

    public double getTmoney() {
        return tmoney;
    }

    public void setTmoney(double tmoney) {
        this.tmoney = tmoney;
    }
}
