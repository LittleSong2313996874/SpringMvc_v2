<%@ page language="java" pageEncoding="UTF-8"%>
<%--引入JSTL核心标签库 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>显示用户信息</title>
    <style type="text/css">
        table,td{
            border: 1px solid;
            border-collapse: collapse;
        }
    </style>
</head>
<body>
<br/>
<br/>
<table border="2" align="center">
    <tr>
        <th>用户ID</th>
        <th>用户名</th>
        <th>性别</th>
        <th>年龄</th>
        <th>毕业院校</th>
        <th>师兄</th>
        <th><a href="${pageContext.request.contextPath}/jsp/welcome.jsp">返回首页 </a></th>
    </tr>
        <tr>
            <td>${personOne.id}</td>
            <td>${personOne.NAME}</td>
            <td>${personOne.gender}</td>
            <td>${personOne.age}</td>
            <td>${personOne.graduation}</td>
            <td>${personOne.senior}</td>

        </tr>
</table>

</body>
</html>