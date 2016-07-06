package scu.model;

import javax.persistence.*;

/**
 * Created by lijiankuan on 16/7/6.
 */
@Entity
@Table(name = "Department", schema = "rsglxt", catalog = "")
public class DepartmentEntity {
    private int departNo;
    private String departName;

    @Id
    @Column(name = "DepartNo")
    public int getDepartNo() {
        return departNo;
    }

    public void setDepartNo(int departNo) {
        this.departNo = departNo;
    }

    @Basic
    @Column(name = "DepartName")
    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DepartmentEntity that = (DepartmentEntity) o;

        if (departNo != that.departNo) return false;
        if (departName != null ? !departName.equals(that.departName) : that.departName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = departNo;
        result = 31 * result + (departName != null ? departName.hashCode() : 0);
        return result;
    }
}
