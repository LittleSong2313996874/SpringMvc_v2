<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!-- 引入jstl核心标签库 -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<c:set var="contextpath" value="${pageContext.request.contextPath}" />
<html>
  <head>
    
    <title>首页</title>
<%--	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">  --%>
  </head>
  
  <body>
  ${contextpath}<br/>

		<a href="${contextpath}/taskUser/getAll">展示全部</a>
		<a href="${contextpath}/jsp/TryToAdd.jsp">增加 </a>
  <br/>
  <br/>
  <form action="${contextpath}/taskUser/getbyID" method="get">
      <table border="1" >
          <h5>想找谁，输入id我帮你</h5>
          <tr>
              <th>根据id查找</th>
              <td><input type="text" name="id"/></td>
              <td colspan="2" align="center">
                  <input type="submit" value="搜索" style="width:60px"/>
              </td>
          </tr>
      </table>
  </form>
  <form action="${contextpath}/taskUser/jsonbyid" method="get">
      <table border="1" >
          <tr>
              <th>根据id查找</th>
              <td><input type="text" name="id"/></td>
              <td colspan="1" align="center">
                  <input type="submit" value="GetJson" style="width:60px"/>
              </td>
          </tr>
      </table>
  </form>


  </body>
</html>









