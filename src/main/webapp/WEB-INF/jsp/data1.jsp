<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Data</title>
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.11.0/css/jquery.dataTables.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdn.datatables.net/1.11.0/js/jquery.dataTables.min.js"></script>
    <script type="text/javascript">
    $(document).ready(function () {
      $('#dtBasicExample').DataTable();
      $('.dataTables_length').addClass('bs-select');
    });
    </script>
</head>
<body>

   <!-- https://stackoverflow.com/questions/43608008/i-want-to-change-the-style-of-datatable/43608092 -->

    <div style="border: 1px solid black; padding: 15px;">
        <div class='buttons'>
            <button class="button btnPdf" onclick="myFunction()">Pdf</button>
            <button class="button btnExcel" onclick="myFunction()">Excel</button>
        </div>
        <br>
        <table id="dtBasicExample" class="table table-striped table-bordered table-sm" cellspacing="0" width="100%">
          <thead>
            <tr>
              <th></th>
              <th>Leave Type</th>
              <th>Description</th>
              <th>Reason</th>
              <th>Start Date</th>
              <th>End Date</th>
              <th>Number of Days</th>
            </tr>
          </thead>

          <tbody>
          <c:forEach items="${staffs}" var="staff">
            <c:set var = "staffId" value = "${staff.docufloID}"/>
            <c:set var = "dataCount" value = "${enTblReportDataListCountMap[staffId]}"/>
            <c:set var = "enTblReportData" value = "${enTblReportDataMap[staffId]}"/>
                                <tr>
                                    <td>Company: ${enTblReportData.companyName}</td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                </tr>
                <c:forEach items="${enTblReportDataListMap[staffId]}" var="data">
                    <tr>
                        <td></td>
                        <td>${data.leaveType}</td>
                        <td>${data.IFEmergency}</td>
                        <td>${data.reason}</td>
                        <td>${data.dateFrom}</td>
                        <td>${data.dateTo}</td>
                        <td>${data.days}</td>
                    </tr>
                </c:forEach>
          </c:forEach>
          </tbody>
        </table>
    </div>
</body>
</html>