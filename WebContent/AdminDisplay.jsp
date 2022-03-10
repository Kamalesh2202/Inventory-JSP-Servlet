<jsp:useBean id = "login_obj" class = "vaoObjects.LoginBean" scope = "request" />

<html>
	<head>
		<link rel = "stylesheet" href = "${pageContext.request.contextPath}/CSS/pages.css"/>
		<title>Admin Display</title>
		<script type="text/javascript">
			function getTable() {
				var ob = new XMLHttpRequest();

				ob.onreadystatechange = function ss() {
					if (ob.readyState == 4) {
						document.getElementById("Table").innerHTML = ob.responseText;
					}
				}
				ob.open("GET", "loadTable", false);
				ob.send();
				return true;
			}
		</script>
	</head>
	<body onload = "getTable()">
		<div class = "navi">
			<div>
				<h2>${login_obj.username}</h2>
			</div>
			<div>
				<ul>
					<li><a href = "AdminDisplay.jsp">Display</a></li>
					<li><a href = "AddStocks.jsp">Add Stocks</a></li>
					<li><a href = "Profit.jsp">Profit</a></li>
					<li><a href = "Track.jsp">Track Invoice</a></li>
					<li><a href = "Logout.jsp">Logout</a></li>
				</ul>
			</div>
		</div>
		<div>
			<form>
				<label >Search</label>
				<input type = "text" name = "Search" required>
				<input type = "submit" value = "Search" name = "submit">
			</form>
		</div>
		<div id = "Table">
		
		</div>
	</body>
</html>