package scu.model;

import javax.persistence.*;

/**
 * Created by DAi on 16/7/6.
 */
@Entity
@Table(name = "SpecialPosAllow", schema = "RSGLXT", catalog = "")
public class SpecialPosAllowEntity {
    private String posiNo;
    private double specAllow;

    @Id
    @Column(name = "PosiNo")
    public String getPosiNo() {
        return posiNo;
    }

    public void setPosiNo(String posiNo) {
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

        if (Double.compare(that.specAllow, specAllow) != 0) return false;
        if (posiNo != null ? !posiNo.equals(that.posiNo) : that.posiNo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = posiNo != null ? posiNo.hashCode() : 0;
        temp = Double.doubleToLongBits(specAllow);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
