<jsp:useBean id="login_obj" class = "vaoObjects.LoginBean" scope = "request">
	<jsp:setProperty name = "login_obj" param = "uname" property = "username"/>
	<jsp:setProperty name = "login_obj" property = "mailid" value = "" />
	<jsp:setProperty name = "login_obj" param = "password" property = "password"/>
	<jsp:setProperty name = "login_obj" property = "access" value = ""/>
</jsp:useBean>

<jsp:forward page = "StoreLogin.jsp"/>