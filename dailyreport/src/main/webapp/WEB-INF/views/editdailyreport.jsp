<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link href="/css/bootstrap.css"      rel="stylesheet">
	<link href="/css/custom.css"      rel="stylesheet">
	<link href="/css/main.css"      rel="stylesheet">
</head>

<body>

 	<div class="form-container">
 	
 	<h1>Edit Daily Report Details</h1>
 	
	<form:form method="POST" modelAttribute="dailyreport" commandName="dailyreport" class="form-horizontal" action="/editsave">

<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="date"> Date </label>
				<div class="col-md-7">
					<form:hidden path="id"  class="form-control input-sm"/>
					<div class="has-error">
						
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="date"> Date</label>
				<div class="col-md-7">
					<form:input type="text" path="date" id="date" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="date" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>
		
	

		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="candidate_name">Candidate Name</label>
				<div class="col-md-7">
					<form:input type="text" path="candidate_name" id="candidate_name" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="candidate_name" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>
		
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="mobile_number"> Mobile Number </label>
				<div class="col-md-7">
					<form:input type="text" path="mobile_number" id="mobile_number" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="mobile_number" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>
		
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="email_id"> Email ID </label>
				<div class="col-md-7">
					<form:input type="text" path="email_id" id="email_id" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="email_id" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>
		
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="client">Client</label>
				<div class="col-md-7">
					<form:input type="text" path="client" id="client" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="client" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>
		
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="req_name">Req Name</label>
				<div class="col-md-7">
					<form:input type="text" path="req_name" id="req_name" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="req_name" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>
		
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="ams_req_id">AMS Req ID</label>
				<div class="col-md-7">
					<form:input type="text" path="ams_req_id" id="ams_req_id" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="ams_req_id" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>
		
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="ams_candidate_id">AMS Candidate ID</label>
				<div class="col-md-7">
					<form:input type="text" path="ams_candidate_id" id="ams_candidate_id" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="ams_candidate_id" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>
		
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="weekday_interview_scheduled">Weekday Interview Scheduled</label>
				<div class="col-md-7">
					<form:input type="text" path="weekday_interview_scheduled" id="weekday_interview_scheduled" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="weekday_interview_scheduled" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>
		
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="weekday_interview_happened">Weekday Interview Happened</label>
				<div class="col-md-7">
					<form:input type="text" path="weekday_interview_happened" id="weekday_interview_happened" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="weekday_interview_happened" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>
		
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="weekend_interview_scheduled">Weekend Interview Scheduled</label>
				<div class="col-md-7">
					<form:input type="text" path="weekend_interview_scheduled" id="weekend_interview_scheduled" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="weekend_interview_scheduled" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="selects">Selects</label>
				<div class="col-md-7">
					<form:input type="text" path="selects" id="selects" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="selects" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>
		
		
		
	
		<div class="row">
			<div class="form-actions floatRight">
				<input type="submit" value="Edit" class="btn btn-primary btn-sm">
			</div>
		</div>
	</form:form>
	</div>
</body>
</html>