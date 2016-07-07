<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>

<title>login</title>

</head>



<body>
	<p>username:
		<s:property value="#session.username"/>
	</p>
	<p>password:
		<s:property value="#session.password"/>
	</p>
</body>
</html>
