<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>askEmployeeDetails</title>
</head>
<h2>Dear Employee, please enter your details</h2>
<%--<form action="showDetails" method="get">--%>
<%--    <input type = "text" name="employeeName" placeholder="Write your name"/>--%>
<%--    <input type="submit"/>--%>
<%--</form>--%>

<form:form action="showDetails" modelAttribute="employee">
    Name <form:input path="name"/>
    <form:errors path="name" cssStyle="color: red"/>
    <br>
    Surname <form:input path="surname"/>
    <form:errors path="surname" cssStyle="color: red"/>
    <br>
    Salary <form:input path="salary"/>
    <form:errors path="salary" cssStyle="color: red"/>
    <br>
    Department <form:select path="department">
    <form:errors path="department" cssStyle="color: red"/>
    <%--    <form:option value="Information Technology" label="IT"/>--%>
    <%--    <form:option value="Human Resources" label="HR"/>--%>
    <%--    <form:option value="Sales" label="Sales"/>--%>
    <form:options items="${employee.departments}"/>
</form:select>
    <br>
    Which car do you want?
    <%--    BMW <form:radiobutton path="carBrand" value="BMW"/>--%>
    <%--    AUDI <form:radiobutton path="carBrand" value="Audi"/>--%>
    <%--    LADA <form:radiobutton path="carBrand" value="Lada"/>--%>
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <br>
    <%--    EN <form:checkbox path="languages" value="English"/>--%>
    <%--    RUS <form:checkbox path="languages" value="Russian"/>--%>
    <%--    UK<form:checkbox path="languages" value="Ukrainian"/>--%>

    <form:checkboxes path="languages" items="${employee.languageMap}"/>
    <br>
    Email: <form:input path="email"/>
    <form:errors path="email" cssStyle="color: red"/>
    <br>
    <input type="submit" value="OK">
</form:form>
<body>

</body>
</html>