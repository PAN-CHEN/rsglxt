package scu.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by DAi on 16/7/7.
 */
@Entity
public class Accunmfund {
    @Id
    private int emplno;
    private Date date;
    private double accunmfund;

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

    public double getAccunmfund() {
        return accunmfund;
    }

    public void setAccunmfund(double accunmfund) {
        this.accunmfund = accunmfund;
    }
}
