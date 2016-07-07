package scu.model;

import javax.persistence.*;

/**
 * Created by DAi on 16/7/7.
 */
@Entity
public class Userfactor {
    @Id
    private int userno;
    private String userfactor;

    public int getUserno() {
        return userno;
    }

    public void setUserno(int userno) {
        this.userno = userno;
    }

    public String getUserfactor() {
        return userfactor;
    }

    public void setUserfactor(String userfactor) {
        this.userfactor = userfactor;
    }
}
