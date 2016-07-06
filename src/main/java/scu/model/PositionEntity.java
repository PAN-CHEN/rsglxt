package scu.model;

import javax.persistence.*;

/**
 * Created by lijiankuan on 16/7/6.
 */
@Entity
@Table(name = "Position", schema = "rsglxt", catalog = "")
public class PositionEntity {
    private int posiNo;
    private String posiName;
    private String change;

    @Id
    @Column(name = "PosiNo")
    public int getPosiNo() {
        return posiNo;
    }

    public void setPosiNo(int posiNo) {
        this.posiNo = posiNo;
    }

    @Basic
    @Column(name = "PosiName")
    public String getPosiName() {
        return posiName;
    }

    public void setPosiName(String posiName) {
        this.posiName = posiName;
    }

    @Basic
    @Column(name = "Change")
    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PositionEntity that = (PositionEntity) o;

        if (posiNo != that.posiNo) return false;
        if (posiName != null ? !posiName.equals(that.posiName) : that.posiName != null) return false;
        if (change != null ? !change.equals(that.change) : that.change != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = posiNo;
        result = 31 * result + (posiName != null ? posiName.hashCode() : 0);
        result = 31 * result + (change != null ? change.hashCode() : 0);
        return result;
    }
}
