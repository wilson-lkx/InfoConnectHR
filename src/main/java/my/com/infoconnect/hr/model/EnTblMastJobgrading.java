package my.com.infoconnect.hr.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "EN_TBL_MAST_JOBGRADING")
public class EnTblMastJobgrading implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "GradeInd", nullable = false)
    private String gradeInd;

    @Column(name = "GradeMgmt")
    private String gradeMgmt;

    @Column(name = "Title")
    private String title;

    @Column(name = "Category")
    private String category;

    @Column(name = "CategoryID")
    private String categoryID;

    public void setGradeInd(String gradeInd) {
        this.gradeInd = gradeInd;
    }

    public String getGradeInd() {
        return gradeInd;
    }

    public void setGradeMgmt(String gradeMgmt) {
        this.gradeMgmt = gradeMgmt;
    }

    public String getGradeMgmt() {
        return gradeMgmt;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryID() {
        return categoryID;
    }

    @Override
    public String toString() {
        return "EnTblMastJobgrading{" +
                "gradeInd=" + gradeInd + '\'' +
                "gradeMgmt=" + gradeMgmt + '\'' +
                "title=" + title + '\'' +
                "category=" + category + '\'' +
                "categoryID=" + categoryID + '\'' +
                '}';
    }
}
