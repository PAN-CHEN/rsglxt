package scu.model;

import javax.persistence.*;

/**
 * Created by DAi on 16/7/7.
 */
@Entity
public class Title {
    @Id
    private String titleno;
    private String titlename;
    private String change;

    public String getTitleno() {
        return titleno;
    }

    public void setTitleno(String titleno) {
        this.titleno = titleno;
    }

    public String getTitlename() {
        return titlename;
    }

    public void setTitlename(String titlename) {
        this.titlename = titlename;
    }

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }
}
