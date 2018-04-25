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
<c:set var="contextpath" value="${pageContext.request.contextPath}" />

<a href="${contextpath}/taskUser/jsontest">GetJson</a>
<table border="2" align="center">
    <tr>
        <td>用户ID</td>
        <td>用户名</td>
        <td>性别</td>
        <td>年龄</td>
        <td>毕业院校</td>
        <td>师兄</td>
        <td><a href="${contextpath}/jsp/welcome.jsp">返回首页 </a></td>
    </tr>
    <%--遍历lstUsers集合中的User对象 --%>
    <c:forEach var="user" items="${allUser}">
        <tr>
            <td>${user.id}</td>
            <td>${user.NAME}</td>
            <td>${user.gender}</td>
            <td>${user.age}</td>
            <td>${user.graduation}</td>
            <td>${user.senior}</td>
            <td>
                <form action="${contextpath}/taskUser/prepare_update/${user.id}" method="post">
                    <input type="submit" value="修改"/>
                </form>

                <form action="${contextpath}/taskUser/delete/${user.id}" method="post">
                    <input type="hidden" name="_method" value="DELETE" />
                    <%--把id设为隐藏域，只有name的值和controller对于方法的形参一致，会自动赋值进去
                    <input type="hidden" name="id" value="${user.id}"/>--%>
                    <input type="submit" value="删除"/>
                </form>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>