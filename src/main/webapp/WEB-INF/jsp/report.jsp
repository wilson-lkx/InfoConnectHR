<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Report</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script type="text/javascript">

      $(document).ready(function(){
      	$('#company').change(function(){
          var companyId = $(this).val();
          $.ajax({
            type: 'GET',
          	url: 'http://localhost:8100/report/department?companyId=' + companyId,
            success: function(result){
            console.log("success");
      		  var result = JSON.parse(result);
              var s = '';
              for(var i = 0; i < result.length; i++) {
                s += '<option value="' + result[i].deptID + '">' + result[i].deptName + '</option>';
                $('#department').html(s);
              }
    	  }});
        });

        $("search_form").submit(function (event) {
          var formData = {
            name: $("#name").val(),
            email: $("#email").val(),
            superheroAlias: $("#superheroAlias").val(),
          };

          $.ajax({
            type: "POST",
            url: "process.php",
            data: formData,
            dataType: "json",
            encode: true,
          }).done(function (data) {
             console.log(data);
          });

          event.preventDefault();
        });
      });

    </script>
</head>

<body>
   <!-- https://www.youtube.com/watch?v=J6jrLZ3Ah5g -->

   <h1 align="center">Leave Management System Report</h1>
   <div style="background-image: linear-gradient(#0CCDA3, #C1FCD3);padding:10px;">
      <form id="search_form" name="search_form">

         <label for="companies">Company:</label>
           <select id="company" name="company">
             <option value="C001">InfoConnect</option>
             <option value="C002">Docuflo (MSC)</option>
             <option value="C003">Bpi Technologies</option>
             <option value="C004">FirstBase</option>
           </select>
         <br/>

         <label for="departments">Department:</label>
           <select id="department" name="departments"></select>
         <br/>

         <label for="startDate">Start Date:</label>
         <input type="date" id="startDate" name="startDate">
         <label for="endDate">End Date:</label>
         <input type="date" id="endDate" name="endDate">
         <br/>

        <input id="search" type="submit" value="Search">
      </form>
   </div>

   <br/>

   <div style="background-image: linear-gradient(#614385, #516395);padding:10px;">
      No Content!
   </div>
</body>
</html>