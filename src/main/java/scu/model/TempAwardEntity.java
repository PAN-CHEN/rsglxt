package scu.model;

import javax.persistence.*;

/**
 * Created by lijiankuan on 16/7/6.
 */
@Entity
@Table(name = "TempAward", schema = "rsglxt", catalog = "")
public class TempAwardEntity {
    private String awardName;
    private int money;

    @Id
    @Column(name = "AwardName")
    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    @Basic
    @Column(name = "Money")
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TempAwardEntity that = (TempAwardEntity) o;

        if (money != that.money) return false;
        if (awardName != null ? !awardName.equals(that.awardName) : that.awardName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = awardName != null ? awardName.hashCode() : 0;
        result = 31 * result + money;
        return result;
    }
}
