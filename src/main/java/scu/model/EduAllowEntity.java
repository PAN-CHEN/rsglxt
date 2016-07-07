package scu.model;

import javax.persistence.*;

/**
 * Created by DAi on 16/7/6.
 */
@Entity
@Table(name = "EduAllow", schema = "RSGLXT", catalog = "")
public class EduAllowEntity {
    private String edu;
    private double allowRatio;

    @Id
    @Column(name = "Edu")
    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu;
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

        EduAllowEntity that = (EduAllowEntity) o;

        if (Double.compare(that.allowRatio, allowRatio) != 0) return false;
        if (edu != null ? !edu.equals(that.edu) : that.edu != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = edu != null ? edu.hashCode() : 0;
        temp = Double.doubleToLongBits(allowRatio);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
