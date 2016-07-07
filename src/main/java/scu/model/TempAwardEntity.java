package scu.model;

import javax.persistence.*;

/**
 * Created by DAi on 16/7/6.
 */
@Entity
@Table(name = "TempAward", schema = "RSGLXT", catalog = "")
public class TempAwardEntity {
    private String awardNo;
    private String awardName;
    private double money;

    @Id
    @Column(name = "AwardNo")
    public String getAwardNo() {
        return awardNo;
    }

    public void setAwardNo(String awardNo) {
        this.awardNo = awardNo;
    }

    @Basic
    @Column(name = "AwardName")
    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    @Basic
    @Column(name = "Money")
    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TempAwardEntity that = (TempAwardEntity) o;

        if (Double.compare(that.money, money) != 0) return false;
        if (awardNo != null ? !awardNo.equals(that.awardNo) : that.awardNo != null) return false;
        if (awardName != null ? !awardName.equals(that.awardName) : that.awardName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = awardNo != null ? awardNo.hashCode() : 0;
        result = 31 * result + (awardName != null ? awardName.hashCode() : 0);
        temp = Double.doubleToLongBits(money);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
