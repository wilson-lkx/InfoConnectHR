package my.com.infoconnect.hr.dao;

import com.microsoft.sqlserver.jdbc.StringUtils;
import my.com.infoconnect.hr.model.EnTblMastStaffinfo;
import my.com.infoconnect.hr.model.EnTblMastStaffinfo_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
@Transactional
public class EnTblMastStaffinfoDaoImpl extends AbstractHibernateDaoImpl<EnTblMastStaffinfo> implements EnTblMastStaffinfoDao<EnTblMastStaffinfo>{

    @Autowired
    EntityManager entityManager;

    public EnTblMastStaffinfoDaoImpl() {
        super(EnTblMastStaffinfo.class);
    }

    @Override
    public List<EnTblMastStaffinfo> findEnTblMastStaffinfo(String companyID, String deptID) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<EnTblMastStaffinfo> criteriaQuery = builder.createQuery(EnTblMastStaffinfo.class);
        Root<EnTblMastStaffinfo> root = criteriaQuery.from(EnTblMastStaffinfo.class);

        criteriaQuery.select(root);
        criteriaQuery.where(builder.equal(root.get(EnTblMastStaffinfo_.COMPANY_ID), companyID));
        if (!StringUtils.isEmpty(deptID)) {
            criteriaQuery.where(builder.equal(root.get(EnTblMastStaffinfo_.DEPT_ID), deptID));
        }
        criteriaQuery.orderBy(builder.asc(root.get(EnTblMastStaffinfo_.NAME)));

        TypedQuery<EnTblMastStaffinfo> query = entityManager.createQuery(criteriaQuery);
        return query.getResultList();
    }
}
