package my.com.infoconnect.hr.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "EN_TBL_DATA_AUDITLOG")
public class EnTblDataAuditlog implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "RECID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long RECID;

    @Column(name = "WORKFLOWID", nullable = false)
    private String WORKFLOWID;

    @Column(name = "APPLICANTID", nullable = false)
    private String APPLICANTID;

    @Column(name = "APPROVALID", nullable = false)
    private String APPROVALID;

    @Column(name = "REMARK", nullable = false)
    private String REMARK;

    @Column(name = "CREATEDATE", nullable = false)
    private Date CREATEDATE;

    public void setRECID(Long RECID) {
        this.RECID = RECID;
    }

    public Long getRECID() {
        return RECID;
    }

    public void setWORKFLOWID(String WORKFLOWID) {
        this.WORKFLOWID = WORKFLOWID;
    }

    public String getWORKFLOWID() {
        return WORKFLOWID;
    }

    public void setAPPLICANTID(String APPLICANTID) {
        this.APPLICANTID = APPLICANTID;
    }

    public String getAPPLICANTID() {
        return APPLICANTID;
    }

    public void setAPPROVALID(String APPROVALID) {
        this.APPROVALID = APPROVALID;
    }

    public String getAPPROVALID() {
        return APPROVALID;
    }

    public void setREMARK(String REMARK) {
        this.REMARK = REMARK;
    }

    public String getREMARK() {
        return REMARK;
    }

    public void setCREATEDATE(Date CREATEDATE) {
        this.CREATEDATE = CREATEDATE;
    }

    public Date getCREATEDATE() {
        return CREATEDATE;
    }

    @Override
    public String toString() {
        return "EnTblDataAuditlog{" +
                "RECID=" + RECID + '\'' +
                "WORKFLOWID=" + WORKFLOWID + '\'' +
                "APPLICANTID=" + APPLICANTID + '\'' +
                "APPROVALID=" + APPROVALID + '\'' +
                "REMARK=" + REMARK + '\'' +
                "CREATEDATE=" + CREATEDATE + '\'' +
                '}';
    }
}
