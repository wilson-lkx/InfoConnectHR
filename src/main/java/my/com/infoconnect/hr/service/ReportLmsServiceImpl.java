package my.com.infoconnect.hr.service;

import my.com.infoconnect.hr.dao.*;
import my.com.infoconnect.hr.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportLmsServiceImpl implements ReportLmsService {

    @Autowired
    EnTblDataFormDao<EnTblDataForm> enTblDataFormDao;

    @Autowired
    EnTblMastCompanyDao<EnTblMastCompany> enTblMastCompanyDao;

    @Autowired
    EnTblMastLeavetypeDao<EnTblMastLeavetype> enTblMastLeavetypeDao;

    @Autowired
    EnTblMastDepartmentDao<EnTblMastDepartment> enTblMastDepartmentDao;

    @Autowired
    EnTblMastCompanyDeptDao<EnTblMastCompanyDept> enTblMastCompanyDeptDao;

    @Autowired
    EnTblMastStaffinfoDao<EnTblMastStaffinfo> enTblMastStaffinfoDao;

    @Override
    public List<EnTblDataForm> findEnTblDataForm() {
        return enTblDataFormDao.findAll();
    }

    @Override
    public List<EnTblMastCompany> findEnTblMastCompany() {
        return enTblMastCompanyDao.findAll(EnTblMastCompany_.COMPANY_NAME);
    }

    @Override
    public List<EnTblMastLeavetype> findEnTblMastLeavetype() {
        return enTblMastLeavetypeDao.findAll(EnTblMastLeavetype_.LEAVE_TYPE_DESC);
    }

    @Override
    public List<EnTblMastCompanyDept> findEnTblMastDepartment(String companyId) {
        return enTblMastCompanyDeptDao.findEnTblMastDepartmentByCompanyId(companyId);
    }

    @Override
    public List<EnTblMastStaffinfo> findEnTblMastStaffinfo(String companyID, String deptID) {
        return enTblMastStaffinfoDao.findEnTblMastStaffinfo(companyID, deptID);
    }

    @Override
    public EnTblMastStaffinfo findEnTblMastStaffinfo(String id) {
        return enTblMastStaffinfoDao.findOne(EnTblMastStaffinfo_.DOCUFLO_ID, id);
    }

//    @Override
//    public EnTblReportData findEnTblReportInfo(String staffId) {
//        return enTblDataFormDao.findEnTblReportInfo(staffId);
//    }

    @Override
    public List<EnTblReportData> findEnTblReportData(String staffId, String dateFrom, String dateTo, String leaveTypeId) {
        return enTblDataFormDao.findEnTblReportData(staffId, dateFrom, dateTo, leaveTypeId);
    }
}
