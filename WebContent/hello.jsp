<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Struts2应用</title>
</head>
<body>
	<form action="struts.action" method="post">
		请输入姓名：<input type="text" name="name" /><br/>
		<input type="submit" value="提交"/>
		<s:fielderror fieldName="name"/>
	</form>
</body>
</html>