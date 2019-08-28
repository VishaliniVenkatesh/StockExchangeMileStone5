<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 import="java.util.*,com.demo.SpringMVCBoot.model.IPOPlanned"    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" >
</head>
<body>
<header>
        
        <img src="images/logo.png" alt="no image" width="70px" height="70px;"> <p id="heading">Stock Market</p>
        
             
         </header>
         <nav>
                
                <a href="/loginForm" id="topic">Logout</a>
            </nav>
    <p id="body-heading">List of IPO Details</p>

<%
List ipoList=(List)request.getAttribute("IPODetailsList");
System.out.println(ipoList);
%>


 <table class="insert-table">

<tr>

<th>Company Code</th>
<th>Stock Exchange Id</th>
<th>Price per share</th>
<th>Open Date time</th>
<th>Total No.Of Shares</th>
<th>Remarks</th>
</tr>

<% for(int i=0;i<ipoList.size();i++){
	IPOPlanned ipo=(IPOPlanned)ipoList.get(i);
	%>
<tr>

<td><%= ipo.getCompanyCode() %></td>
<td><%= ipo.getStock_exchange_id()%></td>
<td><%= ipo.getPrice_per_share() %></td>
<td><%= ipo.getOpenDateTime() %></td>
<td><%= ipo.getTotalNoOfShares() %></td>
<td><%= ipo.getRemarks() %>

</tr>
<% }%>

</table>

<footer>
        <p id="ftext">Copyright&copy; 2019</p>
    </footer>

</body>
</html>