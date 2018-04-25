<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
<!-- 引入jstl核心标签库 -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>首页</title>
<%--	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">  --%>
  </head>
  
  <body>
  <br/>
  <json:object>
      <json:property name="ID" value="${group_.groupId}"/>
      <json:property name="组名" value="${group_.groupName}"/>
      <json:array name="包含成员" var="item" items="${group_.groupMember}">
          <json:object>
              <json:property name="人员id" value="${item.id}"/>
              <json:property name="姓名" value="${item.NAME}"/>
              <json:property name="性别" value="${item.gender}"/>
              <json:property name="年龄" value="${item.age}"/>
              <json:property name="毕业院校" value="${item.graduation}"/>
              <json:property name="师兄" value="${item.senior}"/>
          </json:object>
      </json:array>
  </json:object>
  <br/>
  <br/>
  <a href="${pageContext.request.contextPath}/jsp/welcome.jsp">返回首页 </a>

  </body>
</html>









