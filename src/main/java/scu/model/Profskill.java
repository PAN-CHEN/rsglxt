package scu.model;

import javax.persistence.*;

/**
 * Created by DAi on 16/7/7.
 */
@Entity
public class Profskill {
    @Id
    private String skillno;
    private String skillname;

    public String getSkillno() {
        return skillno;
    }

    public void setSkillno(String skillno) {
        this.skillno = skillno;
    }

    public String getSkillname() {
        return skillname;
    }

    public void setSkillname(String skillname) {
        this.skillname = skillname;
    }
}
