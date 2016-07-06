package scu.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by DAi on 16/7/6.
 */
@Entity
@Table(name = "OfficeTermCont", schema = "RSGLXT", catalog = "")
public class OfficeTermContEntity {
    private int emplNo;
    private String contNo;
    private Date effectDate;
    private Date invaildDate;

    @Id
    @Column(name = "EmplNo")
    public int getEmplNo() {
        return emplNo;
    }

    public void setEmplNo(int emplNo) {
        this.emplNo = emplNo;
    }

    @Basic
    @Column(name = "ContNo")
    public String getContNo() {
        return contNo;
    }

    public void setContNo(String contNo) {
        this.contNo = contNo;
    }

    @Basic
    @Column(name = "EffectDate")
    public Date getEffectDate() {
        return effectDate;
    }

    public void setEffectDate(Date effectDate) {
        this.effectDate = effectDate;
    }

    @Basic
    @Column(name = "InvaildDate")
    public Date getInvaildDate() {
        return invaildDate;
    }

    public void setInvaildDate(Date invaildDate) {
        this.invaildDate = invaildDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OfficeTermContEntity that = (OfficeTermContEntity) o;

        if (emplNo != that.emplNo) return false;
        if (contNo != null ? !contNo.equals(that.contNo) : that.contNo != null) return false;
        if (effectDate != null ? !effectDate.equals(that.effectDate) : that.effectDate != null) return false;
        if (invaildDate != null ? !invaildDate.equals(that.invaildDate) : that.invaildDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = emplNo;
        result = 31 * result + (contNo != null ? contNo.hashCode() : 0);
        result = 31 * result + (effectDate != null ? effectDate.hashCode() : 0);
        result = 31 * result + (invaildDate != null ? invaildDate.hashCode() : 0);
        return result;
    }
}
