package scu.model;

import javax.persistence.*;

/**
 * Created by DAi on 16/7/6.
 */
@Entity
@Table(name = "EmplInfo", schema = "RSGLXT", catalog = "")
public class EmplInfoEntity {
    private int emplNo;
    private String name;
    private String addr;
    private String id;
    private String postNo;
    private String titleNo;
    private String tel;
    private String fileNo;
    private String newAddCh;
    private String idChangeCh;
    private String leaveCh;
    private String disContCh;

    @Id
    @Column(name = "EmplNo")
    public int getEmplNo() {
        return emplNo;
    }

    public void setEmplNo(int emplNo) {
        this.emplNo = emplNo;
    }

    @Basic
    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "Addr")
    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Basic
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "PostNo")
    public String getPostNo() {
        return postNo;
    }

    public void setPostNo(String postNo) {
        this.postNo = postNo;
    }

    @Basic
    @Column(name = "TitleNo")
    public String getTitleNo() {
        return titleNo;
    }

    public void setTitleNo(String titleNo) {
        this.titleNo = titleNo;
    }

    @Basic
    @Column(name = "Tel")
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Basic
    @Column(name = "FileNo")
    public String getFileNo() {
        return fileNo;
    }

    public void setFileNo(String fileNo) {
        this.fileNo = fileNo;
    }

    @Basic
    @Column(name = "NewAddCh")
    public String getNewAddCh() {
        return newAddCh;
    }

    public void setNewAddCh(String newAddCh) {
        this.newAddCh = newAddCh;
    }

    @Basic
    @Column(name = "IDChangeCh")
    public String getIdChangeCh() {
        return idChangeCh;
    }

    public void setIdChangeCh(String idChangeCh) {
        this.idChangeCh = idChangeCh;
    }

    @Basic
    @Column(name = "LeaveCh")
    public String getLeaveCh() {
        return leaveCh;
    }

    public void setLeaveCh(String leaveCh) {
        this.leaveCh = leaveCh;
    }

    @Basic
    @Column(name = "DisContCh")
    public String getDisContCh() {
        return disContCh;
    }

    public void setDisContCh(String disContCh) {
        this.disContCh = disContCh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmplInfoEntity that = (EmplInfoEntity) o;

        if (emplNo != that.emplNo) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (addr != null ? !addr.equals(that.addr) : that.addr != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (postNo != null ? !postNo.equals(that.postNo) : that.postNo != null) return false;
        if (titleNo != null ? !titleNo.equals(that.titleNo) : that.titleNo != null) return false;
        if (tel != null ? !tel.equals(that.tel) : that.tel != null) return false;
        if (fileNo != null ? !fileNo.equals(that.fileNo) : that.fileNo != null) return false;
        if (newAddCh != null ? !newAddCh.equals(that.newAddCh) : that.newAddCh != null) return false;
        if (idChangeCh != null ? !idChangeCh.equals(that.idChangeCh) : that.idChangeCh != null) return false;
        if (leaveCh != null ? !leaveCh.equals(that.leaveCh) : that.leaveCh != null) return false;
        if (disContCh != null ? !disContCh.equals(that.disContCh) : that.disContCh != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = emplNo;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (addr != null ? addr.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (postNo != null ? postNo.hashCode() : 0);
        result = 31 * result + (titleNo != null ? titleNo.hashCode() : 0);
        result = 31 * result + (tel != null ? tel.hashCode() : 0);
        result = 31 * result + (fileNo != null ? fileNo.hashCode() : 0);
        result = 31 * result + (newAddCh != null ? newAddCh.hashCode() : 0);
        result = 31 * result + (idChangeCh != null ? idChangeCh.hashCode() : 0);
        result = 31 * result + (leaveCh != null ? leaveCh.hashCode() : 0);
        result = 31 * result + (disContCh != null ? disContCh.hashCode() : 0);
        return result;
    }
}
