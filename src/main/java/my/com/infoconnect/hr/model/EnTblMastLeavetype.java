package my.com.infoconnect.hr.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "EN_TBL_MAST_LEAVETYPE")
public class EnTblMastLeavetype implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "LeaveTypeID")
    private String leaveTypeID;

    @Column(name = "LeaveTypeDesc")
    private String leaveTypeDesc;

    public void setLeaveTypeID(String leaveTypeID) {
        this.leaveTypeID = leaveTypeID;
    }

    public String getLeaveTypeID() {
        return leaveTypeID;
    }

    public void setLeaveTypeDesc(String leaveTypeDesc) {
        this.leaveTypeDesc = leaveTypeDesc;
    }

    public String getLeaveTypeDesc() {
        return leaveTypeDesc;
    }

    @Override
    public String toString() {
        return "EnTblMastLeavetype{" +
                "leaveTypeID=" + leaveTypeID + '\'' +
                "leaveTypeDesc=" + leaveTypeDesc + '\'' +
                '}';
    }
}
