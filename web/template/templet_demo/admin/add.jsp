<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>add</title>
<s:head/>
</head>
<body>
<h1>do add</h1>

	<s:form action="stu_save.action">
		<s:textfield name="ss.stuid" label="学号"></s:textfield>    
	    <s:textfield name="ss.stuname" label="姓名"></s:textfield> 
	    <s:textfield name="ss.java" label="Java"></s:textfield> 
	    <s:submit value="提交"></s:submit>  
	</s:form>  

</body>
</html>