<%@ page language="java" pageEncoding="UTF-8"%>
<!-- 支持EL表达式 -->
<%@ page isELIgnored="false" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <body>
    
	<form action="${pageContext.request.contextPath}/taskUser/update" method="post">
		<table border="2" align="center">
			<caption><h2>用户注册</h2></caption>
			<tr>
				<%--把id设为隐藏域，修改信息不需要修改id --%>
				<input type="hidden" name="id" value="${person.id}"/>
				<th>姓名</th>
				<td><input type="text" name="NAME" value="${person.NAME}"/></td>
			</tr>
			<tr>
				<th>性别</th>
				<td><input type="text" name="gender"value="${person.gender}"/></td>
			</tr>

			<tr>
				<th>年龄</th>
				<td><input type="text" name="age" value="${person.age}"/></td>
			</tr>

			<tr>
				<th>毕业院校</th>
				<td><input type="text" name="graduation" value="${person.graduation}"/></td>
			</tr>
			<tr>
				<th>师兄</th>
				<td><input type="text" name="senior" value="${person.senior}" /></td>
			</tr>

			<tr>
				<td colspan="2" align="center">
					<input type="hidden" name="_method" value="PUT" style="width:111px"/>
					<input type="submit" value="提交" style="width:111px"/>
				</td>
			</tr>
			<tr>
				<td><a href="${pageContext.request.contextPath}/jsp/welcome.jsp">返回首页 </a></td>
			</tr>
		</table>
	</form>	
	
	<hr/>

  </body>
</html>
