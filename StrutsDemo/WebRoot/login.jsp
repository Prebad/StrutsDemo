<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>

<title>login</title>

</head>



<body>
	<s:form action="login">
		<s:textfield key="username" label="用户名" />
		<s:password key="password" label="密码" />
		<s:submit value="登录"/>
	</s:form>
</body>
</html>
