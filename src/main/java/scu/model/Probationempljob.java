package scu.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Created by DAi on 16/7/7.
 */
@Entity
public class Probationempljob {
    private int proemplno;
    private Date jobdate;
    private String job;
    private Integer grade;

    public int getProemplno() {
        return proemplno;
    }

    public void setProemplno(int proemplno) {
        this.proemplno = proemplno;
    }

    public Date getJobdate() {
        return jobdate;
    }

    public void setJobdate(Date jobdate) {
        this.jobdate = jobdate;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}
