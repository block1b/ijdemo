<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login welcome</title>
</head>
<body>
<h1>登陆成功</h1>
<h2>登陆者信息</h2>
<br>
<s:debug></s:debug>
<%-- 登陆用户：${sessionScope.loger.getName()} --%>
<br>

<s:text name="msg.loger">
	<s:param><s:property value="#session.loger.name"/></s:param>
</s:text>
</body>
</html>