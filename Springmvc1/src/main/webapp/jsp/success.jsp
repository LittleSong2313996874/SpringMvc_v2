<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/18
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!-- 支持EL表达式 -->
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>AllRight</title>
</head>
<body>

    您已成功访问<br/>
    ID为：${message}<br/>

    <td><a href="${pageContext.request.contextPath}/jsp/welcome.jsp">返回首页 </a></td>


</body>
</html>
