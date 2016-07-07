package scu.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by DAi on 16/7/6.
 */
@Entity
@Table(name = "EmplTemoAllow", schema = "RSGLXT", catalog = "")
public class EmplTemoAllowEntity {
    private int emplNo;
    private Date date;

    @Id
    @Column(name = "EmplNo")
    public int getEmplNo() {
        return emplNo;
    }

    public void setEmplNo(int emplNo) {
        this.emplNo = emplNo;
    }

    @Basic
    @Column(name = "Date")
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

        EmplTemoAllowEntity that = (EmplTemoAllowEntity) o;

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
