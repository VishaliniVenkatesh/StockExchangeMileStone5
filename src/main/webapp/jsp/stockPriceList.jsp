<%@ page language="java" contentType="text/html; charset=UTF-8"
 import="java.util.*,com.demo.SpringMVCBoot.model.*"    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
System.out.println("hai");
List stockPriceList=(List)request.getAttribute("stockPriceList");
System.out.println(stockPriceList);
System.out.println("hafdi");
%>

<table border="2">
<tr>
<td>Stock id<td>
<td>Price</td>
<td>Date</td>
<td>CEO</td>
<td>Company Name</td>
<td>Stock Exchange Name</td>
</tr>

<% for(int i=0;i<stockPriceList.size();i++){
	StockPrice stock=(StockPrice)stockPriceList.get(i);
	%>
<tr>

<td><%= stock.getStockId() %><td>
<td><%= stock.getCurrentPrice() %></td>
<td><%= stock.getDate() %></td>
<td><%= stock.getCompany().getCeo() %></td>
<td><%= stock.getCompany().getCompanyName() %></td>
<td><%= stock.getStockExchange().getStockExchangeName() %></td>



</tr>
<% }%>

</table>

</body>
</html>