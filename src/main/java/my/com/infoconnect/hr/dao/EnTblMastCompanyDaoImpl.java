package my.com.infoconnect.hr.dao;

import my.com.infoconnect.hr.model.EnTblMastCompany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
@Transactional
public class EnTblMastCompanyDaoImpl extends AbstractHibernateDaoImpl<EnTblMastCompany> implements EnTblMastCompanyDao<EnTblMastCompany> {

    @Autowired
    EntityManager entityManager;

    public EnTblMastCompanyDaoImpl() {
        super(EnTblMastCompany.class);
    }
}
