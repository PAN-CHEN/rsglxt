package scu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by DAi on 16/7/6.
 */
@Entity
@Table(name = "EmplSalClassM", schema = "RSGLXT", catalog = "")
public class EmplSalClassMEntity {
    private int emplNo;

    @Id
    @Column(name = "EmplNo")
    public int getEmplNo() {
        return emplNo;
    }

    public void setEmplNo(int emplNo) {
        this.emplNo = emplNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmplSalClassMEntity that = (EmplSalClassMEntity) o;

        if (emplNo != that.emplNo) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return emplNo;
    }
}
