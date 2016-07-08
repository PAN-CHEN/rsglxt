package scu.model;

import javax.persistence.*;

/**
 * Created by DAi on 16/7/7.
 */
@Entity
public class Salclass {
    @Id
    private String saclass;
    private double basssal;
    private String how;

    public String getSaclass() {
        return saclass;
    }

    public void setSaclass(String saclass) {
        this.saclass = saclass;
    }

    public double getBasssal() {
        return basssal;
    }

    public void setBasssal(double basssal) {
        this.basssal = basssal;
    }

    public String getHow() {
        return how;
    }

    public void setHow(String how) {
        this.how = how;
    }
}
