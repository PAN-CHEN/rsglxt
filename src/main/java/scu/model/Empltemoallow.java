package scu.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Created by DAi on 16/7/7.
 */
@Entity
public class Empltemoallow {
    private int emplno;
    private Date date;
    private String allowno;

    public int getEmplno() {
        return emplno;
    }

    public void setEmplno(int emplno) {
        this.emplno = emplno;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAllowno() {
        return allowno;
    }

    public void setAllowno(String allowno) {
        this.allowno = allowno;
    }
}
