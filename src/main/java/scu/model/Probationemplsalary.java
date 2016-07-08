package scu.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by DAi on 16/7/7.
 */
@Entity
public class Probationemplsalary {
    @Id
    private int proemplno;
    private double salary;
    private Date date;

    public int getProemplno() {
        return proemplno;
    }

    public void setProemplno(int proemplno) {
        this.proemplno = proemplno;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
