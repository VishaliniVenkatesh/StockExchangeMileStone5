<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of companies</title>
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
                        <a href="insertCompanyPage.html">Add Company</a>
                        <a href="#">Update Company</a>
                    </div>
                </div>
                <a href="list-companies.html">Manage exchange</a>
                <a href="">Update IPO Details</a>
                <a href="admin-signout.html" id="topic">Logout</a>
            </nav>
    <p id="body-heading">List of Companies</p>
    <table class="table">
        <tr>
            <th></th>
            <th></th>
            <th></th>
            <th></th>

        </tr>
        <tr>
            <td>1</td>
            <td>Company1</td>
            <td>BSE,NSE</td>
            <td>XXXXXXXX</td>
            <td><button type="button" id="button">Edit</button></td>
        </tr>
        <tr>
                <td>2</td>
                <td>Company2</td>
                <td>BSE</td>
                <td>YYYYYYY</td>
                <td><button type="button" id="button">Edit</button></td>
            </tr>
    </table>
    <footer>
        <p id="ftext">Copyright&copy; 2019</p>
    </footer>
</body>
</html>