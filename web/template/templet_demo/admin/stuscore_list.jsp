<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生分数信息管理</title>
	<script>
		function readyDel(){
		  	return confirm("是否真的删除?");
		}
    </script>
</head>
  <body>
  <s:debug/>
  
  <table border="2">
  <tr><td>stuid<td>stuname<td>java<td>action
    <s:iterator value="stuscores" var="row2">
    <tr>
      <td><s:property value="#row2.stuid"/>
      <td><s:property value="#row2.stuname"/>
      <td><s:property value="#row2.java"/>
      <td>
      <s:url var="delUrl" action="stu_delete">
         <s:param name="stuid" value="#row2.stuid"/>
      </s:url>
      <a href="${delUrl}" onClick="return readyDel();">del</a>
    </s:iterator>
    </table>
    
  </body>
</html>