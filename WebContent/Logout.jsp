<jsp:useBean id="login_obj" class = "vaoObjects.LoginBean" scope = "request">
	<jsp:setProperty name = "login_obj" property = "username" value = ""/>
	<jsp:setProperty name = "login_obj" property = "mailid" value = "" />
	<jsp:setProperty name = "login_obj" property = "password" value = ""/>
	<jsp:setProperty name = "login_obj" property = "access" value = ""/>
</jsp:useBean>

<jsp:forward page = "Login.jsp"/>