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
    <title>Failure To Insert</title>
</head>
<body>

    没有操作成功，我们可能遭遇了些状况: <br/>
    ${message}<br/>
    <a href="${pageContext.request.contextPath}/jsp/welcome.jsp">返回首页 </a>


</body>
</html>
