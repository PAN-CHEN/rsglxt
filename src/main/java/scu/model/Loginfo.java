package scu.model;

import javax.persistence.*;



@Entity

public class Loginfo {
    @Id
    private Integer emplno;
    private String password;
    private String username;


    public Integer getEmplno() {
        return emplno;
    }

    public void setEmplno(Integer emplno) {
        this.emplno = emplno;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
