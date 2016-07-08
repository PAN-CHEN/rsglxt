package scu.model;

import javax.persistence.*;

/**
 * Created by DAi on 16/7/7.
 */
@Entity
public class Emplsalset {
    @Id
    private int emplno;
    private String pertaxrank;
    private String salauth;
    private String currency;

    public int getEmplno() {
        return emplno;
    }

    public void setEmplno(int emplno) {
        this.emplno = emplno;
    }

    public String getPertaxrank() {
        return pertaxrank;
    }

    public void setPertaxrank(String pertaxrank) {
        this.pertaxrank = pertaxrank;
    }

    public String getSalauth() {
        return salauth;
    }

    public void setSalauth(String salauth) {
        this.salauth = salauth;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
