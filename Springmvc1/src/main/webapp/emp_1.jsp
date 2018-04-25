<%@ page language="java" pageEncoding="UTF-8"%>
<!-- 支持EL表达式 -->
<%@ page isELIgnored="false" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <body>
    
	<form action="${pageContext.request.contextPath}/User3/register.action" method="POST">
		<table border="2" align="center">
			<caption><h2>用户注册</h2></caption>
			<tr>
				<th>姓名</th>
				<td><input type="text" name="username"/></td>
			</tr>
			<tr>
				<th>月薪</th>
				<td><input type="text" name="salary" /></td>
			</tr>
			<tr>
				<th>入职时间</th>
				<td><input type="text" name="hiredate" value="2015-5-11 12:12:12"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="注册" style="width:111px"/>
				</td>
			</tr>
		</table>	
	</form>	
	
	<hr/>
	
	<form action="${pageContext.request.contextPath}/User3/login.action" method="post">
	<table border="2" align="center">
			<caption><h2>用户登录</h2></caption>
			<tr>
				<th>姓名</th>
				<td><input type="text" name="username"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="登录" style="width:111px"/>
				</td>
			</tr>
		</table>	
	</form>	
	
  </body>
</html>
