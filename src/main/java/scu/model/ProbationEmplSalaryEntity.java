package scu.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by DAi on 16/7/6.
 */
@Entity
@Table(name = "ProbationEmplSalary", schema = "RSGLXT", catalog = "")
public class ProbationEmplSalaryEntity {
    private int proEmplNo;
    private double salary;
    private Date date;

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

    @Basic
    @Column(name = "Date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProbationEmplSalaryEntity that = (ProbationEmplSalaryEntity) o;

        if (proEmplNo != that.proEmplNo) return false;
        if (Double.compare(that.salary, salary) != 0) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = proEmplNo;
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }
}
