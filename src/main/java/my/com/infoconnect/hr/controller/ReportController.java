package my.com.infoconnect.hr.controller;

import com.google.gson.Gson;
import my.com.infoconnect.hr.model.EnTblMastCompany;
import my.com.infoconnect.hr.model.EnTblMastDepartment;
import my.com.infoconnect.hr.model.EnTblMastLeavetype;
import my.com.infoconnect.hr.model.EnTblMastStaffinfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/report")
public class ReportController {

    @RequestMapping
    public String getReportList(Model model) {
        List<EnTblMastCompany> companies = new ArrayList<>();
        companies.add(new EnTblMastCompany("C001", "InfoConnect"));
        companies.add(new EnTblMastCompany("C002", "Docuflo (MSC)"));
        companies.add(new EnTblMastCompany("C003", "Bpi Technologies"));
        companies.add(new EnTblMastCompany("C004", "FirstBase"));
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
        model.addAttribute("leaveTypes", leaveTypes);

        return "report";
    }

    @RequestMapping(value = "/search", method = {RequestMethod.GET})
    public String searchReport(Model model,
                                          @RequestParam("startDate") String startDate,
                                          @RequestParam("endDate") String endDate,
                                          @RequestParam("approver") String approver,
                                          @RequestParam("status") String status
    ) {
        return "statistics";
    }

    @ResponseBody
    @RequestMapping(value = "/department", method = {RequestMethod.GET})
    public String getDepartment(@RequestParam("companyId") String companyId) {
        Gson gson = new Gson();

        List<EnTblMastDepartment> departments = new ArrayList<>();
        departments.add(new EnTblMastDepartment("D000", "All"));
        switch (companyId) {
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
        return gson.toJson(departments);
    }
    @ResponseBody
    @RequestMapping(value = "/staff", method = {RequestMethod.GET})
    public String getStaffByDepartmentId(@RequestParam("departmentId") String departmentId) {
        Gson gson = new Gson();

        List<EnTblMastStaffinfo> staffList = new ArrayList<>();
        switch (departmentId) {
            case "D001":
                staffList.add(new EnTblMastStaffinfo("INFO264", "Beh Wei Siang"));
                staffList.add(new EnTblMastStaffinfo("INFO001", "Lim Tong Pheng"));
                staffList.add(new EnTblMastStaffinfo("INFO004", "Yap Kim Seng"));
                staffList.add(new EnTblMastStaffinfo("INFO222", "Elaine Low Chui Sim"));
                staffList.add(new EnTblMastStaffinfo("INFO228", "Shahirah Binti Abdul Latif"));

                break;

            case "D002":
                staffList.add(new EnTblMastStaffinfo("BPI001", "Yap Weng Keong"));
                staffList.add(new EnTblMastStaffinfo("BPI022", "Muhamad Amirul Bin Mat Hussain"));
                staffList.add(new EnTblMastStaffinfo("BPI029", "Ho Tsuey Shan"));
                staffList.add(new EnTblMastStaffinfo("BPI030", "Sim Jia Yik"));
                staffList.add(new EnTblMastStaffinfo("BPI031", "Ng Kah Soon"));
                break;

            case "D003":
                staffList.add(new EnTblMastStaffinfo("C0009", "Murali Krishna Jonnala"));
                staffList.add(new EnTblMastStaffinfo("C0018", "Lakshmi Siva Chamarti "));
                staffList.add(new EnTblMastStaffinfo("C0066", "Mongkolwat Sangsuriyarid"));
                break;

            case "D004":
                staffList.add(new EnTblMastStaffinfo("DOCU004", "Tang Ngan Theng"));
                staffList.add(new EnTblMastStaffinfo("DOCU016", "Ng Keng Hon"));
                staffList.add(new EnTblMastStaffinfo("DOCU079", "Khairol Azwan Bin Darmongin"));
                break;

            case "D005":
                staffList.add(new EnTblMastStaffinfo("DOCU120", "Siti Sunirah Binti Mamat"));
                staffList.add(new EnTblMastStaffinfo("DOCU125", "Ng Chee Sing"));
                staffList.add(new EnTblMastStaffinfo("DOCU128", "Aidamastura Binti Kapi @ Kahbi"));
                break;
            case "D006":
                staffList.add(new EnTblMastStaffinfo("INFO090", "Emi Norsuhada Binti Omar"));
                staffList.add(new EnTblMastStaffinfo("INFO204", "Sharifah Noor Sarafina Binti Syed Anuar"));
                staffList.add(new EnTblMastStaffinfo("INFO208", "Phoon Wai Seong"));
                break;

            default:
                break;


        }
        return gson.toJson(staffList);
    }
}
