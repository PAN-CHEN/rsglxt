package scu.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by lijiankuan on 16/7/6.
 */
@Entity
@Table(name = "Allowance", schema = "rsglxt", catalog = "")
@IdClass(AllowanceEntityPK.class)
public class AllowanceEntity {
    private int emplNo;
    private Date date;
    private Double reGive;
    private Double weGive;
    private Double specAllow;
    private Double foodGive;
    private Double accumFund;
    private Double allowRatio;
    private double allow;

    @Id
    @Column(name = "EmplNo")
    public int getEmplNo() {
        return emplNo;
    }

    public void setEmplNo(int emplNo) {
        this.emplNo = emplNo;
    }

    @Id
    @Column(name = "Date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic
    @Column(name = "ReGive")
    public Double getReGive() {
        return reGive;
    }

    public void setReGive(Double reGive) {
        this.reGive = reGive;
    }

    @Basic
    @Column(name = "WEGive")
    public Double getWeGive() {
        return weGive;
    }

    public void setWeGive(Double weGive) {
        this.weGive = weGive;
    }

    @Basic
    @Column(name = "SpecAllow")
    public Double getSpecAllow() {
        return specAllow;
    }

    public void setSpecAllow(Double specAllow) {
        this.specAllow = specAllow;
    }

    @Basic
    @Column(name = "FoodGive")
    public Double getFoodGive() {
        return foodGive;
    }

    public void setFoodGive(Double foodGive) {
        this.foodGive = foodGive;
    }

    @Basic
    @Column(name = "AccumFund")
    public Double getAccumFund() {
        return accumFund;
    }

    public void setAccumFund(Double accumFund) {
        this.accumFund = accumFund;
    }

    @Basic
    @Column(name = "AllowRatio")
    public Double getAllowRatio() {
        return allowRatio;
    }

    public void setAllowRatio(Double allowRatio) {
        this.allowRatio = allowRatio;
    }

    @Basic
    @Column(name = "Allow")
    public double getAllow() {
        return allow;
    }

    public void setAllow(double allow) {
        this.allow = allow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AllowanceEntity that = (AllowanceEntity) o;

        if (emplNo != that.emplNo) return false;
        if (Double.compare(that.allow, allow) != 0) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (reGive != null ? !reGive.equals(that.reGive) : that.reGive != null) return false;
        if (weGive != null ? !weGive.equals(that.weGive) : that.weGive != null) return false;
        if (specAllow != null ? !specAllow.equals(that.specAllow) : that.specAllow != null) return false;
        if (foodGive != null ? !foodGive.equals(that.foodGive) : that.foodGive != null) return false;
        if (accumFund != null ? !accumFund.equals(that.accumFund) : that.accumFund != null) return false;
        if (allowRatio != null ? !allowRatio.equals(that.allowRatio) : that.allowRatio != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = emplNo;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (reGive != null ? reGive.hashCode() : 0);
        result = 31 * result + (weGive != null ? weGive.hashCode() : 0);
        result = 31 * result + (specAllow != null ? specAllow.hashCode() : 0);
        result = 31 * result + (foodGive != null ? foodGive.hashCode() : 0);
        result = 31 * result + (accumFund != null ? accumFund.hashCode() : 0);
        result = 31 * result + (allowRatio != null ? allowRatio.hashCode() : 0);
        temp = Double.doubleToLongBits(allow);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
