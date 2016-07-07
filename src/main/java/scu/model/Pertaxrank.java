package scu.model;

import javax.persistence.*;

/**
 * Created by DAi on 16/7/7.
 */
@Entity
public class Pertaxrank {
    @Id
    private String pertaxrank;
    private double taxrank;

    public String getPertaxrank() {
        return pertaxrank;
    }

    public void setPertaxrank(String pertaxrank) {
        this.pertaxrank = pertaxrank;
    }

    public double getTaxrank() {
        return taxrank;
    }

    public void setTaxrank(double taxrank) {
        this.taxrank = taxrank;
    }
}
