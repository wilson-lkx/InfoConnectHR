package my.com.infoconnect.hr.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Embeddable
@Table(name = "EN_TBL_FINAL_FORM")
public class EnTblFinalForm implements Serializable {

    private static final long serialVersionUID = 1L;

    @Basic
    @Column(name = "LF__FormID")
    private String lfformid;

    @Basic
    @Column(name = "LF__User")
    private String lfuser;

    @Basic
    @Column(name = "Numberofdays")
    private String numberofdays;

    @Basic
    @Column(name = "Table1")
    private String table1;

    @Basic
    @Column(name = "credentialsAppl")
    private String credentialsAppl;

    @Basic
    @Column(name = "credentialsManager")
    private String credentialsManager;

    @Basic
    @Column(name = "lstApplApprover")
    private String lstApplApprover;

    @Basic
    @Column(name = "lstApplCompany")
    private String lstApplCompany;

    @Basic
    @Column(name = "lstApplDepartment")
    private String lstApplDepartment;

    @Basic
    @Column(name = "lstApplGender")
    private String lstApplGender;

    @Basic
    @Column(name = "lstApplLeaveStartSession")
    private String lstApplLeaveStartSession;

    @Basic
    @Column(name = "lstApplLeaveType")
    private String lstApplLeaveType;

    @Basic
    @Column(name = "txtAnnualCF")
    private String txtAnnualCF;

    @Basic
    @Column(name = "txtAnnualEntitled")
    private BigDecimal txtAnnualEntitled;

    @Basic
    @Column(name = "txtAnnualTotal")
    private String txtAnnualTotal;

    @Basic
    @Column(name = "txtAnnualUtilized")
    private String txtAnnualUtilized;

    @Basic
    @Column(name = "txtApplAttachments")
    private BigDecimal txtApplAttachments;

    @Basic
    @Column(name = "txtApplBackupPerson")
    private String txtApplBackupPerson;

    @Basic
    @Column(name = "txtApplDesignation")
    private String txtApplDesignation;

    @Basic
    @Column(name = "txtApplEditHide")
    private String txtApplEditHide;

    @Basic
    @Column(name = "txtApplEmail")
    private String txtApplEmail;

    @Basic
    @Column(name = "txtApplFormNo")
    private BigDecimal txtApplFormNo;

    @Basic
    @Column(name = "txtApplLeaveEndDate")
    private Date txtApplLeaveEndDate;

    @Basic
    @Column(name = "txtApplLeaveStartDate")
    private Date txtApplLeaveStartDate;

    @Basic
    @Column(name = "txtApplName")
    private String txtApplName;

    @Basic
    @Column(name = "txtApplReason")
    private String txtApplReason;

    @Basic
    @Column(name = "txtApplStaffID")
    private String txtApplStaffID;

    @Basic
    @Column(name = "txtApplSubmitDate")
    private Date txtApplSubmitDate;

    @Basic
    @Column(name = "txtApplTotalDays")
    private BigDecimal txtApplTotalDays;

    @Basic
    @Column(name = "txtCompassionateCF")
    private String txtCompassionateCF;

    @Basic
    @Column(name = "txtCompassionateEntitled")
    private BigDecimal txtCompassionateEntitled;

    @Basic
    @Column(name = "txtCompassionateTotal")
    private String txtCompassionateTotal;

    @Basic
    @Column(name = "txtCompassionateUtilized")
    private String txtCompassionateUtilized;

    @Basic
    @Column(name = "txtHospitalizationCF")
    private String txtHospitalizationCF;

    @Basic
    @Column(name = "txtHospitalizationEntitled")
    private BigDecimal txtHospitalizationEntitled;

    @Basic
    @Column(name = "txtHospitalizationTotal")
    private String txtHospitalizationTotal;

    @Basic
    @Column(name = "txtHospitalizationUtilized")
    private String txtHospitalizationUtilized;

    @Basic
    @Column(name = "txtManagerEmail")
    private String txtManagerEmail;

    @Basic
    @Column(name = "txtManagerName")
    private String txtManagerName;

    @Basic
    @Column(name = "txtManagerRemarks")
    private String txtManagerRemarks;

    @Basic
    @Column(name = "txtManagerStaffID")
    private String txtManagerStaffID;

    @Basic
    @Column(name = "txtMarriageCF")
    private String txtMarriageCF;

    @Basic
    @Column(name = "txtMarriageEntitled")
    private BigDecimal txtMarriageEntitled;

    @Basic
    @Column(name = "txtMarriageTotal")
    private String txtMarriageTotal;

    @Basic
    @Column(name = "txtMarriageUtilized")
    private String txtMarriageUtilized;

    @Basic
    @Column(name = "txtMaternityCF")
    private String txtMaternityCF;

    @Basic
    @Column(name = "txtMaternityEntitled")
    private BigDecimal txtMaternityEntitled;

    @Basic
    @Column(name = "txtMaternityTotal")
    private String txtMaternityTotal;

    @Basic
    @Column(name = "txtMaternityUtilized")
    private String txtMaternityUtilized;

    @Basic
    @Column(name = "txtMedicalCF")
    private String txtMedicalCF;

    @Basic
    @Column(name = "txtMedicalEntitled")
    private BigDecimal txtMedicalEntitled;

    @Basic
    @Column(name = "txtMedicalTotal")
    private String txtMedicalTotal;

    @Basic
    @Column(name = "txtMedicalUtilized")
    private String txtMedicalUtilized;

    @Basic
    @Column(name = "txtPaternityCF")
    private String txtPaternityCF;

    @Basic
    @Column(name = "txtPaternityEntitled")
    private BigDecimal txtPaternityEntitled;

    @Basic
    @Column(name = "txtPaternityTotal")
    private String txtPaternityTotal;

    @Basic
    @Column(name = "txtPaternityUtilized")
    private String txtPaternityUtilized;

    @Basic
    @Column(name = "txtReplacementCF")
    private String txtReplacementCF;

    @Basic
    @Column(name = "txtReplacementEntitled")
    private BigDecimal txtReplacementEntitled;

    @Basic
    @Column(name = "txtReplacementTotal")
    private String txtReplacementTotal;

    @Basic
    @Column(name = "txtReplacementUtilized")
    private String txtReplacementUtilized;

    @Basic
    @Column(name = "txtSelectedApproverEmailHide")
    private String txtSelectedApproverEmailHide;

    public void setLfformid(String lfformid) {
        this.lfformid = lfformid;
    }

    public String getLfformid() {
        return lfformid;
    }

    public void setLfuser(String lfuser) {
        this.lfuser = lfuser;
    }

    public String getLfuser() {
        return lfuser;
    }

    public void setNumberofdays(String numberofdays) {
        this.numberofdays = numberofdays;
    }

    public String getNumberofdays() {
        return numberofdays;
    }

    public void setTable1(String table1) {
        this.table1 = table1;
    }

    public String getTable1() {
        return table1;
    }

    public void setCredentialsAppl(String credentialsAppl) {
        this.credentialsAppl = credentialsAppl;
    }

    public String getCredentialsAppl() {
        return credentialsAppl;
    }

    public void setCredentialsManager(String credentialsManager) {
        this.credentialsManager = credentialsManager;
    }

    public String getCredentialsManager() {
        return credentialsManager;
    }

    public void setLstApplApprover(String lstApplApprover) {
        this.lstApplApprover = lstApplApprover;
    }

    public String getLstApplApprover() {
        return lstApplApprover;
    }

    public void setLstApplCompany(String lstApplCompany) {
        this.lstApplCompany = lstApplCompany;
    }

    public String getLstApplCompany() {
        return lstApplCompany;
    }

    public void setLstApplDepartment(String lstApplDepartment) {
        this.lstApplDepartment = lstApplDepartment;
    }

    public String getLstApplDepartment() {
        return lstApplDepartment;
    }

    public void setLstApplGender(String lstApplGender) {
        this.lstApplGender = lstApplGender;
    }

    public String getLstApplGender() {
        return lstApplGender;
    }

    public void setLstApplLeaveStartSession(String lstApplLeaveStartSession) {
        this.lstApplLeaveStartSession = lstApplLeaveStartSession;
    }

    public String getLstApplLeaveStartSession() {
        return lstApplLeaveStartSession;
    }

    public void setLstApplLeaveType(String lstApplLeaveType) {
        this.lstApplLeaveType = lstApplLeaveType;
    }

    public String getLstApplLeaveType() {
        return lstApplLeaveType;
    }

    public void setTxtAnnualCF(String txtAnnualCF) {
        this.txtAnnualCF = txtAnnualCF;
    }

    public String getTxtAnnualCF() {
        return txtAnnualCF;
    }

    public void setTxtAnnualEntitled(BigDecimal txtAnnualEntitled) {
        this.txtAnnualEntitled = txtAnnualEntitled;
    }

    public BigDecimal getTxtAnnualEntitled() {
        return txtAnnualEntitled;
    }

    public void setTxtAnnualTotal(String txtAnnualTotal) {
        this.txtAnnualTotal = txtAnnualTotal;
    }

    public String getTxtAnnualTotal() {
        return txtAnnualTotal;
    }

    public void setTxtAnnualUtilized(String txtAnnualUtilized) {
        this.txtAnnualUtilized = txtAnnualUtilized;
    }

    public String getTxtAnnualUtilized() {
        return txtAnnualUtilized;
    }

    public void setTxtApplAttachments(BigDecimal txtApplAttachments) {
        this.txtApplAttachments = txtApplAttachments;
    }

    public BigDecimal getTxtApplAttachments() {
        return txtApplAttachments;
    }

    public void setTxtApplBackupPerson(String txtApplBackupPerson) {
        this.txtApplBackupPerson = txtApplBackupPerson;
    }

    public String getTxtApplBackupPerson() {
        return txtApplBackupPerson;
    }

    public void setTxtApplDesignation(String txtApplDesignation) {
        this.txtApplDesignation = txtApplDesignation;
    }

    public String getTxtApplDesignation() {
        return txtApplDesignation;
    }

    public void setTxtApplEditHide(String txtApplEditHide) {
        this.txtApplEditHide = txtApplEditHide;
    }

    public String getTxtApplEditHide() {
        return txtApplEditHide;
    }

    public void setTxtApplEmail(String txtApplEmail) {
        this.txtApplEmail = txtApplEmail;
    }

    public String getTxtApplEmail() {
        return txtApplEmail;
    }

    public void setTxtApplFormNo(BigDecimal txtApplFormNo) {
        this.txtApplFormNo = txtApplFormNo;
    }

    public BigDecimal getTxtApplFormNo() {
        return txtApplFormNo;
    }

    public void setTxtApplLeaveEndDate(Date txtApplLeaveEndDate) {
        this.txtApplLeaveEndDate = txtApplLeaveEndDate;
    }

    public Date getTxtApplLeaveEndDate() {
        return txtApplLeaveEndDate;
    }

    public void setTxtApplLeaveStartDate(Date txtApplLeaveStartDate) {
        this.txtApplLeaveStartDate = txtApplLeaveStartDate;
    }

    public Date getTxtApplLeaveStartDate() {
        return txtApplLeaveStartDate;
    }

    public void setTxtApplName(String txtApplName) {
        this.txtApplName = txtApplName;
    }

    public String getTxtApplName() {
        return txtApplName;
    }

    public void setTxtApplReason(String txtApplReason) {
        this.txtApplReason = txtApplReason;
    }

    public String getTxtApplReason() {
        return txtApplReason;
    }

    public void setTxtApplStaffID(String txtApplStaffID) {
        this.txtApplStaffID = txtApplStaffID;
    }

    public String getTxtApplStaffID() {
        return txtApplStaffID;
    }

    public void setTxtApplSubmitDate(Date txtApplSubmitDate) {
        this.txtApplSubmitDate = txtApplSubmitDate;
    }

    public Date getTxtApplSubmitDate() {
        return txtApplSubmitDate;
    }

    public void setTxtApplTotalDays(BigDecimal txtApplTotalDays) {
        this.txtApplTotalDays = txtApplTotalDays;
    }

    public BigDecimal getTxtApplTotalDays() {
        return txtApplTotalDays;
    }

    public void setTxtCompassionateCF(String txtCompassionateCF) {
        this.txtCompassionateCF = txtCompassionateCF;
    }

    public String getTxtCompassionateCF() {
        return txtCompassionateCF;
    }

    public void setTxtCompassionateEntitled(BigDecimal txtCompassionateEntitled) {
        this.txtCompassionateEntitled = txtCompassionateEntitled;
    }

    public BigDecimal getTxtCompassionateEntitled() {
        return txtCompassionateEntitled;
    }

    public void setTxtCompassionateTotal(String txtCompassionateTotal) {
        this.txtCompassionateTotal = txtCompassionateTotal;
    }

    public String getTxtCompassionateTotal() {
        return txtCompassionateTotal;
    }

    public void setTxtCompassionateUtilized(String txtCompassionateUtilized) {
        this.txtCompassionateUtilized = txtCompassionateUtilized;
    }

    public String getTxtCompassionateUtilized() {
        return txtCompassionateUtilized;
    }

    public void setTxtHospitalizationCF(String txtHospitalizationCF) {
        this.txtHospitalizationCF = txtHospitalizationCF;
    }

    public String getTxtHospitalizationCF() {
        return txtHospitalizationCF;
    }

    public void setTxtHospitalizationEntitled(BigDecimal txtHospitalizationEntitled) {
        this.txtHospitalizationEntitled = txtHospitalizationEntitled;
    }

    public BigDecimal getTxtHospitalizationEntitled() {
        return txtHospitalizationEntitled;
    }

    public void setTxtHospitalizationTotal(String txtHospitalizationTotal) {
        this.txtHospitalizationTotal = txtHospitalizationTotal;
    }

    public String getTxtHospitalizationTotal() {
        return txtHospitalizationTotal;
    }

    public void setTxtHospitalizationUtilized(String txtHospitalizationUtilized) {
        this.txtHospitalizationUtilized = txtHospitalizationUtilized;
    }

    public String getTxtHospitalizationUtilized() {
        return txtHospitalizationUtilized;
    }

    public void setTxtManagerEmail(String txtManagerEmail) {
        this.txtManagerEmail = txtManagerEmail;
    }

    public String getTxtManagerEmail() {
        return txtManagerEmail;
    }

    public void setTxtManagerName(String txtManagerName) {
        this.txtManagerName = txtManagerName;
    }

    public String getTxtManagerName() {
        return txtManagerName;
    }

    public void setTxtManagerRemarks(String txtManagerRemarks) {
        this.txtManagerRemarks = txtManagerRemarks;
    }

    public String getTxtManagerRemarks() {
        return txtManagerRemarks;
    }

    public void setTxtManagerStaffID(String txtManagerStaffID) {
        this.txtManagerStaffID = txtManagerStaffID;
    }

    public String getTxtManagerStaffID() {
        return txtManagerStaffID;
    }

    public void setTxtMarriageCF(String txtMarriageCF) {
        this.txtMarriageCF = txtMarriageCF;
    }

    public String getTxtMarriageCF() {
        return txtMarriageCF;
    }

    public void setTxtMarriageEntitled(BigDecimal txtMarriageEntitled) {
        this.txtMarriageEntitled = txtMarriageEntitled;
    }

    public BigDecimal getTxtMarriageEntitled() {
        return txtMarriageEntitled;
    }

    public void setTxtMarriageTotal(String txtMarriageTotal) {
        this.txtMarriageTotal = txtMarriageTotal;
    }

    public String getTxtMarriageTotal() {
        return txtMarriageTotal;
    }

    public void setTxtMarriageUtilized(String txtMarriageUtilized) {
        this.txtMarriageUtilized = txtMarriageUtilized;
    }

    public String getTxtMarriageUtilized() {
        return txtMarriageUtilized;
    }

    public void setTxtMaternityCF(String txtMaternityCF) {
        this.txtMaternityCF = txtMaternityCF;
    }

    public String getTxtMaternityCF() {
        return txtMaternityCF;
    }

    public void setTxtMaternityEntitled(BigDecimal txtMaternityEntitled) {
        this.txtMaternityEntitled = txtMaternityEntitled;
    }

    public BigDecimal getTxtMaternityEntitled() {
        return txtMaternityEntitled;
    }

    public void setTxtMaternityTotal(String txtMaternityTotal) {
        this.txtMaternityTotal = txtMaternityTotal;
    }

    public String getTxtMaternityTotal() {
        return txtMaternityTotal;
    }

    public void setTxtMaternityUtilized(String txtMaternityUtilized) {
        this.txtMaternityUtilized = txtMaternityUtilized;
    }

    public String getTxtMaternityUtilized() {
        return txtMaternityUtilized;
    }

    public void setTxtMedicalCF(String txtMedicalCF) {
        this.txtMedicalCF = txtMedicalCF;
    }

    public String getTxtMedicalCF() {
        return txtMedicalCF;
    }

    public void setTxtMedicalEntitled(BigDecimal txtMedicalEntitled) {
        this.txtMedicalEntitled = txtMedicalEntitled;
    }

    public BigDecimal getTxtMedicalEntitled() {
        return txtMedicalEntitled;
    }

    public void setTxtMedicalTotal(String txtMedicalTotal) {
        this.txtMedicalTotal = txtMedicalTotal;
    }

    public String getTxtMedicalTotal() {
        return txtMedicalTotal;
    }

    public void setTxtMedicalUtilized(String txtMedicalUtilized) {
        this.txtMedicalUtilized = txtMedicalUtilized;
    }

    public String getTxtMedicalUtilized() {
        return txtMedicalUtilized;
    }

    public void setTxtPaternityCF(String txtPaternityCF) {
        this.txtPaternityCF = txtPaternityCF;
    }

    public String getTxtPaternityCF() {
        return txtPaternityCF;
    }

    public void setTxtPaternityEntitled(BigDecimal txtPaternityEntitled) {
        this.txtPaternityEntitled = txtPaternityEntitled;
    }

    public BigDecimal getTxtPaternityEntitled() {
        return txtPaternityEntitled;
    }

    public void setTxtPaternityTotal(String txtPaternityTotal) {
        this.txtPaternityTotal = txtPaternityTotal;
    }

    public String getTxtPaternityTotal() {
        return txtPaternityTotal;
    }

    public void setTxtPaternityUtilized(String txtPaternityUtilized) {
        this.txtPaternityUtilized = txtPaternityUtilized;
    }

    public String getTxtPaternityUtilized() {
        return txtPaternityUtilized;
    }

    public void setTxtReplacementCF(String txtReplacementCF) {
        this.txtReplacementCF = txtReplacementCF;
    }

    public String getTxtReplacementCF() {
        return txtReplacementCF;
    }

    public void setTxtReplacementEntitled(BigDecimal txtReplacementEntitled) {
        this.txtReplacementEntitled = txtReplacementEntitled;
    }

    public BigDecimal getTxtReplacementEntitled() {
        return txtReplacementEntitled;
    }

    public void setTxtReplacementTotal(String txtReplacementTotal) {
        this.txtReplacementTotal = txtReplacementTotal;
    }

    public String getTxtReplacementTotal() {
        return txtReplacementTotal;
    }

    public void setTxtReplacementUtilized(String txtReplacementUtilized) {
        this.txtReplacementUtilized = txtReplacementUtilized;
    }

    public String getTxtReplacementUtilized() {
        return txtReplacementUtilized;
    }

    public void setTxtSelectedApproverEmailHide(String txtSelectedApproverEmailHide) {
        this.txtSelectedApproverEmailHide = txtSelectedApproverEmailHide;
    }

    public String getTxtSelectedApproverEmailHide() {
        return txtSelectedApproverEmailHide;
    }

    @Override
    public String toString() {
        return "EnTblFinalForm{" +
                "lfformid=" + lfformid + '\'' +
                "lfuser=" + lfuser + '\'' +
                "numberofdays=" + numberofdays + '\'' +
                "table1=" + table1 + '\'' +
                "credentialsAppl=" + credentialsAppl + '\'' +
                "credentialsManager=" + credentialsManager + '\'' +
                "lstApplApprover=" + lstApplApprover + '\'' +
                "lstApplCompany=" + lstApplCompany + '\'' +
                "lstApplDepartment=" + lstApplDepartment + '\'' +
                "lstApplGender=" + lstApplGender + '\'' +
                "lstApplLeaveStartSession=" + lstApplLeaveStartSession + '\'' +
                "lstApplLeaveType=" + lstApplLeaveType + '\'' +
                "txtAnnualCF=" + txtAnnualCF + '\'' +
                "txtAnnualEntitled=" + txtAnnualEntitled + '\'' +
                "txtAnnualTotal=" + txtAnnualTotal + '\'' +
                "txtAnnualUtilized=" + txtAnnualUtilized + '\'' +
                "txtApplAttachments=" + txtApplAttachments + '\'' +
                "txtApplBackupPerson=" + txtApplBackupPerson + '\'' +
                "txtApplDesignation=" + txtApplDesignation + '\'' +
                "txtApplEditHide=" + txtApplEditHide + '\'' +
                "txtApplEmail=" + txtApplEmail + '\'' +
                "txtApplFormNo=" + txtApplFormNo + '\'' +
                "txtApplLeaveEndDate=" + txtApplLeaveEndDate + '\'' +
                "txtApplLeaveStartDate=" + txtApplLeaveStartDate + '\'' +
                "txtApplName=" + txtApplName + '\'' +
                "txtApplReason=" + txtApplReason + '\'' +
                "txtApplStaffID=" + txtApplStaffID + '\'' +
                "txtApplSubmitDate=" + txtApplSubmitDate + '\'' +
                "txtApplTotalDays=" + txtApplTotalDays + '\'' +
                "txtCompassionateCF=" + txtCompassionateCF + '\'' +
                "txtCompassionateEntitled=" + txtCompassionateEntitled + '\'' +
                "txtCompassionateTotal=" + txtCompassionateTotal + '\'' +
                "txtCompassionateUtilized=" + txtCompassionateUtilized + '\'' +
                "txtHospitalizationCF=" + txtHospitalizationCF + '\'' +
                "txtHospitalizationEntitled=" + txtHospitalizationEntitled + '\'' +
                "txtHospitalizationTotal=" + txtHospitalizationTotal + '\'' +
                "txtHospitalizationUtilized=" + txtHospitalizationUtilized + '\'' +
                "txtManagerEmail=" + txtManagerEmail + '\'' +
                "txtManagerName=" + txtManagerName + '\'' +
                "txtManagerRemarks=" + txtManagerRemarks + '\'' +
                "txtManagerStaffID=" + txtManagerStaffID + '\'' +
                "txtMarriageCF=" + txtMarriageCF + '\'' +
                "txtMarriageEntitled=" + txtMarriageEntitled + '\'' +
                "txtMarriageTotal=" + txtMarriageTotal + '\'' +
                "txtMarriageUtilized=" + txtMarriageUtilized + '\'' +
                "txtMaternityCF=" + txtMaternityCF + '\'' +
                "txtMaternityEntitled=" + txtMaternityEntitled + '\'' +
                "txtMaternityTotal=" + txtMaternityTotal + '\'' +
                "txtMaternityUtilized=" + txtMaternityUtilized + '\'' +
                "txtMedicalCF=" + txtMedicalCF + '\'' +
                "txtMedicalEntitled=" + txtMedicalEntitled + '\'' +
                "txtMedicalTotal=" + txtMedicalTotal + '\'' +
                "txtMedicalUtilized=" + txtMedicalUtilized + '\'' +
                "txtPaternityCF=" + txtPaternityCF + '\'' +
                "txtPaternityEntitled=" + txtPaternityEntitled + '\'' +
                "txtPaternityTotal=" + txtPaternityTotal + '\'' +
                "txtPaternityUtilized=" + txtPaternityUtilized + '\'' +
                "txtReplacementCF=" + txtReplacementCF + '\'' +
                "txtReplacementEntitled=" + txtReplacementEntitled + '\'' +
                "txtReplacementTotal=" + txtReplacementTotal + '\'' +
                "txtReplacementUtilized=" + txtReplacementUtilized + '\'' +
                "txtSelectedApproverEmailHide=" + txtSelectedApproverEmailHide + '\'' +
                '}';
    }
}
