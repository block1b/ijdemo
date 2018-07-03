<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
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
<title>文件上传</title>
<s:head/>
</head>
<body>

<s:form action="upload.action" enctype="multipart/form-data" method="post" theme="simple">  
	<s:file name="headImage" label="头像"/>
	
    <s:submit value="上传"/>
</s:form>

<br><br><br>

<s:form name="uploadsForm" action="uploadmulti.action" 
enctype="multipart/form-data">
	<s:file name="headImage"/>
	<s:file name="headImage"/>
	<s:file name="headImage"/>
	<s:submit/>
</s:form>

</body>
</html>