package my.com.infoconnect.hr.service;

import my.com.infoconnect.hr.model.*;

import java.util.List;

public interface ReportLmsService {

    List<EnTblDataForm> findEnTblDataForm();

    List<EnTblMastCompany> findEnTblMastCompany();

    List<EnTblMastLeavetype> findEnTblMastLeavetype();

    List<EnTblMastCompanyDept> findEnTblMastDepartment(String companyId);

    List<EnTblMastStaffinfo> findEnTblMastStaffinfo(String companyID, String deptID);

    EnTblMastStaffinfo findEnTblMastStaffinfo(String id);

//    EnTblReportData findEnTblReportInfo(String staffId);

    List<EnTblReportData> findEnTblReportData(String staffId, String dateFrom, String dateTo, String leaveTypeId);
}
