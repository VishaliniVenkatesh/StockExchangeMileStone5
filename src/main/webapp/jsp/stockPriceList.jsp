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
List stockPriceList=(List)request.getAttribute("stockPriceList");
%>

<table border="2">
<tr>
<td>Stock id</td>
<td>Company Code</td>
<td>Price</td>
<td>Stock Exchange Id</td>
<td>Date</td>
</tr>

<% for(int i=0;i<stockPriceList.size();i++){
	StockPrice stock=(StockPrice)stockPriceList.get(i);
	%>
<tr>

<td><%= stock.getStockId() %></td>
<td><%= stock.getCompanyCode() %></td>
<td><%= stock.getCurrentPrice() %></td>
<td><%= stock.getStockExchangeId() %></td>
<td><%= stock.getDate() %></td>

</tr>
<% }%>

</table>

</body>
</html>