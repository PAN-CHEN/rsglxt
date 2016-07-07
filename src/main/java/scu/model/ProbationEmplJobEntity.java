package scu.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by DAi on 16/7/6.
 */
@Entity
@Table(name = "ProbationEmplJob", schema = "RSGLXT", catalog = "")
public class ProbationEmplJobEntity {
    private int proEmplNo;
    private Date jobDate;
    private String job;
    private Integer grade;

    @Id
    @Column(name = "ProEmplNo")
    public int getProEmplNo() {
        return proEmplNo;
    }

    public void setProEmplNo(int proEmplNo) {
        this.proEmplNo = proEmplNo;
    }

    @Basic
    @Column(name = "JobDate")
    public Date getJobDate() {
        return jobDate;
    }

    public void setJobDate(Date jobDate) {
        this.jobDate = jobDate;
    }

    @Basic
    @Column(name = "Job")
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Basic
    @Column(name = "Grade")
    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProbationEmplJobEntity that = (ProbationEmplJobEntity) o;

        if (proEmplNo != that.proEmplNo) return false;
        if (jobDate != null ? !jobDate.equals(that.jobDate) : that.jobDate != null) return false;
        if (job != null ? !job.equals(that.job) : that.job != null) return false;
        if (grade != null ? !grade.equals(that.grade) : that.grade != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = proEmplNo;
        result = 31 * result + (jobDate != null ? jobDate.hashCode() : 0);
        result = 31 * result + (job != null ? job.hashCode() : 0);
        result = 31 * result + (grade != null ? grade.hashCode() : 0);
        return result;
    }
}
