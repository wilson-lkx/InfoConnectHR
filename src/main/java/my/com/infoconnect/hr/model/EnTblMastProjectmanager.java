package my.com.infoconnect.hr.model;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
@Table(name = "EN_TBL_MAST_PROJECTMANAGER")
public class EnTblMastProjectmanager implements Serializable {

    private static final long serialVersionUID = 1L;

    @Basic
    @Column(name = "Staffid", nullable = false)
    private String staffid;

    @Basic
    @Column(name = "ProjectManagerName")
    private String projectManagerName;

    @Basic
    @Column(name = "Email")
    private String email;

    public void setStaffid(String staffid) {
        this.staffid = staffid;
    }

    public String getStaffid() {
        return staffid;
    }

    public void setProjectManagerName(String projectManagerName) {
        this.projectManagerName = projectManagerName;
    }

    public String getProjectManagerName() {
        return projectManagerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "EnTblMastProjectmanager{" +
                "staffid=" + staffid + '\'' +
                "projectManagerName=" + projectManagerName + '\'' +
                "email=" + email + '\'' +
                '}';
    }
}
