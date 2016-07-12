package scu.model;

import javax.persistence.*;

/**
 * Created by DAi on 16/7/7.
 */
@Entity
public class Formalemplallowratio {
    @Id
    private int emplno;
    private double allowratio;

    public Formalemplallowratio() {
    }

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
