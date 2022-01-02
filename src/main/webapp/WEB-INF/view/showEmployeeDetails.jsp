<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>showEmployeeDetails</title>
</head>
<body>
<h2>Dear Employee, you are WELCOME!!!</h2>
<br>
<%--Your name: ${param.employeeName}--%>
<%--Your name: ${nameAttribute}--%>
Your name: ${employee.name}
<br>
Your surname: ${employee.surname}
<br>
Your salary: ${employee.salary}
<br>
Your department: ${employee.department}
<br>
Your car: ${employee.carBrand}
<br>
Language(s):
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li>
            ${lang}
        </li>
    </c:forEach>
</ul>

Your email: ${employee.email}
</body>
</html>
