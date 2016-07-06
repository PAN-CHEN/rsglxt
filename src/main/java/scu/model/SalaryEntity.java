package scu.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by lijiankuan on 16/7/6.
 */
@Entity
@Table(name = "Salary", schema = "rsglxt", catalog = "")
@IdClass(SalaryEntityPK.class)
public class SalaryEntity {
    private int emplNo;
    private Date date;
    private double total;
    private double cMoney;
    private double dMoney;
    private double tMoney;

    @Id
    @Column(name = "EmplNo")
    public int getEmplNo() {
        return emplNo;
    }

    public void setEmplNo(int emplNo) {
        this.emplNo = emplNo;
    }

    @Id
    @Column(name = "Date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic
    @Column(name = "Total")
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Basic
    @Column(name = "CMoney")
    public double getcMoney() {
        return cMoney;
    }

    public void setcMoney(double cMoney) {
        this.cMoney = cMoney;
    }

    @Basic
    @Column(name = "DMoney")
    public double getdMoney() {
        return dMoney;
    }

    public void setdMoney(double dMoney) {
        this.dMoney = dMoney;
    }

    @Basic
    @Column(name = "TMoney")
    public double gettMoney() {
        return tMoney;
    }

    public void settMoney(double tMoney) {
        this.tMoney = tMoney;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SalaryEntity that = (SalaryEntity) o;

        if (emplNo != that.emplNo) return false;
        if (Double.compare(that.total, total) != 0) return false;
        if (Double.compare(that.cMoney, cMoney) != 0) return false;
        if (Double.compare(that.dMoney, dMoney) != 0) return false;
        if (Double.compare(that.tMoney, tMoney) != 0) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = emplNo;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        temp = Double.doubleToLongBits(total);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(cMoney);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(dMoney);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(tMoney);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
