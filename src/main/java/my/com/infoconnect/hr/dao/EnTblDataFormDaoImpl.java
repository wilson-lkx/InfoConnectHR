package my.com.infoconnect.hr.dao;

import com.microsoft.sqlserver.jdbc.StringUtils;
import my.com.infoconnect.hr.model.EnTblDataForm;
import my.com.infoconnect.hr.model.EnTblReportData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class EnTblDataFormDaoImpl extends AbstractHibernateDaoImpl<EnTblDataForm> implements EnTblDataFormDao<EnTblDataForm> {

    @Autowired
    EntityManager entityManager;

    public EnTblDataFormDaoImpl() {
        super(EnTblDataForm.class);
    }

//    @Override
//    public EnTblReportData findEnTblReportInfo(String staffId) {
//        String select = "SELECT comp.companyName, dept.deptName, staff.docufloID, staff.name";
//
//        String from = " FROM EN_TBL_MAST_STAFFINFO staff" +
//                " INNER JOIN EN_TBL_MAST_COMPANY comp ON staff.companyID = comp.companyID" +
//                " INNER JOIN EN_TBL_MAST_DEPARTMENT dept ON staff.deptID = dept.deptID";
//
//        String where = " WHERE staff.docufloID = '" + staffId + "'";
//        String orderBy = " ORDER BY dept.deptName, staff.name";
//
//        List<Object[]> objects = entityManager.createNativeQuery(select + from + where + orderBy).getResultList();
//        EnTblReportData reportData = new EnTblReportData();
//        for (Object[] object : objects) {
//            reportData.setCompanyName((String)object[0]);
//            reportData.setDeptName((String)object[1]);
//            reportData.setDocufloID((String)object[2]);
//            reportData.setName((String)object[3]);
//        }
//        return reportData;
//    }

//    @Override
//    public List<EnTblReportData> findEnTblReportData(String staffId, String dateFrom, String dateTo, String leaveTypeId) {
//        String select = "SELECT leave.leaveTypeDesc, data.IFEmergency, data.reason, data.dateFrom, data.dateTo, data.days";
//
//        String from = " FROM EN_TBL_DATA_FORM data" +
//                " INNER JOIN EN_TBL_MAST_STAFFINFO staff ON data.staffID = staff.docufloID" +
//                " INNER JOIN EN_TBL_MAST_COMPANY comp ON staff.companyID = comp.companyID" +
//                " INNER JOIN EN_TBL_MAST_DEPARTMENT dept ON staff.deptID = dept.deptID" +
//                " INNER JOIN EN_TBL_MAST_LEAVETYPE leave ON data.leaveType = leave.leaveTypeID";
//
//        String where = " WHERE data.staffID = '" + staffId + "' AND " +
//                (StringUtils.isEmpty(dateTo) ?
//                        "data.dateFrom = '" + dateFrom + "'" :
//                        "data.dateFrom >= '" + dateFrom + "' AND data.dateTo <= '" + dateTo + "'"
//                );
//        String orderBy = " ORDER BY dept.deptName, staff.name, data.dateFrom";
//
//        List<Object[]> objects = entityManager.createNativeQuery(select + from + where + orderBy).getResultList();
//        List<EnTblReportData> enTblReportDataList = new ArrayList<>();
//        for (Object[] object : objects) {
//            EnTblReportData reportData = new EnTblReportData();
//            reportData.setLeaveType((String)object[0]);
//            reportData.setIFEmergency((String)object[1]);
//            reportData.setReason((String)object[2]);
//            reportData.setDateFrom((String)object[3]);
//            reportData.setDateTo((String)object[4]);
//            reportData.setDays((String)object[5]);
//            enTblReportDataList.add(reportData);
//        }
//        return enTblReportDataList;
//    }

    @Override
    public List<EnTblReportData> findEnTblReportData(String staffId, String dateFrom, String dateTo, String leaveTypeId) {
        String select = "SELECT dept.deptName, staff.name, leave.leaveTypeDesc, data.reason, data.dateFrom, data.dateTo, data.days";

        String from = " FROM EN_TBL_DATA_FORM data" +
                " INNER JOIN EN_TBL_MAST_STAFFINFO staff ON data.staffID = staff.docufloID" +
                " INNER JOIN EN_TBL_MAST_COMPANY comp ON staff.companyID = comp.companyID" +
                " INNER JOIN EN_TBL_MAST_DEPARTMENT dept ON staff.deptID = dept.deptID" +
                " INNER JOIN EN_TBL_MAST_LEAVETYPE leave ON data.leaveType = leave.leaveTypeID";

        String where = " WHERE data.staffID = '" + staffId + "' AND " +
                (StringUtils.isEmpty(dateTo) ?
                        "data.dateFrom = '" + dateFrom + "'" :
                        "data.dateFrom >= '" + dateFrom + "' AND data.dateTo <= '" + dateTo + "'"
                );
        String orderBy = " ORDER BY dept.deptName";

        List<Object[]> objects = entityManager.createNativeQuery(select + from + where + orderBy).getResultList();
        List<EnTblReportData> enTblReportDataList = new ArrayList<>();
        for (Object[] object : objects) {
            EnTblReportData reportData = new EnTblReportData();
            reportData.setDeptName((String)object[0]);
            reportData.setName((String)object[1]);
            reportData.setLeaveType((String)object[2]);
            reportData.setReason((String)object[3]);
            reportData.setDateFrom((String)object[4]);
            reportData.setDateTo((String)object[5]);
            reportData.setDays((String)object[6]);
            enTblReportDataList.add(reportData);
        }
        return enTblReportDataList;
    }
}
