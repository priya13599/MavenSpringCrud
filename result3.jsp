<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th>CustomerId</th>
<th>CustomerName</th>
</tr>



<%-- <c:forEach var="customer" items="${cust}">
    <tbody>
      <tr>
        <td>${customer.getCustomerid()}</td>
        <td>${customer.getCustomername()}</td>
        </tr>
        </tbody>
        </c:forEach>
 --%>
 
 <tbody>
      <tr>
        <td>${cust.getCustomerid()}</td>
        <td>${cust.getCustomername()}</td>
        </tr>
        </tbody>

</body>
</html>