package my.com.infoconnect.hr.dao;

import my.com.infoconnect.hr.model.EnTblDataForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
@Transactional
public class EnTblDataFormDaoImpl extends AbstractHibernateDaoImpl<EnTblDataForm> implements EnTblDataFormDao<EnTblDataForm> {

    @Autowired
    EntityManager entityManager;

    public EnTblDataFormDaoImpl() {
        super(EnTblDataForm.class);
    }
}
