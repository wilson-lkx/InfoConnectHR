package my.com.infoconnect.hr.dao;

import my.com.infoconnect.hr.model.EnTblDataForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
@Transactional
public class EnTblDataFormDaoImpl implements EnTblDataFormDao {

    @Autowired
    EntityManager em;

    @Override
    public List<EnTblDataForm> findEnTblDataForms() {
        String statement = "SELECT WorkflowID, FormID, StaffID, LeaveType, IFEmergency, DateFrom, DateFromStartSession, " +
                "DateTo, DateToStartSession, Days, Reason, BackupPerson, ProjectManagerID, ApproverID, FormStatus, CreatedDate";
        List<EnTblDataForm> enTblDataForms = new ArrayList<>();
        List<Object[]>  list = em.createNativeQuery("SELECT * FROM EN_TBL_DATA_FORM").getResultList();
        for (Object[] object : list) {
            EnTblDataForm enTblDataForm = new EnTblDataForm();
            enTblDataForm.setWorkflowID((String)object[0]);
            enTblDataForm.setFormID((String)object[1]);
            enTblDataForm.setStaffID((String)object[2]);
            enTblDataForm.setLeaveType((String)object[3]);
            enTblDataForm.setIFEmergency((String)object[4]);
            enTblDataForm.setDateFrom((String)object[5]);
            enTblDataForm.setDateFromStartSession((String)object[6]);
            enTblDataForm.setDateTo((String)object[7]);
            enTblDataForm.setDateToStartSession((String)object[8]);
            enTblDataForm.setDays((String)object[9]);
            enTblDataForm.setReason((String)object[10]);
            enTblDataForm.setBackupPerson((String)object[11]);
            enTblDataForm.setProjectManagerID((String)object[12]);
            enTblDataForm.setApproverID((String)object[13]);
            enTblDataForm.setFormStatus((String)object[14]);
            enTblDataForm.setCreatedDate((Date) object[15]);

            enTblDataForms.add(enTblDataForm);
        }
        return enTblDataForms;
    }
}
