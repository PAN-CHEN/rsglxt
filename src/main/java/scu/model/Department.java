package scu.model;

import javax.persistence.*;

/**
 * Created by DAi on 16/7/7.
 */
@Entity
public class Department {
    @Id
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
