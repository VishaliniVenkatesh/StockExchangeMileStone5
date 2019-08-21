<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" >
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script> 
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<header>
        
        <img src="images/logo.png" alt="no image" width="70px" height="70px;"> <p id="heading">Stock Market</p>
        
        
             
         </header>


<form:form method="POST" action="/addUser"
  modelAttribute="user">

    
<article>
<table class="insert-table">

        <h1>SIGNUP FORM</h1>
                <tr>
                <td><label>Username</label></td>
                     <td><form:input type="text" path="username"  /></td>
                    <td><div class="has-error">
                        <form:errors path="username" class="text-danger"/>
                    </div></td>
                </tr>
                                
                 <tr>
                    <td><label>Password</label></td>
                    <td><form:password path="password"  /></td>
                    <td><div class="has-error">
                        <form:errors path="password" class="text-danger"/>
                    </div></td>
                </tr>
                <tr>
                    <td><label>Confirm Password</label></td>
                    <td><form:password path="confirmPassword"  /></td>
                    <td><div class="has-error">
                        <form:errors path="confirmPassword" class="text-danger"/>
                    </div></td>
                </tr>
                <tr>
                <td><label>email</label></td>
                     <td><form:input type="email" path="email"  /></td>
                    <td><div class="has-error">
                        <form:errors path="email" class="text-danger"/>
                    </div></td>
                </tr>
                
                <tr>
                <td><label>Mobile Number</label></td>
                     <td><form:input type="text" path="mobileNumber"  /></td>
                    <td><div class="has-error">
                        <form:errors path="mobileNumber" class="text-danger"/>
                    </div></td>
                </tr>
 				<tr>
                    <td><input type="submit"  value="Sign up" id="button" class="btn btn-success"/></td>
                </tr>
 


  
  </table>
  
</form:form>
</article>

<footer>
    <p id="ftext">Copyright&copy; 2019</p>
</footer>

</body>
</html>