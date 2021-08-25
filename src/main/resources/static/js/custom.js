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
					document.getElementById("staff").disabled = true;
				} else {
					document.getElementById("staff").disabled = false;
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