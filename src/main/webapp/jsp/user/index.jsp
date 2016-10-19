<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@ taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>index.jsp</title>
</head>
<body>
	<s:form action="save" method="post" namespace="/user">
		<div style="margin-left: 300px;margin-top: 200px">
			<s:textfield name="name" label="姓名："></s:textfield>
			<s:password name="password" label="密码："></s:password>
			<s:submit value="登录"></s:submit>
		</div>
	</s:form>
</body>
</html>