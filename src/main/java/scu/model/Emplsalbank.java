package scu.model;

import javax.persistence.*;

/**
 * Created by DAi on 16/7/7.
 */
@Entity
public class Emplsalbank {
    @Id
    private int emplno;
    private String bankno;
    private String bankname;

    public int getEmplno() {
        return emplno;
    }

    public void setEmplno(int emplno) {
        this.emplno = emplno;
    }

    public String getBankno() {
        return bankno;
    }

    public void setBankno(String bankno) {
        this.bankno = bankno;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }
}
