<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文件下载</title>
</head>
<body>
<a href="download.action?downPath=a.gif">下载动图</a>
<br><br>
<a href="download.action?downPath=photo2.png">下载图片2</a>
<br><br>
<h1>tomcat8.5.20不允许url中出现中文！！！</h1>
<!-- <a href="download.action?downPath=盾.gif">下载文件1</a> -->
<br><br>
<s:url var="url" action="download.action">   
	<s:param name="downPath" >盾.gif</s:param>   
</s:url>     
      <!--使用上面定义的url-->   
<s:a href="%{url}">测试连接</s:a>
</body>
</html>