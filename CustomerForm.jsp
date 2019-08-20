<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
</head>
<body>
<%-- <s:form action="saveCustomer" modelAttribute="customer">
Enter Customer ID: <s:input path="customerid"/>
<s:errors path="customerid"/>
<br>
Enter Customer Name: <s:input path="customername"/>
<s:errors path="customername"/>
<br>
<input type="submit" value="Save"/>
</s:form>
 --%>
 <%-- <s:form action="updateCustomer" modelAttribute="customer">
Enter Customer ID: <s:input path="customerid"/>
<br>

<input type="submit" value="Update"/>
</s:form>  --%>
<%-- <s:form action="deleteCustomer" modelAttribute="customer">
Enter Customer ID: <s:input path="customerid"/>
<br>

<input type="submit" value="Delete"/>
</s:form>  --%>

<%-- <s:form action="displayCustomer" modelAttribute="customer">
<br>
<input type="submit" value="Display"/>
</s:form>
 --%>
<s:form action="displayCustomerbyId" modelAttribute="customer">
Enter Customer ID: <s:input path="customerid"/>
<br>
<br>
<input type="submit" value="DisplayById"/>
</s:form>
</body>
</html>