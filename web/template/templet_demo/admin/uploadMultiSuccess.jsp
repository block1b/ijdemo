<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>上传多文件成功</title>
</head>
<body>
图1：<img alt="1" src="<s:property value="'file/' + headImageFileName[0]"/>"/><br>
图2：<img alt="2" src="<s:property value="'file/' + headImageFileName[1]"/>"/><br>
图3：<img alt="3" src="<s:property value="'file/' + headImageFileName[2]"/>"/><br>
</body>
</html>