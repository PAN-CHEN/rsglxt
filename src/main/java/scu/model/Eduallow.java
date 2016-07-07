package scu.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by DAi on 16/7/7.
 */
@Entity
public class Eduallow {
    private String edu;
    private double allowratio;

    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu;
    }

    public double getAllowratio() {
        return allowratio;
    }

    public void setAllowratio(double allowratio) {
        this.allowratio = allowratio;
    }
}
