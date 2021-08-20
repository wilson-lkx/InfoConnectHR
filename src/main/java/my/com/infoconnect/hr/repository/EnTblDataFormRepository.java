package my.com.infoconnect.hr.repository;

import my.com.infoconnect.hr.dao.EnTblDataFormDao;
import my.com.infoconnect.hr.model.EnTblDataForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnTblDataFormRepository extends JpaRepository<EnTblDataForm, Void>, EnTblDataFormDao {

}