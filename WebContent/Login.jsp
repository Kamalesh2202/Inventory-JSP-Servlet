<html>
	<head>
		<title>Login</title>
	</head>
	<body>
		<div align="center">
	    	<h1>Login</h1>
			<form action = "LoginProcess.jsp" method="post">
				<label for="username">Username</label></br>
		        <input type="text" name="uname" id="uname"></br>
		        <label for="password">Password</label></br>
		        <input type="password" name="password" id="password"></br>
		        </br>
		        <input type="submit" name="login" value="Login"></br>
			</form>
			<form action = "Register.jsp">
				<input type = "submit" value = "Register"/>
			</form>
		</div>
	</body>
</html>