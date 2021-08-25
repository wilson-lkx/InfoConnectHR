package my.com.infoconnect.hr.dao;

import java.io.Serializable;
import java.util.List;

public interface EnTblMastCompanyDeptDao<T extends Serializable> extends AbstractHibernateDao<T>{

    List<T> findEnTblMastDepartmentByCompanyId(String companyId);
}
