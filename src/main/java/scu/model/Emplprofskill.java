package scu.model;

import javax.persistence.*;

/**
 * Created by DAi on 16/7/7.
 */
@Entity
public class Emplprofskill {
    @Id
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
