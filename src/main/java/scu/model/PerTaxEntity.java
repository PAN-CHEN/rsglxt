package scu.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by lijiankuan on 16/7/6.
 */
@Entity
@Table(name = "PerTax", schema = "rsglxt", catalog = "")
@IdClass(PerTaxEntityPK.class)
public class PerTaxEntity {
    private int emplNo;
    private Date date;
    private double taxMoney;

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
    @Column(name = "TaxMoney")
    public double getTaxMoney() {
        return taxMoney;
    }

    public void setTaxMoney(double taxMoney) {
        this.taxMoney = taxMoney;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PerTaxEntity that = (PerTaxEntity) o;

        if (emplNo != that.emplNo) return false;
        if (Double.compare(that.taxMoney, taxMoney) != 0) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = emplNo;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        temp = Double.doubleToLongBits(taxMoney);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
