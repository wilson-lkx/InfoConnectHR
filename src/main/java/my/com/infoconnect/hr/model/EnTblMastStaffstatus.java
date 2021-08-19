package my.com.infoconnect.hr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "EN_TBL_MAST_STAFFSTATUS")
public class EnTblMastStaffstatus implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "StatusID", nullable = false)
    private Integer statusID;

    @Column(name = "StatusDesc")
    private String statusDesc;

    public void setStatusID(Integer statusID) {
        this.statusID = statusID;
    }

    public Integer getStatusID() {
        return statusID;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    public String getStatusDesc() {
        return statusDesc;
    }

    @Override
    public String toString() {
        return "EnTblMastStaffstatus{" +
                "statusID=" + statusID + '\'' +
                "statusDesc=" + statusDesc + '\'' +
                '}';
    }
}
