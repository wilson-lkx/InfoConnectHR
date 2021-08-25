package my.com.infoconnect.hr.dao;

import my.com.infoconnect.hr.model.EnTblMastLeavetype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
@Transactional
public class EnTblMastLeavetypeDaoImpl extends AbstractHibernateDaoImpl<EnTblMastLeavetype> implements EnTblMastLeavetypeDao<EnTblMastLeavetype>{

    @Autowired
    EntityManager entityManager;

    public EnTblMastLeavetypeDaoImpl() {
        super(EnTblMastLeavetype.class);
    }
}
