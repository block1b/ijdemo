<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
// out.println(path);
// out.println(basePath);
%>
<html>
<head>
	<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>增删该查</title>
</head>
<body>
<h1>业务页面</h1>
	<a href="admin/add.jsp">增加</a><br>
	<a href="">删除</a><br>
	<a href="">修改</a><br>
	<a href="stu_query.action">查询</a><br>
<!-- 	<a href="stu_query.action">学生分数管理</a><br> -->
</body>
</html>