package scu.model;

import javax.persistence.*;

/**
 * Created by lijiankuan on 16/7/6.
 */
@Entity
@Table(name = "SpecialPosAllow", schema = "rsglxt", catalog = "")
public class SpecialPosAllowEntity {
    private int posiNo;
    private double specAllow;

    @Id
    @Column(name = "PosiNo")
    public int getPosiNo() {
        return posiNo;
    }

    public void setPosiNo(int posiNo) {
        this.posiNo = posiNo;
    }

    @Basic
    @Column(name = "SpecAllow")
    public double getSpecAllow() {
        return specAllow;
    }

    public void setSpecAllow(double specAllow) {
        this.specAllow = specAllow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SpecialPosAllowEntity that = (SpecialPosAllowEntity) o;

        if (posiNo != that.posiNo) return false;
        if (Double.compare(that.specAllow, specAllow) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = posiNo;
        temp = Double.doubleToLongBits(specAllow);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
