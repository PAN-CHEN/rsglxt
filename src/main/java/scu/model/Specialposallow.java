package scu.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by DAi on 16/7/7.
 */
@Entity
public class Specialposallow {
    private String posino;
    private double specallow;

    public String getPosino() {
        return posino;
    }

    public void setPosino(String posino) {
        this.posino = posino;
    }

    public double getSpecallow() {
        return specallow;
    }

    public void setSpecallow(double specallow) {
        this.specallow = specallow;
    }
}
