package my.com.infoconnect.hr.dao;

import my.com.infoconnect.hr.model.EnTblReportData;

import java.io.Serializable;
import java.util.List;

public interface EnTblDataFormDao<T extends Serializable> extends AbstractHibernateDao<T> {

//    EnTblReportData findEnTblReportInfo(String staffId);

    List<EnTblReportData> findEnTblReportData(String staffId, String dateFrom, String dateTo, String leaveTypeId);
}
