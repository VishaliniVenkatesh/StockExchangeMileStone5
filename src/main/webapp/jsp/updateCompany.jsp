<%@ page language="java" contentType="text/html; charset=ISO-8859-1" import="java.util.*,com.demo.SpringMVCBoot.model.Company"   
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" >
<title>Insert title here</title>
</head>
<body>
<header>
        <img src="images/logo.png" alt="no image" width="70px" height="70px;"> <p id="heading">Stock Market </p>
       </header>
         <nav>
                <a href="importStockPage.html">Import Data</a>
        
                <div class="dropdown">
                    <button class="dropbtn">Manage Company
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-content">
                        <a href="/insertCompany">Add Company</a>
                        <a href="/companyList">Update Company</a>
                    </div>
                </div>
                 <div class="dropdown">
                    <button class="dropbtn">Manage exchange
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-content">
                        <a href="/addStock">Add New</a>
                        <a href="/stockList">List Stock Exchange</a>
                    </div>
                </div>
               
                         <a href="/insertIpo">Insert IPO Details</a>
                <a href="/loginForm" id="topic">Logout</a>
            </nav>
<%
List companyList=(List)request.getAttribute("companyList");
System.out.println(companyList);
%>

<form:form method="POST" action="/insertCompany"
  modelAttribute="company">
	
    
     <p id="body-heading">Create a new company</p>
     <table class="insert-table">
           <% for(int i=0;i<companyList.size();i++){
				Company e=(Company)companyList.get(i);
			%>
	 			<tr>
                    <td><label>Company code</label></td>
                    <td><form:input path="companyCode"  value="<%=e.getCompanyCode() %>" readonly="true"/></td>
                    <td><div class="has-error">
                        <form:errors path="companyCode" class="text-danger"/>
                    </div></td>
                </tr>
                <tr>
                    <td><label>Company Name</label></td>
                    <td><form:input path="companyName"  value="<%=e.getCompanyName() %>"/></td>
                    <td><div class="has-error">
                        <form:errors path="companyName" class="text-danger"/>
                    </div></td>
                </tr>
                <tr>
                    <td><label>CEO Name</label></td>
                    <td><form:input  path="ceo" value="<%=e.getCeo() %>"/></td>
                    <td><div class="has-error">
                        <form:errors path="ceo" class="text-danger"/>
                    </div></td>
                </tr>
                <tr>
                    <td><label>Board Members</label></td>
                    <td><form:input path="boardOfDirectors" value="<%=e.getBoardOfDirectors() %>"/></td>
                    <td><div class="has-error">
                        <form:errors path="boardOfDirectors" class="text-danger"/>
                    </div></td>
                </tr>
                <tr>
                    <td><label>Sector Id</label></td>
                    <td><form:input  path="sector" value="<%=e.getSector() %>"/></td>
                    <td><div class="has-error">
                        <form:errors path="sector" class="text-danger"/>
                    </div></td>
                </tr>
                <tr>
                    <td><label>TurnOver</label></td>
                    <td><form:input type="number" path="turnover" value="<%=e.getTurnover() %>" /></td>
                    <td><div class="has-error">
                        <form:errors path="turnover" class="text-danger"/>
                    </div></td>
                </tr>
                 <tr>
                    <td><label>Stock Code</label></td>
                    <td><form:input type="number" path="stockCode"  value="<%=e.getStockCode() %>"/></td>
                    <td><div class="has-error">
                        <form:errors path="stockCode" class="text-danger"/>
                    </div></td>
                </tr>
                <tr>
                    <td><label>Brief Description</label></td>
                    <td><form:input  path="briefWriteup" value="<%=e.getBriefWriteup() %>"/></td>
                    <td><div class="has-error">
                        <form:errors path="briefWriteup" class="text-danger"/>
                    </div></td>
                </tr>
                
                <tr>
                    <td><input type="submit"  value="Save" id="button" /></td>
                </tr>
                <% }%>
            </table>
            
</form:form>
 <footer>
        <p id="ftext">Copyright&copy; 2019</p>
 </footer>



</body>
</html>