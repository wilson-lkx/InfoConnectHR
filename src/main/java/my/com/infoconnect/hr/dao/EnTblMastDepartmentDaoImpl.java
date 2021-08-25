package my.com.infoconnect.hr.dao;

import my.com.infoconnect.hr.model.EnTblMastDepartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
@Transactional
public class EnTblMastDepartmentDaoImpl extends AbstractHibernateDaoImpl<EnTblMastDepartment> implements EnTblMastDepartmentDao<EnTblMastDepartment>{

    @Autowired
    EntityManager entityManager;

    public EnTblMastDepartmentDaoImpl() {
        super(EnTblMastDepartment.class);
    }
}
