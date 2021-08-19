package my.com.infoconnect.hr.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "EN_TBL_MAST_DEPARTMENT")
public class EnTblMastDepartment implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "DeptID", nullable = false)
    private String deptID;

    @Column(name = "DeptName")
    private String deptName;

    public EnTblMastDepartment(String deptID, String deptName) {
        this.deptID = deptID;
        this.deptName = deptName;
    }

    public void setDeptID(String deptID) {
        this.deptID = deptID;
    }

    public String getDeptID() {
        return deptID;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    @Override
    public String toString() {
        return "EnTblMastDepartment{" +
                "deptID=" + deptID + '\'' +
                "deptName=" + deptName + '\'' +
                '}';
    }
}
