<%@ page language="java" contentType="text/html; charset=UTF-8"
 import="java.util.*,com.demo.SpringMVCBoot.model.Company"    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" >
<title>Insert title here</title>
</head>
<body>
 <header>
        
        <img src="images/logo.png" alt="no image" width="70px" height="70px;"> <p id="heading">Stock Market</p>
        
         <!-- <div id="text"> -->
             
         </header>
         <nav>
                <a href="importStockPage.html">Import Data</a>
        
                <div class="dropdown">
                    <button class="dropbtn">Manage Company
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-content">
                        <a href="companyForm.jsp">Add Company</a>
                        <a href="#">Update Company</a>
                    </div>
                </div>
                <a href="list-companies.html">Manage exchange</a>
                <a href="">Update IPO Details</a>
                <a href="admin-signout.html" id="topic">Logout</a>
            </nav>
    <p id="body-heading">List of Companies</p>

<%
List companyList=(List)request.getAttribute("companyList");
System.out.println(companyList);
%>


 <table class="insert-table">

<tr>

<th>Company Name</th>
<th>Turn Over</th>
<th>CEO</th>
<th>Board of Directors</th>
<th>Brief Writeup</th>
</tr>

<% for(int i=0;i<companyList.size();i++){
	Company e=(Company)companyList.get(i);
	%>
<tr>

<td><%= e.getCompanyName() %></td>
<td><%= e.getTurnover() %></td>
<td><%= e.getCeo() %></td>
<td><%= e.getBoardOfDirectors() %></td>

<td><%= e.getBriefWriteup() %></td>



</tr>
<% }%>

</table>

<footer>
        <p id="ftext">Copyright&copy; 2019</p>
    </footer>


</body>
</html>