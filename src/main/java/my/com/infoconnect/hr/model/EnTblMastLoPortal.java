package my.com.infoconnect.hr.model;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
@Table(name = "EN_TBL_MAST_LO_PORTAL")
public class EnTblMastLoPortal implements Serializable {

    private static final long serialVersionUID = 1L;

    @Basic
    @Column(name = "LOID")
    private String LOID;

    @Basic
    @Column(name = "Name")
    private String name;

    @Basic
    @Column(name = "Link")
    private String link;

    public void setLOID(String LOID) {
        this.LOID = LOID;
    }

    public String getLOID() {
        return LOID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    @Override
    public String toString() {
        return "EnTblMastLoPortal{" +
                "LOID=" + LOID + '\'' +
                "name=" + name + '\'' +
                "link=" + link + '\'' +
                '}';
    }
}
