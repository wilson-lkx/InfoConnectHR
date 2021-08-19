package my.com.infoconnect.hr.model;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
@Table(name = "EN_TBL_MAST_APPROVERS")
public class EnTblMastApprovers implements Serializable {

    private static final long serialVersionUID = 1L;

    @Basic
    @Column(name = "StaffID", nullable = false)
    private String staffID;

    @Basic
    @Column(name = "StaffName")
    private String staffName;

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffName() {
        return staffName;
    }

    @Override
    public String toString() {
        return "EnTblMastApprovers{" +
                "staffID=" + staffID + '\'' +
                "staffName=" + staffName + '\'' +
                '}';
    }
}
