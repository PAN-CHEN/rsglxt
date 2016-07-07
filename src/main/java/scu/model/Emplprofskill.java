package scu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

/**
 * Created by DAi on 16/7/7.
 */
@Entity
public class Emplprofskill {
    private int emplno;
    private String skillno;

    public int getEmplno() {
        return emplno;
    }

    public void setEmplno(int emplno) {
        this.emplno = emplno;
    }

    public String getSkillno() {
        return skillno;
    }

    public void setSkillno(String skillno) {
        this.skillno = skillno;
    }
}
