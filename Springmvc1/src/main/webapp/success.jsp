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
    <title>第二次用，请多指教</title>
</head>
<body>

    是的，你访问到我了。。/success.jap<br/>
    ${requestScope.message}<br/>


<%
    for (int i = 0; i < 10; i++) {
        System.out.println("嘻嘻");
    }
%>
</body>
</html>
