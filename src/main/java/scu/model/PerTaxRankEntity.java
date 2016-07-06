package scu.model;

import javax.persistence.*;

/**
 * Created by DAi on 16/7/6.
 */
@Entity
@Table(name = "PerTaxRank", schema = "RSGLXT", catalog = "")
public class PerTaxRankEntity {
    private String perTaxRank;
    private double taxRank;

    @Id
    @Column(name = "PerTaxRank")
    public String getPerTaxRank() {
        return perTaxRank;
    }

    public void setPerTaxRank(String perTaxRank) {
        this.perTaxRank = perTaxRank;
    }

    @Basic
    @Column(name = "TaxRank")
    public double getTaxRank() {
        return taxRank;
    }

    public void setTaxRank(double taxRank) {
        this.taxRank = taxRank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PerTaxRankEntity that = (PerTaxRankEntity) o;

        if (Double.compare(that.taxRank, taxRank) != 0) return false;
        if (perTaxRank != null ? !perTaxRank.equals(that.perTaxRank) : that.perTaxRank != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = perTaxRank != null ? perTaxRank.hashCode() : 0;
        temp = Double.doubleToLongBits(taxRank);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
