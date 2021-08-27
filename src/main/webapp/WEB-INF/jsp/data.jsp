<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Data</title>
</head>
<body>

   <!-- https://stackoverflow.com/questions/3177733/how-can-i-avoid-java-code-in-jsp-files-using-jsp-2 -->

    <div style="border: 1px solid black; padding: 15px; background-color: #F7CAC9;">
        <div class='buttons'>
            <button class="button btnPdf" onclick="myFunction()">Pdf</button>
            <button class="button btnExcel" onclick="myFunction()">Excel</button>
        </div>
        <br>
        <c:forEach items="${staffs}" var="staff">
            <c:set var = "staffId" value = "${staff.docufloID}"/>
            <c:set var = "enTblReportData" value = "${enTblReportDataMap[staffId]}"/>
            <div style="display: flex;">
                <div style="flex: 50%;">
                    <b>Company:</b>${enTblReportData.companyName}
                </div>
                <div style="flex: 50%;">
                    <b>Department:</b>${enTblReportData.deptName}
                </div>
            </div>
            <div style="display: flex;">
                <div style="flex: 50%;">
                    <b>Staff Id:</b>${enTblReportData.docufloID}
                </div>
                <div style="flex: 50%;">
                    <b>Staff Name:</b>${enTblReportData.name}
                </div>
            </div>
            <div style="border: 1px solid black; background-color: yellow;">
                <table>
                    <tr>
                        <th>No.</th>
                        <th>Leave Type</th>
                        <th>Description</th>
                        <th>Reason</th>
                        <th>Start Date</th>
                        <th>End Date</th>
                        <th>Number of Days</th>
                    </tr>
                    <c:set var = "enTblReportDataListCount" value = "${enTblReportDataListCountMap[staffId]}"/>
                    <c:choose>
                        <c:when test="${enTblReportDataListCount > 0}">
                            <c:forEach items="${enTblReportDataListMap[staffId]}" var="data" varStatus="status">
                                <tr>
                                    <td>${status.count}</td>
                                    <td>${data.leaveType}</td>
                                    <td>${data.IFEmergency}</td>
                                    <td>${data.reason}</td>
                                    <td>${data.dateFrom}</td>
                                    <td>${data.dateTo}</td>
                                    <td>${data.days}</td>
                                </tr>
                            </c:forEach>
                        </c:when>
                        <c:otherwise>
                            <tr>
                                <td> No Records! </td>
                            </tr>
                        </c:otherwise>
                    </c:choose>
                </table>
            </div>
            <hr>
        </c:forEach>
    </div>
</body>
</html>