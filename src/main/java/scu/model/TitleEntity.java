package scu.model;

import javax.persistence.*;

/**
 * Created by lijiankuan on 16/7/6.
 */
@Entity
@Table(name = "Title", schema = "rsglxt", catalog = "")
public class TitleEntity {
    private int titleNo;
    private String titleName;
    private String change;

    @Id
    @Column(name = "TitleNo")
    public int getTitleNo() {
        return titleNo;
    }

    public void setTitleNo(int titleNo) {
        this.titleNo = titleNo;
    }

    @Basic
    @Column(name = "TitleName")
    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    @Basic
    @Column(name = "Change")
    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TitleEntity that = (TitleEntity) o;

        if (titleNo != that.titleNo) return false;
        if (titleName != null ? !titleName.equals(that.titleName) : that.titleName != null) return false;
        if (change != null ? !change.equals(that.change) : that.change != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = titleNo;
        result = 31 * result + (titleName != null ? titleName.hashCode() : 0);
        result = 31 * result + (change != null ? change.hashCode() : 0);
        return result;
    }
}
