<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" >
</head>
<body>
<header>
        <img src="images/logo.png" alt="no image" width="70px" height="70px;"> <p id="heading">Stock Market </p>
       </header>
         <nav>
                <a href="#">Import Data</a>
        
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

<footer>
        <p id="ftext">Copyright&copy; 2019</p>
    </footer>
</body>
</html>