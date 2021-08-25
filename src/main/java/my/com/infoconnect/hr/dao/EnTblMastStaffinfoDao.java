package my.com.infoconnect.hr.dao;

import java.io.Serializable;
import java.util.List;

public interface EnTblMastStaffinfoDao<T extends Serializable> extends AbstractHibernateDao<T>{

    List<T> findEnTblMastStaffinfo(String companyID, String deptID);
}
