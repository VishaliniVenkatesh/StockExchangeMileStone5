<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" >
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
               
                <a href="/insertIpo">Update IPO Details</a>
                <a href="/login" id="topic">Logout</a>
            </nav>
<article>

<form:form method="POST" action="/insertIpoDetail"
  modelAttribute="ipo">
	
    
     <p id="body-heading">Insert IPO Details</p>
           <table class="insert-table">
                <tr>
                    <td><label>Company Code</label></td>
                    <td><form:input type="text" path="companyCode"  /></td>
                </tr>
                <tr>
                    <td><label>Stock Exchange Id</label></td>
                    <td><form:input type="text" path="stock_exchange_id"/></td>
                </tr>
                <tr>
                    <td><label>Price per share</label></td>
                    <td><form:input type="text" path="price_per_share"/></td>
                </tr>
                  <tr>
                    <td><label>Total No.Of Shares</label></td>
                    <td><form:input type="number" path="totalNoOfShares"  /></td>
                </tr>
                <tr>
                    <td><label>Open Date time</label></td>
                    <td><form:input type="text"  path="openDateTime"/></td>
                </tr>
                
                <tr>
                    <td><label>Remarks</label></td>
                    <td><form:input type="text" path="remarks"/></td>
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