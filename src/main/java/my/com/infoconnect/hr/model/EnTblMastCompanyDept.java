package my.com.infoconnect.hr.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "EN_TBL_MAST_COMPANY_DEPT")
public class EnTblMastCompanyDept implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String ID;

    @Column(name = "CompanyID", nullable = false)
    private String companyID;

    @Column(name = "DeptID", nullable = false)
    private String deptID;

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setCompanyID(String companyID) {
        this.companyID = companyID;
    }

    public String getCompanyID() {
        return companyID;
    }

    public void setDeptID(String deptID) {
        this.deptID = deptID;
    }

    public String getDeptID() {
        return deptID;
    }

    @Override
    public String toString() {
        return "EnTblMastCompanyDept{" +
                "ID=" + ID + '\'' +
                "companyID=" + companyID + '\'' +
                "deptID=" + deptID + '\'' +
                '}';
    }
}
