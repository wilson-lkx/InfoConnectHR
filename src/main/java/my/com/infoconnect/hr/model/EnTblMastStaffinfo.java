package my.com.infoconnect.hr.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "EN_TBL_MAST_STAFFINFO")
public class EnTblMastStaffinfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "DocufloID", nullable = false)
    private String docufloID;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Designation", nullable = false)
    private String designation;

    @Column(name = "Gender", nullable = false)
    private String gender;

    @Column(name = "DeptID")
    private String deptID;

    @Column(name = "CompanyName")
    private String companyName;

    @Column(name = "Email", nullable = false)
    private String email;

    @Column(name = "DateJoined", nullable = false)
    private Date dateJoined;

    @Column(name = "ActiveStatus")
    private String activeStatus;

    @Column(name = "DateCreated", nullable = false)
    private Date dateCreated;

    @Column(name = "DateModified", nullable = false)
    private Date dateModified;

    @Column(name = "ApprovalID")
    private String approvalID;

    public EnTblMastStaffinfo(String docufloID, String name) {
        this.docufloID = docufloID;
        this.name = name;
    }

    public void setDocufloID(String docufloID) {
        this.docufloID = docufloID;
    }

    public String getDocufloID() {
        return docufloID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setDeptID(String deptID) {
        this.deptID = deptID;
    }

    public String getDeptID() {
        return deptID;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setDateJoined(Date dateJoined) {
        this.dateJoined = dateJoined;
    }

    public Date getDateJoined() {
        return dateJoined;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setApprovalID(String approvalID) {
        this.approvalID = approvalID;
    }

    public String getApprovalID() {
        return approvalID;
    }

    @Override
    public String toString() {
        return "EnTblMastStaffinfo{" +
                "docufloID=" + docufloID + '\'' +
                "name=" + name + '\'' +
                "designation=" + designation + '\'' +
                "gender=" + gender + '\'' +
                "deptID=" + deptID + '\'' +
                "companyName=" + companyName + '\'' +
                "email=" + email + '\'' +
                "dateJoined=" + dateJoined + '\'' +
                "activeStatus=" + activeStatus + '\'' +
                "dateCreated=" + dateCreated + '\'' +
                "dateModified=" + dateModified + '\'' +
                "approvalID=" + approvalID + '\'' +
                '}';
    }
}
