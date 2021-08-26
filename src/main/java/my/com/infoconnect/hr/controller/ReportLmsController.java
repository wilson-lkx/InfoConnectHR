package my.com.infoconnect.hr.controller;

import com.google.gson.Gson;
import my.com.infoconnect.hr.model.*;
import my.com.infoconnect.hr.service.ReportLmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/report/lms")
public class ReportLmsController {

    private static final Gson gson = new Gson();

    @Autowired
    ReportLmsService lmsReportService;

    @RequestMapping
    public String getReportList(Model model) {
        model.addAttribute("companies", lmsReportService.findEnTblMastCompany());
        model.addAttribute("leaveTypes", lmsReportService.findEnTblMastLeavetype());
        return "report";
    }

    @ResponseBody
    @RequestMapping(value = "/department", method = {RequestMethod.GET})
    public String getDepartmentByCompanyId(@RequestParam("companyID") String companyID) {
        return gson.toJson(lmsReportService.findEnTblMastDepartment(companyID));
    }

    @ResponseBody
    @RequestMapping(value = "/staff", method = {RequestMethod.GET})
    public String getStaffByDepartmentId(@RequestParam("companyID") String companyID,
                                         @RequestParam("deptID") String deptID) {
        return gson.toJson(lmsReportService.findEnTblMastStaffinfo(companyID, deptID));
    }

    @ResponseBody
    @RequestMapping(value = "/search", method = {RequestMethod.POST})
    public String searchReport(Model model,
                               @RequestParam(value = "companyID", required = false) String companyID,
                               @RequestParam(value = "deptID", required = false) String deptID, //empty string is All
                               @RequestParam(value = "docufloID",required = false) String docufloID, //empty string is All
                               @RequestParam(value = "mode",required = false) String mode, //1=daily,2=monthly,3=yearly
                               @RequestParam(value = "date",required = false) String date,
                               @RequestParam(value = "month",required = false) String month,
                               @RequestParam(value = "year",required = false) String year,
                               @RequestParam(value = "leaveTypeID", required = false) String leaveTypeID //empty string is All
    ) {
        List<EnTblMastStaffinfo> enTblMastStaffinfos;
        Map<String, List<EnTblDataForm>> enTblDataFormMap = new HashMap<>();


        if (docufloID.isEmpty()) {
            enTblMastStaffinfos = lmsReportService.findEnTblMastStaffinfo(companyID, deptID);
        } else {
            enTblMastStaffinfos = new ArrayList<>();
            enTblMastStaffinfos.add(lmsReportService.findEnTblMastStaffinfo(docufloID));
        }

        for (EnTblMastStaffinfo enTblMastStaffinfo : enTblMastStaffinfos) {

        }


        List<EnTblDataForm> enTblDataForms = lmsReportService.findEnTblDataForm();



        return gson.toJson(enTblDataForms);
    }
}