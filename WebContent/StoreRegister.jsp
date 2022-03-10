<%@ page import = "daoObjects.dbConnect" %>
<%@ page import = "daoObjects.Register" %>
<jsp:useBean id = "register_obj" class = "vaoObjects.LoginBean" scope = "request"/>

<%
	Register reg = new Register();
	try{
		boolean flag = reg.register(register_obj);
		if(flag){
			
		}
	}catch(Exception e){
		e.printStackTrace();
	}
%>
<jsp:forward page="Login.jsp"/>