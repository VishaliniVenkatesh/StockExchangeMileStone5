<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
                        <a href="#">Add Company</a>
                        <a href="#">Update Company</a>
                    </div>
                </div>
                <a href="listCompanyPage.html">Manage exchange</a>
                <a href="">Update IPO Details</a>
                <a href="signup.html" id="topic">Logout</a>
            </nav>
<article>

<form:form method="POST" action="/addStock"
  modelAttribute="stock">
	
    
     <p id="body-heading">Create a new Stock Exchange</p>
           <table class="insert-table">
               
                <tr>
                    <td><label>Stock Exchange Name</label></td>
                    <td><form:input type="text"  path="stockExchangeName"/></td>
                    <div class="has-error">
                        <form:errors path="stockExchangeName" class="text-danger"/>
                    </div>
                </tr>
                <tr>
                    <td><label>Brief</label></td>
                    <td><form:input type="text" path="brief"/></td>
                    <div class="has-error">
                        <form:errors path="brief" class="text-danger"/>
                    </div>
                </tr>
                <tr>
                    <td><label>Contact Address</label></td>
                    <td><form:input type="text" path="contactAddress"/></td>
                    <div class="has-error">
                        <form:errors path="contactAddress" class="text-danger"/>
                    </div>
                </tr>
                
                <tr>
                    <td><label>Remarks</label></td>
                    <td><form:input type="text" path="remarks"/></td>
                    <div class="has-error">
                        <form:errors path="remarks" class="text-danger"/>
                    </div>
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