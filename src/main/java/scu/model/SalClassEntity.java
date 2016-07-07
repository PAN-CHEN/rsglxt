package scu.model;

import javax.persistence.*;

/**
 * Created by DAi on 16/7/6.
 */
@Entity
@Table(name = "SalClass", schema = "RSGLXT", catalog = "")
public class SalClassEntity {
    private String saClass;
    private double bassSal;
    private String how;

    @Id
    @Column(name = "SaClass")
    public String getSaClass() {
        return saClass;
    }

    public void setSaClass(String saClass) {
        this.saClass = saClass;
    }

    @Basic
    @Column(name = "BassSal")
    public double getBassSal() {
        return bassSal;
    }

    public void setBassSal(double bassSal) {
        this.bassSal = bassSal;
    }

    @Basic
    @Column(name = "How")
    public String getHow() {
        return how;
    }

    public void setHow(String how) {
        this.how = how;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SalClassEntity that = (SalClassEntity) o;

        if (Double.compare(that.bassSal, bassSal) != 0) return false;
        if (saClass != null ? !saClass.equals(that.saClass) : that.saClass != null) return false;
        if (how != null ? !how.equals(that.how) : that.how != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = saClass != null ? saClass.hashCode() : 0;
        temp = Double.doubleToLongBits(bassSal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (how != null ? how.hashCode() : 0);
        return result;
    }
}
