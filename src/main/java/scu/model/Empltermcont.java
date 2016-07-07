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
public class Empltermcont {
    private int emplno;
    private String contno;
    private Date effectdate;
    private Date invailddate;

    public int getEmplno() {
        return emplno;
    }

    public void setEmplno(int emplno) {
        this.emplno = emplno;
    }

    public String getContno() {
        return contno;
    }

    public void setContno(String contno) {
        this.contno = contno;
    }

    public Date getEffectdate() {
        return effectdate;
    }

    public void setEffectdate(Date effectdate) {
        this.effectdate = effectdate;
    }

    public Date getInvailddate() {
        return invailddate;
    }

    public void setInvailddate(Date invailddate) {
        this.invailddate = invailddate;
    }
}
