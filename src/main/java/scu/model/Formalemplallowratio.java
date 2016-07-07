package scu.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by DAi on 16/7/7.
 */
@Entity
public class Formalemplallowratio {
    private int emplno;
    private double allowratio;

    public int getEmplno() {
        return emplno;
    }

    public void setEmplno(int emplno) {
        this.emplno = emplno;
    }

    public double getAllowratio() {
        return allowratio;
    }

    public void setAllowratio(double allowratio) {
        this.allowratio = allowratio;
    }
}
