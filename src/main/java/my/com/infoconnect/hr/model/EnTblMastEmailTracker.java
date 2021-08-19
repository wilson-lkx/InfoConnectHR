package my.com.infoconnect.hr.model;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
@Table(name = "EN_TBL_MAST_EMAIL_TRACKER")
public class EnTblMastEmailTracker implements Serializable {

    private static final long serialVersionUID = 1L;

    @Basic
    @Column(name = "ETID")
    private String ETID;

    @Basic
    @Column(name = "Name")
    private String name;

    @Basic
    @Column(name = "Email")
    private String email;

    @Basic
    @Column(name = "StaffID")
    private String staffID;

    @Basic
    @Column(name = "DeptID")
    private String deptID;

    public void setETID(String ETID) {
        this.ETID = ETID;
    }

    public String getETID() {
        return ETID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setDeptID(String deptID) {
        this.deptID = deptID;
    }

    public String getDeptID() {
        return deptID;
    }

    @Override
    public String toString() {
        return "EnTblMastEmailTracker{" +
                "ETID=" + ETID + '\'' +
                "name=" + name + '\'' +
                "email=" + email + '\'' +
                "staffID=" + staffID + '\'' +
                "deptID=" + deptID + '\'' +
                '}';
    }
}
