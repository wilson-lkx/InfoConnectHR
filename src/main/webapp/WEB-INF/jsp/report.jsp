<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Leave Management Report</title>

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://cdn.datatables.net/1.11.0/js/jquery.dataTables.min.js"></script>
    <script src="https://cdn.datatables.net/buttons/2.0.0/js/dataTables.buttons.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jszip/3.1.3/jszip.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/pdfmake.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/vfs_fonts.js"></script>
    <script src="https://cdn.datatables.net/buttons/2.0.0/js/buttons.html5.min.js"></script>
    <script src="https://cdn.datatables.net/buttons/2.0.0/js/buttons.print.min.js"></script>

	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>

	<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.11.0/css/jquery.dataTables.min.css">
	<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/buttons/2.0.0/css/buttons.dataTables.min.css">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	<script type="text/javascript">
	function getCurrentDate(now) {
		var month = (now.getMonth() + 1);
		var day = now.getDate();
		if(month < 10) month = "0" + month;
		if(day < 10) day = "0" + day;
		var today = now.getFullYear() + '-' + month + '-' + day;
		return today;
	}

	function getCurrentMonth(now) {
		var month = now.getMonth();
		var months = ['January', 'February', 'March', 'April', 'May', 'Jun', 'July', 'August', 'September', 'October', 'November', 'December'];
		var s = '';
		for(var i = 0; i < 12; i++) {
			s += '<option value="' + i + '"';
			if(i == month) {
				s += ' selected';
			}
			s += '>';
			s += months[i];
			s += '</option>';
		}
		return s;
	}

	function getCurrentYear(now) {
		var year = now.getFullYear();
		var startingYear = 2021;
		var count = 10;
		var s = '';
		for(var i = startingYear; i < (startingYear + count); i++) {
			s += '<option value="' + i + '"';
			if(i == year) {
				s += ' selected';
			}
			s += '>' + i + '</option>';
		}
		return s;
	}
	function getFileName(reportType) {
	    var date = '';
	    var months = ['January', 'February', 'March', 'April', 'May', 'Jun', 'July', 'August', 'September', 'October', 'November', 'December'];

	    if (reportType == 'Daily') {
	        date = $('#datePicker').val();
	    } else if (reportType == 'Monthly') {
	        var monthPicker = $('#monthPicker').val();
	        date = months[Integer.parseInt(monthPicker)] + ' ' + $('#yearPicker').val();
	    } else if (reportType == 'Yearly') {
	         date = $('#yearPicker').val();
	    }
	    return 'LMS_' + reportType + 'Report ' + date;
	}

	$(document).ready(function() {
		var now = new Date();
		var reportType = '';

		$('#datePicker').val(getCurrentDate(now));
		$('#monthPicker').html(getCurrentMonth(now));
		$('#yearPicker').html(getCurrentYear(now));
		$('#company').change(function() {
			var companyId = $(this).val();
			$.ajax({
				type: 'GET',
				url: '${pageContext.request.contextPath}/report/lms/department?companyID=' + companyId,
				success: function(result) {
					var result = JSON.parse(result);
					var s = '<option value="" selected>All</option>';
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
					var s = '<option value="" selected>All</option>';
					for(var i = 0; i < result.length; i++) {
						s += '<option value="' + result[i].docufloID + '">' + result[i].name + '</option>';
					}
					$('#staff').html(s);
					if(departmentId == "") {
						document.getElementById("staff").disabled = true;
					} else {
						document.getElementById("staff").disabled = false;
					}
				}
			});
		});
		$('#mode').change(function() {
			if($(this).val() == 1) { // 1=daily, 2=monthly, 3=yearly
				$('#dailyDiv').show();
				$('#monthlyDiv').hide();
				$('#yearlyDiv').hide();
				reportType += 'Daily';
			} else if($(this).val() == 2) {
				$('#dailyDiv').hide();
				$('#monthlyDiv').show();
				$('#yearlyDiv').show();
				reportType += 'Monthly';
			} else {
				$('#dailyDiv').hide();
				$('#monthlyDiv').hide();
				$('#yearlyDiv').show();
				reportType += 'Yearly';
			}
		});
		$('#search_form').submit(function(event) {
			event.preventDefault();
			$('#tableDiv').show();
			var fileName = getFileName(reportType);
			var formData = {
				companyID: $('#company').val(),
				deptID: $('#department').val(),
				docufloID: $('#staff').val(),
				mode: $('#mode').val(),
				date: $('#datePicker').val(),
				month: $('#monthPicker').val(),
				year: $('#yearPicker').val(),
				leaveTypeID: $('#leaveType').val(),
			};
			$('#reportTable').DataTable({
				ajax: {
					url: '${pageContext.request.contextPath}/report/lms/data',
					type: 'POST',
					data: formData,
					dataSrc: ''
				},
				columns: [
				    {data: 'deptName', width: '14%'},
				    {data: 'name', width: '18%'},
				    {data: 'leaveType', width: '14%'},
				    {data: 'reason', width: '26%'},
				    {data: 'dateFrom', width: '12%'},
				    {data: 'dateTo', width: '12%'},
				    {data: 'days', width: '4%'}
				],
				//https://datatables.net/reference/option/dom
                dom: 'lfrtBp',
                buttons: [
                    {
                        extend: 'pdfHtml5',
                        title: fileName
                    },
                    {
                        extend: 'excelHtml5',
                        title: fileName
                    }
                ],
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
		background-color: #BOAAAA;
	}

	#tblReport th {
		padding-top: 12px;
		padding-bottom: 12px;
		text-align: center;
		background-color: #2B8BD8;
		color: white;
	}

	#search {
		margin-top: -1%;
		width: 10em;
		height: 2em;
		font-family: Arial, Helvetica, sans-serif;
		text-align: center;
		font-weight: bold;
	}

	.container {}

	.row {
		height: 80px;
	}

	.col {}
	</style>
</head>
<!-- https://stackoverflow.com/questions/51659414/populate-dropdown-list-with-current-day-month-and-year -->

<body style="background-image: linear-gradient(white, grey);">
	<!-- https://www.youtube.com/watch?v=J6jrLZ3Ah5g -->
	<h1 align="center">Leave Management Report</h1>
	<div class="container-xl">
		<div style="border: 2px solid black; padding: 15px 15px 15px; background-color: #EDEDED;">
			<form id="search_form" name="search_form">
				<div class="row">
					<div class="col">
						<label for="companies" class="fw-bold">Company:</label>
						<select class="form-select form-select-sm" id="company" aria-label=".form-select-sm" name="company">
							<c:forEach items="${companies}" var="company">
								<option value="${company.companyID}">${company.companyName}</option>
							</c:forEach>
						</select>
					</div>
					<div class="col">
						<label for="departments" class="fw-bold">Department:</label>
						<select class="form-select form-select-sm" id="department" aria-label=".form-select-sm" name="department">
							<option value="">All</option>
						</select>
					</div>
					<div class="col">
						<label for="staff" class="fw-bold">Staff:</label>
						<select class="form-select form-select-sm" id="staff" aria-label=".form-select-sm" name="staff">
							<option value="">All</option>
						</select>
					</div>
				</div>
				<div class="row">
					<div class="col">
						<label for="mode" class="fw-bold">Mode:</label>
						<select class="form-select form-select-sm" id="mode" aria-label=".form-select-sm" name="mode">
							<option value="1">Daily</option>
							<option value="2">Monthly</option>
							<option value="3">Yearly</option>
						</select>
					</div>
					<div class="col">
						<div id="dailyDiv" style="display: block;">
							<label for="datePicker" class="fw-bold">Date:</label>
							<input type="date" class="form-control form-control-sm" id="datePicker" name="datePicker">
						</div>
						<div id="monthlyDiv" style="display: none;">
							<label for="monthPicker" class="fw-bold">Month:</label>
							<select class="form-select form-select-sm" id="monthPicker" aria-label=".form-select-sm" name="monthPicker"></select>
						</div>
					</div>
					<div class="col">
						<div id="yearlyDiv" style="display: none;">
							<label for="yearPicker" class="fw-bold">Year:</label>
							<select class="form-select form-select-sm" id="yearPicker" aria-label=".form-select-sm" name="yearPicker"></select>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-4">
						<label for="leaveTypes" class="fw-bold">Type of Leave:</label>
						<select class="form-select form-select-sm" id="leaveType" aria-label=".form-select-sm" name="leaveType">
							<option value="" selected>All</option>
							<c:forEach items="${leaveTypes}" var="leaveType">
								<option value="${leaveType.leaveTypeID}">${leaveType.leaveTypeDesc}</option>
							</c:forEach>
						</select>
					</div>
				</div>
				<input id="search" type="submit" class="btn btn-dark" value="Search" style="float:right;"> </form>
		</div>
	</div>
	<br>
	<div class="container-xl">
		<div id="tableDiv" style="border: 2px solid black; padding: 15px; background-color: #EDEDED;  margin-top: 20px; display: none;">
			<div class="table-responsive-xxl">
				<table id="reportTable" class="table table-striped table-hover table-bordered table align-middle" cellspacing="0" width="100%">
					<thead class="table-dark table align-middle">
						<tr class="align-middle">
							<th>Department</th>
							<th>Staff</th>
							<th>Leave Type</th>
							<th>Reason</th>
							<th>Start Date</th>
							<th>End Date</th>
							<th>Days</th>
						</tr>
					</thead>
				</table>
			</div>
		</div>
	</div>
</body>

</html>