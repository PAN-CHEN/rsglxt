package scu.model;

import javax.persistence.*;

/**
 * Created by lijiankuan on 16/7/6.
 */
@Entity
@Table(name = "EmplSalSet", schema = "rsglxt", catalog = "")
public class EmplSalSetEntity {
    private int emplNo;
    private String perTaxRank;
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
    @Column(name = "PerTaxRank")
    public String getPerTaxRank() {
        return perTaxRank;
    }

    public void setPerTaxRank(String perTaxRank) {
        this.perTaxRank = perTaxRank;
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
        if (perTaxRank != null ? !perTaxRank.equals(that.perTaxRank) : that.perTaxRank != null) return false;
        if (salAuth != null ? !salAuth.equals(that.salAuth) : that.salAuth != null) return false;
        if (currency != null ? !currency.equals(that.currency) : that.currency != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = emplNo;
        result = 31 * result + (perTaxRank != null ? perTaxRank.hashCode() : 0);
        result = 31 * result + (salAuth != null ? salAuth.hashCode() : 0);
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        return result;
    }
}
