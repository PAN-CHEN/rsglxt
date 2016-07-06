package scu.model;

import javax.persistence.*;

/**
 * Created by lijiankuan on 16/7/6.
 */
@Entity
@Table(name = "FormalEmplAllowRatio", schema = "rsglxt", catalog = "")
public class FormalEmplAllowRatioEntity {
    private int emplNo;
    private double allowRatio;

    @Id
    @Column(name = "EmplNo")
    public int getEmplNo() {
        return emplNo;
    }

    public void setEmplNo(int emplNo) {
        this.emplNo = emplNo;
    }

    @Basic
    @Column(name = "AllowRatio")
    public double getAllowRatio() {
        return allowRatio;
    }

    public void setAllowRatio(double allowRatio) {
        this.allowRatio = allowRatio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FormalEmplAllowRatioEntity that = (FormalEmplAllowRatioEntity) o;

        if (emplNo != that.emplNo) return false;
        if (Double.compare(that.allowRatio, allowRatio) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = emplNo;
        temp = Double.doubleToLongBits(allowRatio);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
