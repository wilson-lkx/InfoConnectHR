package my.com.infoconnect.hr.controller;

import com.google.gson.Gson;
import my.com.infoconnect.hr.model.EnTblMastDepartment;
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
        switch (companyId) {
            case "C001":
                departments.add(new EnTblMastDepartment("D001", "a"));
                departments.add(new EnTblMastDepartment("D002", "b"));
                departments.add(new EnTblMastDepartment("D003", "c"));
                break;
            case "C002":
                departments.add(new EnTblMastDepartment("D004", "l"));
                departments.add(new EnTblMastDepartment("D005", "m"));
                break;
            case "C003":
            case "C004":
                departments.add(new EnTblMastDepartment("D006", "x"));
                departments.add(new EnTblMastDepartment("D007", "y"));
                departments.add(new EnTblMastDepartment("D008", "z"));
                break;
        }
        return gson.toJson(departments);
    }
}
