package my.com.infoconnect.hr.dao;

import my.com.infoconnect.hr.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class EnTblMastCompanyDeptDaoImpl extends AbstractHibernateDaoImpl<EnTblMastCompanyDept> implements EnTblMastCompanyDeptDao<EnTblMastCompanyDept> {

    @Autowired
    EntityManager entityManager;

    public EnTblMastCompanyDeptDaoImpl() {
        super(EnTblMastCompanyDept.class);
    }

    @Override
    public List<EnTblMastCompanyDept> findEnTblMastDepartmentByCompanyId(String companyId) {
        String select = "SELECT dept.deptID AS ID, company.companyName AS CompanyID, dept.deptName AS DeptID";
        String from = " FROM EN_TBL_MAST_COMPANY_DEPT comp_dept INNER JOIN EN_TBL_MAST_COMPANY company ON comp_dept.companyID = company.companyID INNER JOIN EN_TBL_MAST_DEPARTMENT dept ON comp_dept.deptID = dept.deptID";
        String where = " WHERE comp_dept.companyID = '" + companyId + "'";
        String orderBy = " ORDER BY dept.deptName";

        List<Object[]> objects = entityManager.createNativeQuery(select + from + where + orderBy).getResultList();
        List<EnTblMastCompanyDept> enTblMastCompanyDepts = new ArrayList<>();
        for (Object[] object : objects) {
            EnTblMastCompanyDept enTblMastCompanyDept = new EnTblMastCompanyDept();
            enTblMastCompanyDept.setID((String) object[0]);
            enTblMastCompanyDept.setCompanyID((String) object[1]);
            enTblMastCompanyDept.setDeptID((String) object[2]);
            enTblMastCompanyDepts.add(enTblMastCompanyDept);
        }
        return enTblMastCompanyDepts;
    }
}
