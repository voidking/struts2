<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/struts-dojo-tags" prefix="sx" %>
<html>
<head>
	<s:head />
	<sx:head/>
</head>
<body>
	<h3>添加学生信息</h3>
	<s:form action="save" namespace="/" method="post" theme="simple">
		<table>
			<tr>
				<td>学号（六位数）：</td>
				<td><s:textfield name="xs.xh"></s:textfield></td>
			</tr>
			<tr>
				<td>姓名：</td>
				<td><s:textfield name="xs.xm" ></s:textfield></td>
			</tr>
			<tr>
				<td>性别：</td>
				<td><s:radio name="xs.xb" list="#{true:'男',false:'女'}" value="true"></s:radio></td>
			</tr>
			<tr>
				<td width="70">出生时间:</td>
				<td><sx:datetimepicker name="xs.cssj" id="cssj"	displayFormat="yyyy-MM-dd"></sx:datetimepicker></td>
			</tr>
			<tr>
				<td>专业ID：</td>
				<td><s:textfield name="xs.zy_id" label="专业"></s:textfield></td>
			</tr>
			<tr>
				<td>备注：</td>
				<td><s:textarea name="xs.bz" label="备注"></s:textarea></td>
			</tr>
			<tr>
				<td><s:submit value="添加"></s:submit></td>
				<td><s:reset value="重置"></s:reset></td>
			</tr>
		</table>
	</s:form>
</body>
</html>
