package scu.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;

/**
 * Created by DAi on 16/7/6.
 */
public class AllowanceEntityPK implements Serializable {
    private int emplNo;
    private Date date;

    @Column(name = "EmplNo")
    @Id
    public int getEmplNo() {
        return emplNo;
    }

    public void setEmplNo(int emplNo) {
        this.emplNo = emplNo;
    }

    @Column(name = "Date")
    @Id
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AllowanceEntityPK that = (AllowanceEntityPK) o;

        if (emplNo != that.emplNo) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = emplNo;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }
}
