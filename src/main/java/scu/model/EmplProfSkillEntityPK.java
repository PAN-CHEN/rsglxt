package scu.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by DAi on 16/7/6.
 */
public class EmplProfSkillEntityPK implements Serializable {
    private int emplNo;
    private String skillNo;

    @Column(name = "EmplNo")
    @Id
    public int getEmplNo() {
        return emplNo;
    }

    public void setEmplNo(int emplNo) {
        this.emplNo = emplNo;
    }

    @Column(name = "SkillNo")
    @Id
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

        EmplProfSkillEntityPK that = (EmplProfSkillEntityPK) o;

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
