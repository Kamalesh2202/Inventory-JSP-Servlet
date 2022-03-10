<html>
	<head>
		<title>Register</title>
	</head>
	<body>
		<div align="center">
	    	<h1>Register</h1>
			<form action = "RegisterProcess.jsp" method = "post">
				<label for="username">Username</label></br>
        		<input type="text" name="uname" id="uname"></br>
        		<label for="email">Email</label></br>
        		<input type="email" name="email" id="email"></br>
        		<label for="password">Password</label></br>
        		<input type="password" name="password" id="password"></br>
        		<input type="submit" name="register" value="Register"></br>
        		</br>
			</form>
			<form action = "Login.jsp">
				<input type = "submit" value = "Login"/>
			</form>
		</div>
	</body>
</html>