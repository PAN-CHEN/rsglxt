package scu.model;

import javax.persistence.*;

/**
 * Created by DAi on 16/7/6.
 */
@Entity
@Table(name = "ProfSkill", schema = "RSGLXT", catalog = "")
public class ProfSkillEntity {
    private String skillNo;
    private String skillName;

    @Id
    @Column(name = "SkillNo")
    public String getSkillNo() {
        return skillNo;
    }

    public void setSkillNo(String skillNo) {
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

        if (skillNo != null ? !skillNo.equals(that.skillNo) : that.skillNo != null) return false;
        if (skillName != null ? !skillName.equals(that.skillName) : that.skillName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = skillNo != null ? skillNo.hashCode() : 0;
        result = 31 * result + (skillName != null ? skillName.hashCode() : 0);
        return result;
    }
}
