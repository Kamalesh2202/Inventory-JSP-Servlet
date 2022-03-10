<%@ page import = "daoObjects.Login" %>
<%@ page import = "vaoObjects.LoginBean" %>

<jsp:useBean id = "login_obj" class = "vaoObjects.LoginBean" scope = "request" />

<% 
	Login log = new Login();
	try{
		boolean flag = log.login(login_obj);
		if(flag){
			if(login_obj.getAccess().equals("user")){%>
				<jsp:forward page = "CustomerDisplay.jsp"/>
			<%}else if(login_obj.getAccess().equals("admin")){%>
				<jsp:forward page = "AdminDisplay.jsp"/>
			<%}
		}
	}catch(Exception e){
		e.printStackTrace();
	}

%>