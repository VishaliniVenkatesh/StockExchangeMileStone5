<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" >
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script> 
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>

  <header>
        
        <img src="images/logo.png" alt="no image" width="70px" height="70px;"> <p id="heading">Stock Market</p>
        
         <!-- <div id="text"> -->
             
         </header>



<form:form name="submitForm" method="get" modelAttribute="user" action="loginadmin">
    
<div class="box">
        <h1>LOGIN</h1>
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
  <input type="submit" class="btn btn-success" id="btn" value="Sign In"></a> 


</div>
  
</form>

<footer>
    <p id="ftext">Copyright&copy; 2019</p>
</footer>
</form:form>
</body>
</html>