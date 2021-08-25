<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Leave Management Report</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script type="text/javascript">
	$(document).ready(function() {
		$('#company').change(function() {
			var companyId = $(this).val();
			$.ajax({
				type: 'GET',
				url: '${pageContext.request.contextPath}/report/lms/department?companyID=' + companyId,
				success: function(result) {
					var result = JSON.parse(result);
					var s = '<option value="" select="selected">All</option>';
					for(var i = 0; i < result.length; i++) {
						s += '<option value="' + result[i].ID + '">' + result[i].deptID + '</option>';
					}
					$('#department').html(s);
				}
			});
		});
		$('#department').change(function() {
		    var companyId = $('#company').val()
			var departmentId = $(this).val();
			$.ajax({
				type: 'GET',
				url: '${pageContext.request.contextPath}/report/lms/staff?companyID=' + companyId + '&deptID=' + departmentId,
				success: function(result) {
					var result = JSON.parse(result);
					var s = '<option value="" select="selected">All</option>';
					for(var i = 0; i < result.length; i++) {
						s += '<option value="' + result[i].docufloID + '">' + result[i].name + '</option>';
					}
					$('#staff').html(s);
                    if(departmentId == "") {
                        document.getElementById("staff").disabled=true;
                    } else {
                        document.getElementById("staff").disabled=false;
                    }
				}
			});
		});
		$('#mode').change(function() {
			if($(this).val() == 2) { // 1=daily, 2=monthly
				$("#dailyDiv").hide();
				$("#monthlyDiv").show();
				$("#yearlyDiv").show();
			} else {
				$("#dailyDiv").show();
				$("#monthlyDiv").hide();
				$("#yearlyDiv").hide();
			}
		});
		$("#search_form").submit(function(event) {
			event.preventDefault();
			var formData = {
				companyID: $("#company").val(),
				deptID: $("#department").val(),
				docufloID: $("#staff").val(),
				dailyDate: $("#dailyDate").val(),
				month: $("#month").val(),
				year: $("#year").val(),
				leaveTypeID: $("#leaveType").val(),
			};
			$.ajax({
				type: "POST",
				url: "${pageContext.request.contextPath}/report/lms/search",
				data: formData,
				success: function(result) {
					var data = JSON.parse(result);
					console.log(data.length);
					var s = '<tr><th>Company</th><th>Department</th><th>Staff ID</th><th>Staff Name</th><th>Leave Type</th><th>IFEmergency</th><th>Date From</th><th>Date To</th><th>Leave Day</th></tr>';
					for(var i = 0; i < data.length; i++) {
						s += '<tr><td>' + data[i].company + '</td><td>' + data[i].department + '</td><td>' + data[i].staffId + '</td><td>' + data[i].staffName + '</td><td>' + data[i].leaveType + '</td><td>' + data[i].IFEmergency + '</td><td>' + data[i].dateFrom + '</td><td>' + data[i].dateTo + '</td><td>' + data[i].leaveDay + '</td></tr>';
					}
					$('#tblReport').html(s);
				}
			});
		});
	});
	</script>
	<style>
	#tblReport {
		font-family: Arial, Helvetica, sans-serif;
		border-collapse: collapse;
		width: 100%;
	}

	#tblReport td {
		border: 1px solid #ddd;
		padding: 8px;
	}

	#tblReport tr:nth-child(even) {
		background-color: #f2f2f2;
	}

	#tblReport tr:hover {
		background-color: #ddd;
	}

	#tblReport th {
		padding-top: 12px;
		padding-bottom: 12px;
		text-align: center;
		background-color: #2B8BD8;
		color: white;
	}

	#company {
		padding: 2px 6px;
		font-family: "Roboto", sans-serif;
		cursor: pointer;
		color: #D35400;
		background-color: #FCF3CF;
		border: 1px solid #dddddd;
		border-radius: 4px;
	}

	#company.focus,
	#select:hover {
		outline: none;
		border: 1px solid #bbbbbb;
	}

	#company option {
		background: #ffffff;
	}

	#department {
		padding: 2px 6px;
		font-family: "Roboto", sans-serif;
		cursor: pointer;
		color: #D35400;
		background-color: #FCF3CF;
		border: 1px solid #dddddd;
		border-radius: 4px;
	}

	#department.focus,
	#select:hover {
		outline: none;
		border: 1px solid #bbbbbb;
	}

	#department option {
		background: #ffffff;
	}

	#staff {
		padding: 2px 6px;
		font-family: "Roboto", sans-serif;
		cursor: pointer;
		color: #D35400;
		background-color: #FCF3CF;
		border: 1px solid #dddddd;
		border-radius: 4px;
	}

	#staff.focus,
	#select:hover {
		outline: none;
		border: 1px solid #bbbbbb;
	}

	#staff option {
		background: #ffffff;
	}

	#mode {
		padding: 2px 6px;
		font-family: "Roboto", sans-serif;
		cursor: pointer;
		color: #D35400;
		background-color: #FCF3CF;
		border: 1px solid #dddddd;
		border-radius: 4px;
	}

	#mode.focus,
	#select:hover {
		outline: none;
		border: 1px solid #bbbbbb;
	}

	#mode option {
		background: #ffffff;
	}

	#dailyDate {
		padding: 1px 4px;
		font-family: "Roboto", sans-serif;
		cursor: pointer;
		color: #D35400;
		background-color: #FCF3CF;
		border: 1px solid #dddddd;
		border-radius: 4px;
	}

	#dailyDate.focus,
	#select:hover {
		outline: none;
		border: 1px solid #bbbbbb;
	}

	#dailyDate option {
		background: #ffffff;
	}

	#month {
		padding: 2px 6px;
		font-family: "Roboto", sans-serif;
		cursor: pointer;
		color: #D35400;
		background-color: #FCF3CF;
		border: 1px solid #dddddd;
		border-radius: 4px;
	}

	#month.focus,
	#select:hover {
		outline: none;
		border: 1px solid #bbbbbb;
	}

	#month option {
		background: #ffffff;
	}

	#year {
		padding: 2px 6px;
		font-family: "Roboto", sans-serif;
		cursor: pointer;
		color: #D35400;
		background-color: #FCF3CF;
		border: 1px solid #dddddd;
		border-radius: 4px;
	}

	#year.focus,
	#select:hover {
		outline: none;
		border: 1px solid #bbbbbb;
	}

	#year option {
		background: #ffffff;
	}

	#leaveType {
		padding: 2px 6px;
		font-family: "Roboto", sans-serif;
		cursor: pointer;
		color: #D35400;
		background-color: #FCF3CF;
		border: 1px solid #dddddd;
		border-radius: 4px;
	}

	#leaveType.focus,
	#select:hover {
		outline: none;
		border: 1px solid #bbbbbb;
	}

	#leaveType option {
		background: #ffffff;
	}

	#search {
		margin-top: -1%;
		width: 10em;
		height: 2em;
		font-family: Arial, Helvetica, sans-serif;
		text-align: center;
		font-weight: bold;
		color: #A93226;
	}

	.label {
		font-family: Arial, Helvetica, sans-serif;
		font-weight: bold;
		color: Black;
		font-size: 15px;
	}
	</style>
</head>

<!-- https://stackoverflow.com/questions/51659414/populate-dropdown-list-with-current-day-month-and-year -->

<body>
	<!-- https://www.youtube.com/watch?v=J6jrLZ3Ah5g -->
	<h1 align="center">Leave Management Report</h1>
	<div style="border: 1px solid black; padding: 15px 15px 15px; background-color: #FA8072;">
		<form id="search_form" name="search_form">
			<div style="width:100%; padding: 4px 8px;">
				<div style="width: 34%; float: left;">
					<label for="companies" class="label">Company:</label>
					<select id="company" name="company">
						<c:forEach items="${companies}" var="company">
							<option value="${company.companyID}">${company.companyName}</option>
						</c:forEach>
					</select>
				</div>
				<div style="width: 33%; float: left;">
					<label for="departments" class="label">Department:</label>
					<select id="department" name="department"></select>
				</div>
				<div style="margin-left: 33%;">
					<label for="staff" class="label">Staff:</label>
					<select id="staff" name="staff"></select>
				</div>
			</div>
			<div style="width:100%; padding: 4px 8px;">
				<div style="width: 34%; float: left;">
					<label for="mode" class="label">Mode:</label>
					<select id="mode" name="mode">
						<option value="1" select="selected">Daily</option>
						<option value="2">Monthly</option>
						<option value="3">Yearly</option>
					</select>
				</div>
				<div id="dailyDiv" style="margin-left: 33%; display: block;">
					<label for="dailyDate" class="label">Daily Date:</label>
					<input type="date" id="dailyDate" name="dailyDate"> </div>
				<div id="monthlyDiv" style="width: 33%; float: left; display: none;">
					<label for="month" class="label">Month:</label>
					<select id="month" name="month">
						<option value="1">January</option>
						<option value="2">February</option>
						<option value="3">March</option>
						<option value="4">April</option>
						<option value="5">May</option>
						<option value="6">Jun</option>
						<option value="7">July</option>
						<option value="8">August</option>
						<option value="9">September</option>
						<option value="10">October</option>
						<option value="11">November</option>
						<option value="12">December</option>
					</select>
				</div>
				<div id="yearlyDiv" style="margin-left: 33%; padding:0px; display: none;">
					<label for="year" class="label">Year:</label>
					<select id="year" name="year">
						<option value="2021">2021</option>
						<option value="2022">2022</option>
					</select>
				</div>
			</div>
			<div style="padding: 4px 8px;">
				<label for="leaveTypes" class="label">Type of Leave:</label>
				<select id="leaveType" name="leaveType">
					<option value="" select="selected">All</option>
					<c:forEach items="${leaveTypes}" var="leaveType">
						<option value="${leaveType.leaveTypeID}">${leaveType.leaveTypeDesc}</option>
					</c:forEach>
				</select>
			</div>
			<input id="search" type="submit" value="Search" style="float:right;"> </form>
	</div>
	<div style="border: 1px solid black; padding: 15px; background-color: #F7CAC9;  margin-top: 20px;">
		<!-- https://mdbootstrap.com/docs/b4/jquery/tables/pagination/ -->
		<table id="tblReport">
			<tr>
				<td> No Records! </td>
			</tr>
		</table>
	</div>
	<br> </body>

</html>