package my.com.infoconnect.hr.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "EN_TBL_MAST_STAFFLEAVEINFO")
public class EnTblMastStaffleaveinfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "StaffID", nullable = false)
    private String staffID;

    @Column(name = "AnnualEntitled", nullable = false)
    private Float annualEntitled;

    @Column(name = "AnnualUtilized", nullable = false)
    private Float annualUtilized;

    @Column(name = "AnnualCF", nullable = false)
    private Float annualCF;

    @Column(name = "AnnualTotal", nullable = false)
    private Float annualTotal;

    @Column(name = "MedicalEntitled")
    private Float medicalEntitled;

    @Column(name = "MedicalUtilized")
    private Float medicalUtilized;

    @Column(name = "MedicalTotal")
    private Float medicalTotal;

    @Column(name = "PaternityEntitled")
    private Float paternityEntitled;

    @Column(name = "PaternityUtilized")
    private Float paternityUtilized;

    @Column(name = "PaternityTotal")
    private Float paternityTotal;

    @Column(name = "MaternityEntitled")
    private Float maternityEntitled;

    @Column(name = "MaternityUtilized")
    private Float maternityUtilized;

    @Column(name = "MaternityTotal")
    private Float maternityTotal;

    @Column(name = "CompassionateEntitled")
    private Float compassionateEntitled;

    @Column(name = "CompassionateUtilized")
    private Float compassionateUtilized;

    @Column(name = "CompassionateTotal")
    private Float compassionateTotal;

    @Column(name = "NoPayEntitled")
    private Float noPayEntitled;

    @Column(name = "NoPayUtilized")
    private Float noPayUtilized;

    @Column(name = "NoPayTotal")
    private Float noPayTotal;

    @Column(name = "MarriageEntitled")
    private Float marriageEntitled;

    @Column(name = "MarriageUtilized")
    private Float marriageUtilized;

    @Column(name = "MarriageTotal")
    private Float marriageTotal;

    @Column(name = "ReplacementEntitled")
    private Float replacementEntitled;

    @Column(name = "ReplacementUtilized")
    private Float replacementUtilized;

    @Column(name = "ReplacementTotal")
    private Float replacementTotal;

    @Column(name = "HospitalizationEntitled")
    private Float hospitalizationEntitled;

    @Column(name = "HospitalizationUtilized")
    private Float hospitalizationUtilized;

    @Column(name = "HospitalizationTotal")
    private Float hospitalizationTotal;

    @Column(name = "DateCreated")
    private Date dateCreated;

    @Column(name = "DateModified")
    private Date dateModified;

    @Column(name = "EmergencyUtilized")
    private Float emergencyUtilized;

    @Column(name = "EmergencyEntitled")
    private Float emergencyEntitled;

    @Column(name = "EmergencyBalance")
    private Float emergencyBalance;

    @Column(name = "EmergencyCF")
    private Float emergencyCF;

    @Column(name = "MedicalCF")
    private Float medicalCF;

    @Column(name = "PaternityCF")
    private Float paternityCF;

    @Column(name = "MaternityCF")
    private Float maternityCF;

    @Column(name = "HospitalizationCF")
    private Float hospitalizationCF;

    @Column(name = "ReplacementCF")
    private Float replacementCF;

    @Column(name = "MarriageCF")
    private Float marriageCF;

    @Column(name = "NoPayCF")
    private Float noPayCF;

    @Column(name = "CompassionateCF")
    private Float compassionateCF;

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setAnnualEntitled(Float annualEntitled) {
        this.annualEntitled = annualEntitled;
    }

    public Float getAnnualEntitled() {
        return annualEntitled;
    }

    public void setAnnualUtilized(Float annualUtilized) {
        this.annualUtilized = annualUtilized;
    }

    public Float getAnnualUtilized() {
        return annualUtilized;
    }

    public void setAnnualCF(Float annualCF) {
        this.annualCF = annualCF;
    }

    public Float getAnnualCF() {
        return annualCF;
    }

    public void setAnnualTotal(Float annualTotal) {
        this.annualTotal = annualTotal;
    }

    public Float getAnnualTotal() {
        return annualTotal;
    }

    public void setMedicalEntitled(Float medicalEntitled) {
        this.medicalEntitled = medicalEntitled;
    }

    public Float getMedicalEntitled() {
        return medicalEntitled;
    }

    public void setMedicalUtilized(Float medicalUtilized) {
        this.medicalUtilized = medicalUtilized;
    }

    public Float getMedicalUtilized() {
        return medicalUtilized;
    }

    public void setMedicalTotal(Float medicalTotal) {
        this.medicalTotal = medicalTotal;
    }

    public Float getMedicalTotal() {
        return medicalTotal;
    }

    public void setPaternityEntitled(Float paternityEntitled) {
        this.paternityEntitled = paternityEntitled;
    }

    public Float getPaternityEntitled() {
        return paternityEntitled;
    }

    public void setPaternityUtilized(Float paternityUtilized) {
        this.paternityUtilized = paternityUtilized;
    }

    public Float getPaternityUtilized() {
        return paternityUtilized;
    }

    public void setPaternityTotal(Float paternityTotal) {
        this.paternityTotal = paternityTotal;
    }

    public Float getPaternityTotal() {
        return paternityTotal;
    }

    public void setMaternityEntitled(Float maternityEntitled) {
        this.maternityEntitled = maternityEntitled;
    }

    public Float getMaternityEntitled() {
        return maternityEntitled;
    }

    public void setMaternityUtilized(Float maternityUtilized) {
        this.maternityUtilized = maternityUtilized;
    }

    public Float getMaternityUtilized() {
        return maternityUtilized;
    }

    public void setMaternityTotal(Float maternityTotal) {
        this.maternityTotal = maternityTotal;
    }

    public Float getMaternityTotal() {
        return maternityTotal;
    }

    public void setCompassionateEntitled(Float compassionateEntitled) {
        this.compassionateEntitled = compassionateEntitled;
    }

    public Float getCompassionateEntitled() {
        return compassionateEntitled;
    }

    public void setCompassionateUtilized(Float compassionateUtilized) {
        this.compassionateUtilized = compassionateUtilized;
    }

    public Float getCompassionateUtilized() {
        return compassionateUtilized;
    }

    public void setCompassionateTotal(Float compassionateTotal) {
        this.compassionateTotal = compassionateTotal;
    }

    public Float getCompassionateTotal() {
        return compassionateTotal;
    }

    public void setNoPayEntitled(Float noPayEntitled) {
        this.noPayEntitled = noPayEntitled;
    }

    public Float getNoPayEntitled() {
        return noPayEntitled;
    }

    public void setNoPayUtilized(Float noPayUtilized) {
        this.noPayUtilized = noPayUtilized;
    }

    public Float getNoPayUtilized() {
        return noPayUtilized;
    }

    public void setNoPayTotal(Float noPayTotal) {
        this.noPayTotal = noPayTotal;
    }

    public Float getNoPayTotal() {
        return noPayTotal;
    }

    public void setMarriageEntitled(Float marriageEntitled) {
        this.marriageEntitled = marriageEntitled;
    }

    public Float getMarriageEntitled() {
        return marriageEntitled;
    }

    public void setMarriageUtilized(Float marriageUtilized) {
        this.marriageUtilized = marriageUtilized;
    }

    public Float getMarriageUtilized() {
        return marriageUtilized;
    }

    public void setMarriageTotal(Float marriageTotal) {
        this.marriageTotal = marriageTotal;
    }

    public Float getMarriageTotal() {
        return marriageTotal;
    }

    public void setReplacementEntitled(Float replacementEntitled) {
        this.replacementEntitled = replacementEntitled;
    }

    public Float getReplacementEntitled() {
        return replacementEntitled;
    }

    public void setReplacementUtilized(Float replacementUtilized) {
        this.replacementUtilized = replacementUtilized;
    }

    public Float getReplacementUtilized() {
        return replacementUtilized;
    }

    public void setReplacementTotal(Float replacementTotal) {
        this.replacementTotal = replacementTotal;
    }

    public Float getReplacementTotal() {
        return replacementTotal;
    }

    public void setHospitalizationEntitled(Float hospitalizationEntitled) {
        this.hospitalizationEntitled = hospitalizationEntitled;
    }

    public Float getHospitalizationEntitled() {
        return hospitalizationEntitled;
    }

    public void setHospitalizationUtilized(Float hospitalizationUtilized) {
        this.hospitalizationUtilized = hospitalizationUtilized;
    }

    public Float getHospitalizationUtilized() {
        return hospitalizationUtilized;
    }

    public void setHospitalizationTotal(Float hospitalizationTotal) {
        this.hospitalizationTotal = hospitalizationTotal;
    }

    public Float getHospitalizationTotal() {
        return hospitalizationTotal;
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

    public void setEmergencyUtilized(Float emergencyUtilized) {
        this.emergencyUtilized = emergencyUtilized;
    }

    public Float getEmergencyUtilized() {
        return emergencyUtilized;
    }

    public void setEmergencyEntitled(Float emergencyEntitled) {
        this.emergencyEntitled = emergencyEntitled;
    }

    public Float getEmergencyEntitled() {
        return emergencyEntitled;
    }

    public void setEmergencyBalance(Float emergencyBalance) {
        this.emergencyBalance = emergencyBalance;
    }

    public Float getEmergencyBalance() {
        return emergencyBalance;
    }

    public void setEmergencyCF(Float emergencyCF) {
        this.emergencyCF = emergencyCF;
    }

    public Float getEmergencyCF() {
        return emergencyCF;
    }

    public void setMedicalCF(Float medicalCF) {
        this.medicalCF = medicalCF;
    }

    public Float getMedicalCF() {
        return medicalCF;
    }

    public void setPaternityCF(Float paternityCF) {
        this.paternityCF = paternityCF;
    }

    public Float getPaternityCF() {
        return paternityCF;
    }

    public void setMaternityCF(Float maternityCF) {
        this.maternityCF = maternityCF;
    }

    public Float getMaternityCF() {
        return maternityCF;
    }

    public void setHospitalizationCF(Float hospitalizationCF) {
        this.hospitalizationCF = hospitalizationCF;
    }

    public Float getHospitalizationCF() {
        return hospitalizationCF;
    }

    public void setReplacementCF(Float replacementCF) {
        this.replacementCF = replacementCF;
    }

    public Float getReplacementCF() {
        return replacementCF;
    }

    public void setMarriageCF(Float marriageCF) {
        this.marriageCF = marriageCF;
    }

    public Float getMarriageCF() {
        return marriageCF;
    }

    public void setNoPayCF(Float noPayCF) {
        this.noPayCF = noPayCF;
    }

    public Float getNoPayCF() {
        return noPayCF;
    }

    public void setCompassionateCF(Float compassionateCF) {
        this.compassionateCF = compassionateCF;
    }

    public Float getCompassionateCF() {
        return compassionateCF;
    }

    @Override
    public String toString() {
        return "EnTblMastStaffleaveinfo{" +
                "staffID=" + staffID + '\'' +
                "annualEntitled=" + annualEntitled + '\'' +
                "annualUtilized=" + annualUtilized + '\'' +
                "annualCF=" + annualCF + '\'' +
                "annualTotal=" + annualTotal + '\'' +
                "medicalEntitled=" + medicalEntitled + '\'' +
                "medicalUtilized=" + medicalUtilized + '\'' +
                "medicalTotal=" + medicalTotal + '\'' +
                "paternityEntitled=" + paternityEntitled + '\'' +
                "paternityUtilized=" + paternityUtilized + '\'' +
                "paternityTotal=" + paternityTotal + '\'' +
                "maternityEntitled=" + maternityEntitled + '\'' +
                "maternityUtilized=" + maternityUtilized + '\'' +
                "maternityTotal=" + maternityTotal + '\'' +
                "compassionateEntitled=" + compassionateEntitled + '\'' +
                "compassionateUtilized=" + compassionateUtilized + '\'' +
                "compassionateTotal=" + compassionateTotal + '\'' +
                "noPayEntitled=" + noPayEntitled + '\'' +
                "noPayUtilized=" + noPayUtilized + '\'' +
                "noPayTotal=" + noPayTotal + '\'' +
                "marriageEntitled=" + marriageEntitled + '\'' +
                "marriageUtilized=" + marriageUtilized + '\'' +
                "marriageTotal=" + marriageTotal + '\'' +
                "replacementEntitled=" + replacementEntitled + '\'' +
                "replacementUtilized=" + replacementUtilized + '\'' +
                "replacementTotal=" + replacementTotal + '\'' +
                "hospitalizationEntitled=" + hospitalizationEntitled + '\'' +
                "hospitalizationUtilized=" + hospitalizationUtilized + '\'' +
                "hospitalizationTotal=" + hospitalizationTotal + '\'' +
                "dateCreated=" + dateCreated + '\'' +
                "dateModified=" + dateModified + '\'' +
                "emergencyUtilized=" + emergencyUtilized + '\'' +
                "emergencyEntitled=" + emergencyEntitled + '\'' +
                "emergencyBalance=" + emergencyBalance + '\'' +
                "emergencyCF=" + emergencyCF + '\'' +
                "medicalCF=" + medicalCF + '\'' +
                "paternityCF=" + paternityCF + '\'' +
                "maternityCF=" + maternityCF + '\'' +
                "hospitalizationCF=" + hospitalizationCF + '\'' +
                "replacementCF=" + replacementCF + '\'' +
                "marriageCF=" + marriageCF + '\'' +
                "noPayCF=" + noPayCF + '\'' +
                "compassionateCF=" + compassionateCF + '\'' +
                '}';
    }
}
