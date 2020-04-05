<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link href="/css/bootstrap.css"      rel="stylesheet">
	<link href="/css/custom.css"      rel="stylesheet">
	<link href="/css/main.css"      rel="stylesheet">
</head>
<body>
<h1 align="center">Daily Report</h1>
<table id="t02"  cellpadding="2">
<tr>
<th>
<a  href="/apply"><h2>Home Page:Daily Report</h2></a>

</th>

<th>

<a  align ="right" href="/delete"><h2>Delete All Entries</h2></a>
</th>
</tr>
</table>
<table >
<tr>


  <th>Page No : 
<c:forEach var="count" items="${pageCount}"  varStatus="theCount"> 
<a align="right" href="/viewdailyreports/${theCount.count}">${theCount.count}</a>   
</c:forEach>  
</th>

</tr>

</table>
   
<form:form  class="form-horizontal" >
<table id="t01" border="2" width="70%" cellpadding="2">
<tr><th>Id</th><th>Date</th><th>Candidate Name</th>
<th>Mobile Number</th><th>Email ID</th><th>Client</th>
<th>Req Name</th><th>AMS Req ID</th><th>AMS Candidate ID</th>
<th>Weekday Interview Scheduled</th><th>Weekday Interview Happened</th><th>Weekend Interview Scheduled</th><th>Selects</th>
<th>Edit</th><th>Delete</th></tr>  

   <c:forEach var="dailyreport" items="${list}"> 
   <tr>  
   <td>${lms.id}</td>  
   <td>${lms.date}</td> 
   <td>${lms.candidate_name}</td>   
   <td>${lms.mobile_number}</td> 
   <td>${lms.email_id}</td> 
   <td>${lms.client}</td>    
   <td>${lms.req_name}</td> 
   <td>${lms.ams_req_id}</td> 
   <td>${lms.ams_candidate_id}</td> 
   <td>${lms.weekday_interview_scheduled}</td> 
   <td>${lms.weekday_interview_happened}</td> 
   <td>${lms.weekend_interview_scheduled}</td> 
    <td>${lms.selects}</td>       
  <td><a href="/editdailyreport/${dailyreport.id}">Edit</a></td>  
   <td><a href="/deletedailyreport/${dailyreport.id}">Delete</a></td>  
   </tr>  
   </c:forEach> 
   
   
   </table>  
   <br/>
   
  
   </form:form>
</body>
</html>