<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    import="java.util.*,com.demo.SpringMVCBoot.model.StockExchange" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" >
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
    <article>
    <%
List stockList=(List)request.getAttribute("stockList");
System.out.println(stockList);
%>

<table class="insert-table">

<tr>

<th>Stock name</th>
<th>Brief</th>
<th>Contact Address</th>
<th>Remarks</th>
</tr>

<% for(int i=0;i<stockList.size();i++){
	StockExchange se=(StockExchange)stockList.get(i);
	%>
<tr>

<td><%= se.getStockExchangeName() %></td>
<td><%= se.getBrief() %></td>
<td><%= se.getContactAddress() %></td>
<td><%= se.getRemarks() %></td>



</tr>
<% }%>

</table>

<footer>
        <p id="ftext">Copyright&copy; 2019</p>
    </footer>


</body>

</html>