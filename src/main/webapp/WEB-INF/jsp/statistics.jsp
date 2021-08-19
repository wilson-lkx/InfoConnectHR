<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Statistics Report</title>

    <style>
        .buttons {
          display: inline-block;
        }

        #tblReport {
          font-family: Arial, Helvetica, sans-serif;
          border-collapse: collapse;
          width: 100%;
        }

        #tblReport td, #customers th {
          border: 1px solid #ddd;
          padding: 8px;
        }

        #tblReport tr:nth-child(even){background-color: #f2f2f2;}

        #tblReport tr:hover {background-color: #ddd;}

        #tblReport th {
          padding-top: 12px;
          padding-bottom: 12px;
          text-align: center;
          background-color: #2B8BD8;
          color: white;
        }
    </style>

</head>
<body>

   <h1 align="center">Statistics Report</h1>
   <br/> <br/>

   <table id="tblReport">
     <tr>
       <th>Form Id</th>
       <th>Originator</th>
       <th>Duration</th>
       <th>Date</th>
       <th>Status</th>
     </tr>
     <c:forEach items="${reports}" var="report">
        <tr>
           <td>${report.formId}</td>
           <td>${report.originator}</td>
           <td>${report.duration}</td>
           <td>${report.date}</td>
           <td>${report.status}</td>

           <!--
           <td><c:out value="${report.formId}"/></td>
           <td><c:out value="${report.originator}"/></td>
           <td><c:out value="${report.duration}"/></td>
           <td><c:out value="${report.date}"/></td>
           <td><c:out value="${report.status}"/></td>
           -->

        </tr>
     </c:forEach>
   </table>

   </br> </br>

   <div class='buttons'>
     <button class="button btnPdf" onclick="myFunction()">Pdf</button>
     <button class="button btnExcel" onclick="myFunction()">Excel</button>
   </div>

</body>
</html>