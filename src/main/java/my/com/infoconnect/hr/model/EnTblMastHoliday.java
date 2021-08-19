package my.com.infoconnect.hr.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "EN_TBL_MAST_HOLIDAY")
public class EnTblMastHoliday implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "HolID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long holID;

    @Column(name = "FormID")
    private Integer formID;

    @Column(name = "StartLeave")
    private Date startLeave;

    @Column(name = "EndLeave")
    private Date endLeave;

    @Column(name = "Description")
    private String description;

    @Column(name = "CreateDate")
    private Date createDate;

    public void setHolID(Long holID) {
        this.holID = holID;
    }

    public Long getHolID() {
        return holID;
    }

    public void setFormID(Integer formID) {
        this.formID = formID;
    }

    public Integer getFormID() {
        return formID;
    }

    public void setStartLeave(Date startLeave) {
        this.startLeave = startLeave;
    }

    public Date getStartLeave() {
        return startLeave;
    }

    public void setEndLeave(Date endLeave) {
        this.endLeave = endLeave;
    }

    public Date getEndLeave() {
        return endLeave;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    @Override
    public String toString() {
        return "EnTblMastHoliday{" +
                "holID=" + holID + '\'' +
                "formID=" + formID + '\'' +
                "startLeave=" + startLeave + '\'' +
                "endLeave=" + endLeave + '\'' +
                "description=" + description + '\'' +
                "createDate=" + createDate + '\'' +
                '}';
    }
}
