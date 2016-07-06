package scu.model;

import javax.persistence.*;

/**
 * Created by lijiankuan on 16/7/6.
 */
@Entity
@Table(name = "ProbationEmplSalary", schema = "rsglxt", catalog = "")
public class ProbationEmplSalaryEntity {
    private int proEmplNo;
    private double salary;

    @Id
    @Column(name = "ProEmplNo")
    public int getProEmplNo() {
        return proEmplNo;
    }

    public void setProEmplNo(int proEmplNo) {
        this.proEmplNo = proEmplNo;
    }

    @Basic
    @Column(name = "Salary")
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProbationEmplSalaryEntity that = (ProbationEmplSalaryEntity) o;

        if (proEmplNo != that.proEmplNo) return false;
        if (Double.compare(that.salary, salary) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = proEmplNo;
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
