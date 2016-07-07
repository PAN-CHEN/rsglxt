package scu.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by DAi on 16/7/7.
 */
@Entity
public class Department {
    private String departno;
    private String departname;

    public String getDepartno() {
        return departno;
    }

    public void setDepartno(String departno) {
        this.departno = departno;
    }

    public String getDepartname() {
        return departname;
    }

    public void setDepartname(String departname) {
        this.departname = departname;
    }
}
