package scu.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by lijiankuan on 16/7/6.
 */
@Entity
@Table(name = "AccunmFund", schema = "rsglxt", catalog = "")
@IdClass(AccunmFundEntityPK.class)
public class AccunmFundEntity {
    private int emplNo;
    private Date date;
    private double accunmFund;

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
    @Column(name = "AccunmFund")
    public double getAccunmFund() {
        return accunmFund;
    }

    public void setAccunmFund(double accunmFund) {
        this.accunmFund = accunmFund;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AccunmFundEntity that = (AccunmFundEntity) o;

        if (emplNo != that.emplNo) return false;
        if (Double.compare(that.accunmFund, accunmFund) != 0) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = emplNo;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        temp = Double.doubleToLongBits(accunmFund);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
