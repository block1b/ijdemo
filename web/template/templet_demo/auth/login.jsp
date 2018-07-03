<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login</title>
<s:head/>
</head>
<body>
<h1>登陆</h1>
<br>
<s:form action="login">
        <s:textfield name="loger.name" label="%{getText('loger.name')}" requiredLabel="true" requiredPosition="left"></s:textfield>
        <s:textfield name="loger.pass" label="%{getText('loger.pass')}" requiredLabel="true" requiredPosition="left"></s:textfield>
        <s:submit value="确定"></s:submit>
        
</s:form>
</body>
</html>