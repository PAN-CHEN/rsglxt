package scu.model;

import javax.persistence.*;

/**
 * Created by lijiankuan on 16/7/6.
 */
@Entity
@Table(name = "EmplProfSkill", schema = "rsglxt", catalog = "")
@IdClass(EmplProfSkillEntityPK.class)
public class EmplProfSkillEntity {
    private int emplNo;
    private String skillNo;

    @Id
    @Column(name = "EmplNo")
    public int getEmplNo() {
        return emplNo;
    }

    public void setEmplNo(int emplNo) {
        this.emplNo = emplNo;
    }

    @Id
    @Column(name = "SkillNo")
    public String getSkillNo() {
        return skillNo;
    }

    public void setSkillNo(String skillNo) {
        this.skillNo = skillNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmplProfSkillEntity that = (EmplProfSkillEntity) o;

        if (emplNo != that.emplNo) return false;
        if (skillNo != null ? !skillNo.equals(that.skillNo) : that.skillNo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = emplNo;
        result = 31 * result + (skillNo != null ? skillNo.hashCode() : 0);
        return result;
    }
}
