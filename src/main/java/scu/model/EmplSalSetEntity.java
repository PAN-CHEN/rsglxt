package scu.model;

import javax.persistence.*;

/**
 * Created by DAi on 16/7/6.
 */
@Entity
@Table(name = "EmplSalSet", schema = "RSGLXT", catalog = "")
public class EmplSalSetEntity {
    private int emplNo;
    private String salAuth;
    private String currency;

    @Id
    @Column(name = "EmplNo")
    public int getEmplNo() {
        return emplNo;
    }

    public void setEmplNo(int emplNo) {
        this.emplNo = emplNo;
    }

    @Basic
    @Column(name = "SalAuth")
    public String getSalAuth() {
        return salAuth;
    }

    public void setSalAuth(String salAuth) {
        this.salAuth = salAuth;
    }

    @Basic
    @Column(name = "Currency")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmplSalSetEntity that = (EmplSalSetEntity) o;

        if (emplNo != that.emplNo) return false;
        if (salAuth != null ? !salAuth.equals(that.salAuth) : that.salAuth != null) return false;
        if (currency != null ? !currency.equals(that.currency) : that.currency != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = emplNo;
        result = 31 * result + (salAuth != null ? salAuth.hashCode() : 0);
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        return result;
    }
}
