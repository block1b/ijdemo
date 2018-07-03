<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>save succeed</title>
<s:head/>
</head>
<body>

保存成功
<s:debug></s:debug>
<table border="2">
  <tr>
  <td>stuid<td>stuname<td>java
  <s:push value="ss">
	  <tr>
	  <td><s:property value="stuid"/>
	  <td><s:property value="stuname"/>
	  <td><s:property value="java"/>
  </s:push>
  
</table>

</body>
</html>