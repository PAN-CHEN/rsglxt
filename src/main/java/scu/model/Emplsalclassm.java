package scu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by DAi on 16/7/7.
 */
@Entity
public class Emplsalclassm {
    private int emplno;
    private String salclass;

    public int getEmplno() {
        return emplno;
    }

    public void setEmplno(int emplno) {
        this.emplno = emplno;
    }

    public String getSalclass() {
        return salclass;
    }

    public void setSalclass(String salclass) {
        this.salclass = salclass;
    }
}
