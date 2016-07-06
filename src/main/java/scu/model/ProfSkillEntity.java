package scu.model;

import javax.persistence.*;

/**
 * Created by lijiankuan on 16/7/6.
 */
@Entity
@Table(name = "ProfSkill", schema = "rsglxt", catalog = "")
public class ProfSkillEntity {
    private int skillNo;
    private String skillName;

    @Id
    @Column(name = "SkillNo")
    public int getSkillNo() {
        return skillNo;
    }

    public void setSkillNo(int skillNo) {
        this.skillNo = skillNo;
    }

    @Basic
    @Column(name = "SkillName")
    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProfSkillEntity that = (ProfSkillEntity) o;

        if (skillNo != that.skillNo) return false;
        if (skillName != null ? !skillName.equals(that.skillName) : that.skillName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = skillNo;
        result = 31 * result + (skillName != null ? skillName.hashCode() : 0);
        return result;
    }
}
