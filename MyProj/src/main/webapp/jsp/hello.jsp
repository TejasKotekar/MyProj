<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<!-- <script src="C:\Users\Tejas.Kotekar.SWASTIK\git\MyProj\MyProj\src\main\webapp\jsp\jquery-1.10.2.min.js" type="text/javascript"></script>
<script src= "C:\Users\Tejas.Kotekar.SWASTIK\git\MyProj\MyProj\src\main\webapp\jsp\jquery-1.10.2.js"  type="text/javascript"></script>
 -->
 <script>

/* $(document).ready(function(){ */
	function helloFuntion(){
	var fname=$("#firstName").val();
	
	var url = 'hello.html';
 	var data = {
			"firstName" :$("#firstName").val(),
			}; 
	 $.ajax({
	
		url : url,
		data : data,
	
		success :function(response){
			return response;
		
		}

		}); 
	 alert(fname);

}
</script>


</head>
<body>
	<form:form action="hello.html" method="post">
	First Name <form:input path="helloVo.firstName" id="firstName"/>
				<form:select path="list" id="selFirstName">
					<form:option value="0">Select Name</form:option>

				 	<c:forEach var="nameList" items="${command.getList()}">
							<form:option value="1">"${command.getMyName()}</form:option>
						</c:forEach>
						
				</form:select>
				
		<!-- First Name<input type= text id="firstName"> -->
		<input type=button value = submit id="submitBtn" onClick="helloFuntion()"/>
	
	</form:form>


</body>
</html>