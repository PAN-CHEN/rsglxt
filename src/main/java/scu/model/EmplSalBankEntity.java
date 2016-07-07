package scu.model;

import javax.persistence.*;

/**
 * Created by DAi on 16/7/6.
 */
@Entity
@Table(name = "EmplSalBank", schema = "RSGLXT", catalog = "")
public class EmplSalBankEntity {
    private int emplNo;
    private String bankNo;
    private String bankName;

    @Id
    @Column(name = "EmplNo")
    public int getEmplNo() {
        return emplNo;
    }

    public void setEmplNo(int emplNo) {
        this.emplNo = emplNo;
    }

    @Basic
    @Column(name = "BankNo")
    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

    @Basic
    @Column(name = "BankName")
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmplSalBankEntity that = (EmplSalBankEntity) o;

        if (emplNo != that.emplNo) return false;
        if (bankNo != null ? !bankNo.equals(that.bankNo) : that.bankNo != null) return false;
        if (bankName != null ? !bankName.equals(that.bankName) : that.bankName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = emplNo;
        result = 31 * result + (bankNo != null ? bankNo.hashCode() : 0);
        result = 31 * result + (bankName != null ? bankName.hashCode() : 0);
        return result;
    }
}
