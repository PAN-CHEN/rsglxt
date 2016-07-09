package scu.model;

import javax.persistence.*;

/**
<<<<<<< Updated upstream
 * Created by DAi on 16/7/7.
 */
@Entity
public class Emplinfo {
    @Id
    private int emplno;
    private String name;
    private String edu;
    private String addr;
    private String depno;
    private String id;
    private String postno;
    private String titleno;
    private String tel;
    private String fileno;
    private String newaddch;
    private String idchangech;
    private String leavech;
    private String discontch;



    public int getEmplno() {
        return emplno;
    }

    public void setEmplno(int emplno) {
        this.emplno = emplno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getDepno() {
        return depno;
    }

    public void setDepno(String depno) {
        this.depno = depno;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPostno() {
        return postno;
    }

    public void setPostno(String postno) {
        this.postno = postno;
    }

    public String getTitleno() {
        return titleno;
    }

    public void setTitleno(String titleno) {
        this.titleno = titleno;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getFileno() {
        return fileno;
    }

    public void setFileno(String fileno) {
        this.fileno = fileno;
    }

    public String getNewaddch() {
        return newaddch;
    }

    public void setNewaddch(String newaddch) {
        this.newaddch = newaddch;
    }

    public String getIdchangech() {
        return idchangech;
    }

    public void setIdchangech(String idchangech) {
        this.idchangech = idchangech;
    }

    public String getLeavech() {
        return leavech;
    }

    public void setLeavech(String leavech) {
        this.leavech = leavech;
    }

    public String getDiscontch() {
        return discontch;
    }

    public void setDiscontch(String discontch) {
        this.discontch = discontch;
    }
}
