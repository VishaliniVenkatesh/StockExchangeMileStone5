<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
 
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" >

  


</head>
<body class="container">
 <header>
        <img src="images/logo.png" alt="no image" width="70px" height="70px;"> <p id="heading">Stock Market</p>
       </header>
         <nav>
                <a href="importStockPage.html">Import Data</a>
        
                <div class="dropdown">
                    <button class="dropbtn">Manage Company
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-content">
                        <a href="/addCompany">Add Company</a>
                        <a href="#">Update Company</a>
                    </div>
                </div>
                <a href="/companyList">Manage exchange</a>
                <a href="">Update IPO Details</a>
                <a href="signup.html" id="topic">Logout</a>
            </nav>
<article>

<form:form method="POST" action="/addCompany"
  modelAttribute="company">
	
    
     <p id="body-heading">Create a new company</p>
           <table class="insert-table">
                <tr>
                    <td><label>Company Name</label></td>
                    <td><form:input type="text" path="companyName"  /></td>
                    <td><div class="has-error">
                        <form:errors path="companyName" class="text-danger"/>
                    </div></td>
                </tr>
                <tr>
                    <td><label>CEO Name</label></td>
                    <td><form:input type="text"  path="ceo"/></td>
                    <td><div class="has-error">
                        <form:errors path="ceo" class="text-danger"/>
                    </div></td>
                </tr>
                <tr>
                    <td><label>Board Memebers</label></td>
                    <td><form:input type="text" path="boardOfDirectors"/></td>
                    <td><div class="has-error">
                        <form:errors path="boardOfDirectors" class="text-danger"/>
                    </div></td>
                </tr>
                <tr>
                    <td><label>Sector Id</label></td>
                    <td><form:input type="text" path="sector"/></td>
                    <td><div class="has-error">
                        <form:errors path="sector" class="text-danger"/>
                    </div></td>
                </tr>
                <tr>
                    <td><label>TurnOver</label></td>
                    <td><form:input type="number" path="turnover"  /></td>
                    <td><div class="has-error">
                        <form:errors path="turnover" class="text-danger"/>
                    </div></td>
                </tr>
                <tr>
                    <td><label>Brief Description</label></td>
                    <td><form:input type="text" path="briefWriteup"/></td>
                    <td><div class="has-error">
                        <form:errors path="briefWriteup" class="text-danger"/>
                    </div></td>
                </tr>
                
                <tr>
                    <td><input type="submit"  value="Save" id="button" /></td>
                </tr>
            </table>
</form:form>

</article>
<footer>
        <p id="ftext">Copyright&copy; 2019</p>
    </footer>
</body>
</html>