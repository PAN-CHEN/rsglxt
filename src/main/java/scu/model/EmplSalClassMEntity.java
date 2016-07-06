package scu.model;

import javax.persistence.*;

/**
 * Created by lijiankuan on 16/7/6.
 */
@Entity
@Table(name = "EmplSalClassM", schema = "rsglxt", catalog = "")
public class EmplSalClassMEntity {
    private int emplNo;
    private String salClass;

    @Id
    @Column(name = "EmplNo")
    public int getEmplNo() {
        return emplNo;
    }

    public void setEmplNo(int emplNo) {
        this.emplNo = emplNo;
    }

    @Basic
    @Column(name = "SalClass")
    public String getSalClass() {
        return salClass;
    }

    public void setSalClass(String salClass) {
        this.salClass = salClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmplSalClassMEntity that = (EmplSalClassMEntity) o;

        if (emplNo != that.emplNo) return false;
        if (salClass != null ? !salClass.equals(that.salClass) : that.salClass != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = emplNo;
        result = 31 * result + (salClass != null ? salClass.hashCode() : 0);
        return result;
    }
}
