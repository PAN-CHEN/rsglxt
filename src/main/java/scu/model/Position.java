package scu.model;

import javax.persistence.*;

/**
 * Created by DAi on 16/7/7.
 */
@Entity
public class Position {
    @Id
    private String posino;
    private String posiname;
    private String change;

    public String getPosino() {
        return posino;
    }

    public void setPosino(String posino) {
        this.posino = posino;
    }

    public String getPosiname() {
        return posiname;
    }

    public void setPosiname(String posiname) {
        this.posiname = posiname;
    }

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }
}
