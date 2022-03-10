<jsp:useBean id = "register_obj" class = "vaoObjects.LoginBean" scope = "request">
	<jsp:setProperty name = "register_obj" param = "uname" property = "username"/>
	<jsp:setProperty name = "register_obj" param = "email" property = "mailid"/>
	<jsp:setProperty name = "register_obj" param = "password" property = "password"/>
	<jsp:setProperty name = "register_obj" property = "access" value = "user"/>
</jsp:useBean>
<jsp:forward page = "StoreRegister.jsp"/>