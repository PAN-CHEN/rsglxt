package scu.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by lijiankuan on 16/7/6.
 */
@Entity
@Table(name = "EmplTemoAllow", schema = "rsglxt", catalog = "")
public class EmplTemoAllowEntity {
    private int emplNo;
    private Date date;
    private String allowName;

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

    @Basic
    @Column(name = "AllowName")
    public String getAllowName() {
        return allowName;
    }

    public void setAllowName(String allowName) {
        this.allowName = allowName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmplTemoAllowEntity that = (EmplTemoAllowEntity) o;

        if (emplNo != that.emplNo) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (allowName != null ? !allowName.equals(that.allowName) : that.allowName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = emplNo;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (allowName != null ? allowName.hashCode() : 0);
        return result;
    }
}
