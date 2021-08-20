package my.com.infoconnect.hr.controller;

import com.google.gson.Gson;
import my.com.infoconnect.hr.model.*;
import my.com.infoconnect.hr.repository.EnTblDataFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Controller
@RequestMapping("/report")
public class ReportController {

    private static final Gson gson = new Gson();

    @Autowired
    EnTblDataFormRepository enTblDataFormRepository;

    @RequestMapping
    public String getReportList(Model model) {
        List<EnTblMastCompany> companies = new ArrayList<>();
        companies.add(new EnTblMastCompany("C001", "InfoConnect"));
        companies.add(new EnTblMastCompany("C002", "Docuflo (MSC)"));
        companies.add(new EnTblMastCompany("C003", "Bpi Technologies"));
        companies.add(new EnTblMastCompany("C004", "FirstBase"));
        companies.sort(Comparator.comparing(EnTblMastCompany::getCompanyName));
        model.addAttribute("companies", companies);

        List<EnTblMastLeavetype> leaveTypes = new ArrayList<>();
        leaveTypes.add(new EnTblMastLeavetype("L001", "Annual Leave"));
        leaveTypes.add(new EnTblMastLeavetype("L002", "Medical Leave"));
        leaveTypes.add(new EnTblMastLeavetype("L003", "Paternity Leave"));
        leaveTypes.add(new EnTblMastLeavetype("L004", "Maternity Leave"));
        leaveTypes.add(new EnTblMastLeavetype("L005", "Compassionate Leave"));
        leaveTypes.add(new EnTblMastLeavetype("L006", "No Pay Leave"));
        leaveTypes.add(new EnTblMastLeavetype("L007", "Marriage Leave"));
        leaveTypes.add(new EnTblMastLeavetype("L008", "Replacement Leave"));
        leaveTypes.add(new EnTblMastLeavetype("L009", "Hospitalization Leave"));
        leaveTypes.add(new EnTblMastLeavetype("L010", "Emergency Leave"));
        leaveTypes.sort(Comparator.comparing(EnTblMastLeavetype::getLeaveTypeDesc));
        model.addAttribute("leaveTypes", leaveTypes);

        return "report";
    }

    @ResponseBody
    @RequestMapping(value = "/department", method = {RequestMethod.GET})
    public String getDepartmentByCompanyId(@RequestParam("companyID") String companyID) {
        List<EnTblMastDepartment> departments = new ArrayList<>();
        switch (companyID) {
            case "C001":
                departments.add(new EnTblMastDepartment("D001", "BPI"));
                departments.add(new EnTblMastDepartment("D002", "Development"));
                departments.add(new EnTblMastDepartment("D003", "Enterprise Consulting"));
                break;
            case "C002":
                departments.add(new EnTblMastDepartment("D004", "Finance"));
                departments.add(new EnTblMastDepartment("D005", "Government Sales"));
                break;
            case "C003":
                departments.add(new EnTblMastDepartment("D006", "Human Resource"));
                break;
            case "C004":
                departments.add(new EnTblMastDepartment("D007", "Implementation and Support"));
                departments.add(new EnTblMastDepartment("D008", "Management Information System"));
                break;
        }
        departments.sort(Comparator.comparing(EnTblMastDepartment::getDeptName));
        return gson.toJson(departments);
    }

    @ResponseBody
    @RequestMapping(value = "/staff", method = {RequestMethod.GET})
    public String getStaffByDepartmentId(@RequestParam("deptID") String deptID) {
        List<EnTblMastStaffinfo> staffList = new ArrayList<>();
        switch (deptID) {
            case "D001":
//                staffList.add(new EnTblMastStaffinfo("INFO264", "Beh Wei Siang"));
//                staffList.add(new EnTblMastStaffinfo("INFO001", "Lim Tong Pheng"));
//                staffList.add(new EnTblMastStaffinfo("INFO004", "Yap Kim Seng"));
//                staffList.add(new EnTblMastStaffinfo("INFO222", "Elaine Low Chui Sim"));
//                staffList.add(new EnTblMastStaffinfo("INFO228", "Shahirah Binti Abdul Latif"));
                staffList.add(new EnTblMastStaffinfo("INFO264", "Staff A-1"));
                staffList.add(new EnTblMastStaffinfo("INFO001", "Staff A-2"));
                staffList.add(new EnTblMastStaffinfo("INFO004", "Staff A-3"));
                staffList.add(new EnTblMastStaffinfo("INFO222", "Staff A-4"));
                staffList.add(new EnTblMastStaffinfo("INFO228", "Staff A-5"));
                break;
            case "D002":
//                staffList.add(new EnTblMastStaffinfo("BPI001", "Yap Weng Keong"));
//                staffList.add(new EnTblMastStaffinfo("BPI022", "Muhamad Amirul Bin Mat Hussain"));
//                staffList.add(new EnTblMastStaffinfo("BPI029", "Ho Tsuey Shan"));
//                staffList.add(new EnTblMastStaffinfo("BPI030", "Sim Jia Yik"));
//                staffList.add(new EnTblMastStaffinfo("BPI031", "Ng Kah Soon"));
                staffList.add(new EnTblMastStaffinfo("BPI001", "Staff B-1"));
                staffList.add(new EnTblMastStaffinfo("BPI022", "Staff B-2"));
                staffList.add(new EnTblMastStaffinfo("BPI029", "Staff B-3"));
                staffList.add(new EnTblMastStaffinfo("BPI030", "Staff B-4"));
                staffList.add(new EnTblMastStaffinfo("BPI031", "Staff B-5"));
                break;
            case "D003":
//                staffList.add(new EnTblMastStaffinfo("C0009", "Murali Krishna Jonnala"));
//                staffList.add(new EnTblMastStaffinfo("C0018", "Lakshmi Siva Chamarti "));
//                staffList.add(new EnTblMastStaffinfo("C0066", "Mongkolwat Sangsuriyarid"));
                staffList.add(new EnTblMastStaffinfo("C0009", "Staff C-1"));
                staffList.add(new EnTblMastStaffinfo("C0018", "Staff C-2"));
                staffList.add(new EnTblMastStaffinfo("C0066", "Staff C-3"));
                break;
            case "D004":
//                staffList.add(new EnTblMastStaffinfo("DOCU004", "Tang Ngan Theng"));
//                staffList.add(new EnTblMastStaffinfo("DOCU016", "Ng Keng Hon"));
//                staffList.add(new EnTblMastStaffinfo("DOCU079", "Khairol Azwan Bin Darmongin"));
                staffList.add(new EnTblMastStaffinfo("DOCU004", "Staff D-1"));
                staffList.add(new EnTblMastStaffinfo("DOCU016", "Staff D-2"));
                staffList.add(new EnTblMastStaffinfo("DOCU079", "Staff D-3"));
                break;
            case "D005":
//                staffList.add(new EnTblMastStaffinfo("DOCU120", "Siti Sunirah Binti Mamat"));
//                staffList.add(new EnTblMastStaffinfo("DOCU125", "Ng Chee Sing"));
//                staffList.add(new EnTblMastStaffinfo("DOCU128", "Aidamastura Binti Kapi @ Kahbi"));
                staffList.add(new EnTblMastStaffinfo("DOCU120", "Staff E-1"));
                staffList.add(new EnTblMastStaffinfo("DOCU125", "Staff E-2"));
                staffList.add(new EnTblMastStaffinfo("DOCU128", "Staff E-3"));
                break;
            case "D006":
//                staffList.add(new EnTblMastStaffinfo("INFO090", "Emi Norsuhada Binti Omar"));
//                staffList.add(new EnTblMastStaffinfo("INFO204", "Sharifah Noor Sarafina Binti Syed Anuar"));
//                staffList.add(new EnTblMastStaffinfo("INFO208", "Phoon Wai Seong"));
                staffList.add(new EnTblMastStaffinfo("INFO090", "Staff F-1"));
                staffList.add(new EnTblMastStaffinfo("INFO204", "Staff F-2"));
                staffList.add(new EnTblMastStaffinfo("INFO208", "Staff F-3"));
                break;
        }
        staffList.sort(Comparator.comparing(EnTblMastStaffinfo::getName));
        return gson.toJson(staffList);
    }

    @ResponseBody
    @RequestMapping(value = "/search", method = {RequestMethod.POST})
    public String searchReport(Model model,
                               @RequestParam(value = "companyID", required = false) String companyID,
                               @RequestParam(value = "deptID", required = false) String deptID, //empty string is All
                               @RequestParam(value = "docufloID",required = false) String docufloID, //empty string is All
                               @RequestParam(value = "dailyDate",required = false) String dailyDate,
                               @RequestParam(value = "month",required = false) String month,
                               @RequestParam(value = "year",required = false) String year,
                               @RequestParam(value = "leaveTypeID", required = false) String leaveTypeID //empty string is All
    ) {
//        List<EnTblDataForm> enTblDataForms = enTblDataFormRepository.findEnTblDataForms();
//        return gson.toJson(enTblDataForms);

        List<TableData> tableDataList = new ArrayList<>();
        if(companyID.equals("C001")) {

            if (deptID.equals("D001") || deptID.isEmpty()) {

                if (docufloID.equals("INFO264") || docufloID.isEmpty()) {
                    tableDataList.add(new TableData("InfoConnect", "BPI", "INFO264", "Staff A-1", "Emergency Leave", "Annual leave & No Pay leave", "2021-08-24", "2021-08-24", "1"));
                }

                if (docufloID.equals("INFO001") || docufloID.isEmpty()) {
                    tableDataList.add(new TableData("InfoConnect", "BPI", "INFO001", "Staff A-2", "Emergency Leave", "Emergency Leave", "2021-08-24", "2021-08-26", "3"));
                }

                if (docufloID.equals("INFO004") || docufloID.isEmpty()) {
                    tableDataList.add(new TableData("InfoConnect", "BPI", "INFO004", "Staff A-3", "Emergency Leave", "", "2021-08-23", "2021-08-24", "2"));
                }

                if (docufloID.equals("INFO222") || docufloID.isEmpty()) {
                    tableDataList.add(new TableData("InfoConnect", "BPI", "INFO222", "Staff A-4", "Medical Leave", "", "2021-08-24", "2021-08-27", "2"));
                }

                if (docufloID.equals("INFO228") || docufloID.isEmpty()) {
                    tableDataList.add(new TableData("InfoConnect", "BPI", "INFO228", "Staff A-5", "Annual Leave", "", "2021-08-30", "2021-08-30", "1"));
                }
            }
        }

//            if(deptID.equals("D002") || deptID.isEmpty()) {
//                tableDataList.add(new TableData("InfoConnect", "Development"));
//                tableDataList.add(new TableData("InfoConnect", "Development"));
//                tableDataList.add(new TableData("InfoConnect", "Development"));
//                tableDataList.add(new TableData("InfoConnect", "Development"));
//            }
//
//            if(deptID.equals("D003") || deptID.isEmpty()) {
//                tableDataList.add(new TableData("InfoConnect", "Enterprise Consulting"));
//                tableDataList.add(new TableData("InfoConnect", "Enterprise Consulting"));
//            }

        /*} else if(companyID.equals("C002")) {
            tableDataList.add(new TableData("Docuflo (MSC)", ));
            tableDataList.add(new TableData("Docuflo (MSC)", ));
            tableDataList.add(new TableData("Docuflo (MSC)", ));
            tableDataList.add(new TableData("Docuflo (MSC)", ));
            tableDataList.add(new TableData("Docuflo (MSC)", ));
            tableDataList.add(new TableData("Docuflo (MSC)", ));
            tableDataList.add(new TableData("Docuflo (MSC)", ));
            tableDataList.add(new TableData("Docuflo (MSC)", ));
            tableDataList.add(new TableData("Docuflo (MSC)", ));
            tableDataList.add(new TableData("Docuflo (MSC)", ));
            tableDataList.add(new TableData("Docuflo (MSC)", ));

        } else if(companyID.equals("C003")) {
            tableDataList.add(new TableData("Bpi Technologies", ));
            tableDataList.add(new TableData("Bpi Technologies", ));
            tableDataList.add(new TableData("Bpi Technologies", ));
            tableDataList.add(new TableData("Bpi Technologies", ));
            tableDataList.add(new TableData("Bpi Technologies", ));
            tableDataList.add(new TableData("Bpi Technologies", ));
            tableDataList.add(new TableData("Bpi Technologies", ));
            tableDataList.add(new TableData("Bpi Technologies", ));
            tableDataList.add(new TableData("Bpi Technologies", ));
            tableDataList.add(new TableData("Bpi Technologies", ));

        } else if(companyID.equals("C004")) {
            tableDataList.add(new TableData("FirstBase", ));
            tableDataList.add(new TableData("FirstBase", ));
            tableDataList.add(new TableData("FirstBase", ));
            tableDataList.add(new TableData("FirstBase", ));
            tableDataList.add(new TableData("FirstBase", ));
            tableDataList.add(new TableData("FirstBase", ));
            tableDataList.add(new TableData("FirstBase", ));
            tableDataList.add(new TableData("FirstBase", ));
            tableDataList.add(new TableData("FirstBase", ));
            tableDataList.add(new TableData("FirstBase", ));
            tableDataList.add(new TableData("FirstBase", ));
            tableDataList.add(new TableData("FirstBase", ));

        }*/
        return gson.toJson(tableDataList);
    }
}

class TableData {
    private String company;
    private String department;
    private String staffId;
    private String staffName;
    private String leaveType;
    private String IFEmergency;
    private String dateFrom;
    private String dateTo;
    private String leaveDay;


    public TableData(String company, String department, String staffId, String staffName, String leaveType, String IFEmergency, String dateFrom, String dateTo, String leaveDay) {
        this.company = company;
        this.department = department;
        this.staffId = staffId;
        this.staffName = staffName;
        this.leaveType = leaveType;
        this.IFEmergency = IFEmergency;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.leaveDay = leaveDay;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String getDateTo() {
        return dateTo;
    }

    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    public String getLeaveDay() {
        return leaveDay;
    }

    public void setLeaveDay(String leaveDay) {
        this.leaveDay = leaveDay;
    }

    public String getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

    public String getIFEmergency() {
        return IFEmergency;
    }

    public void setIFEmergency(String IFEmergency) {
        this.IFEmergency = IFEmergency;
    }
}
