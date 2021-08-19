package my.com.infoconnect.hr.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Embeddable
@Table(name = "EN_TBL_DATA_FORM")
public class EnTblDataForm implements Serializable {

    private static final long serialVersionUID = 1L;

    @Basic
    @Column(name = "WorkflowID")
    private String workflowID;

    @Basic
    @Column(name = "FormID")
    private String formID;

    @Basic
    @Column(name = "StaffID")
    private String staffID;

    @Basic
    @Column(name = "LeaveType")
    private String leaveType;

    @Basic
    @Column(name = "IFEmergency")
    private String IFEmergency;

    @Basic
    @Column(name = "DateFrom")
    private String dateFrom;

    @Basic
    @Column(name = "DateFromStartSession")
    private String dateFromStartSession;

    @Basic
    @Column(name = "DateTo")
    private String dateTo;

    @Basic
    @Column(name = "DateToStartSession")
    private String dateToStartSession;

    @Basic
    @Column(name = "Days")
    private String days;

    @Basic
    @Column(name = "Reason")
    private String reason;

    @Basic
    @Column(name = "BackupPerson")
    private String backupPerson;

    @Basic
    @Column(name = "ProjectManagerID")
    private String projectManagerID;

    @Basic
    @Column(name = "ApproverID")
    private String approverID;

    @Basic
    @Column(name = "FormStatus")
    private String formStatus;

    @Basic
    @Column(name = "CreatedDate")
    private Date createdDate;

    public void setWorkflowID(String workflowID) {
        this.workflowID = workflowID;
    }

    public String getWorkflowID() {
        return workflowID;
    }

    public void setFormID(String formID) {
        this.formID = formID;
    }

    public String getFormID() {
        return formID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

    public String getLeaveType() {
        return leaveType;
    }

    public void setIFEmergency(String IFEmergency) {
        this.IFEmergency = IFEmergency;
    }

    public String getIFEmergency() {
        return IFEmergency;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFromStartSession(String dateFromStartSession) {
        this.dateFromStartSession = dateFromStartSession;
    }

    public String getDateFromStartSession() {
        return dateFromStartSession;
    }

    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    public String getDateTo() {
        return dateTo;
    }

    public void setDateToStartSession(String dateToStartSession) {
        this.dateToStartSession = dateToStartSession;
    }

    public String getDateToStartSession() {
        return dateToStartSession;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getDays() {
        return days;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }

    public void setBackupPerson(String backupPerson) {
        this.backupPerson = backupPerson;
    }

    public String getBackupPerson() {
        return backupPerson;
    }

    public void setProjectManagerID(String projectManagerID) {
        this.projectManagerID = projectManagerID;
    }

    public String getProjectManagerID() {
        return projectManagerID;
    }

    public void setApproverID(String approverID) {
        this.approverID = approverID;
    }

    public String getApproverID() {
        return approverID;
    }

    public void setFormStatus(String formStatus) {
        this.formStatus = formStatus;
    }

    public String getFormStatus() {
        return formStatus;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    @Override
    public String toString() {
        return "EnTblDataForm{" +
                "workflowID=" + workflowID + '\'' +
                "formID=" + formID + '\'' +
                "staffID=" + staffID + '\'' +
                "leaveType=" + leaveType + '\'' +
                "IFEmergency=" + IFEmergency + '\'' +
                "dateFrom=" + dateFrom + '\'' +
                "dateFromStartSession=" + dateFromStartSession + '\'' +
                "dateTo=" + dateTo + '\'' +
                "dateToStartSession=" + dateToStartSession + '\'' +
                "days=" + days + '\'' +
                "reason=" + reason + '\'' +
                "backupPerson=" + backupPerson + '\'' +
                "projectManagerID=" + projectManagerID + '\'' +
                "approverID=" + approverID + '\'' +
                "formStatus=" + formStatus + '\'' +
                "createdDate=" + createdDate + '\'' +
                '}';
    }
}
