package scu.model;

import javax.persistence.*;

/**
 * Created by DAi on 16/7/7.
 */
@Entity
public class Tempaward {
    @Id
    private String awardno;
    private String awardname;
    private double money;

    public String getAwardno() {
        return awardno;
    }

    public void setAwardno(String awardno) {
        this.awardno = awardno;
    }

    public String getAwardname() {
        return awardname;
    }

    public void setAwardname(String awardname) {
        this.awardname = awardname;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
