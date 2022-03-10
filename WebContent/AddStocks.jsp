<html>
	<head>
		<title>Add Stocks</title>
		<script type = "text/javascript">
			function getSeller(){
				var ob = new XMLHttpRequest();
				ob.onreadystatechange = function ss(){
					if(ob.readyState == 4){
						document.getElementById("sellerList").innerHTML = ob.responseText;
					}
				}
				ob.open("GET","loadSeller",false);
				ob.send();
				return true;
			}
			
			function getCategory(){
				var ob = new XMLHttpRequest();
				ob.onreadystatechange = function se(){
					if(ob.readyState == 4){
						document.getElementById("categoryId").innerHTML = ob.responseText;
					}
				}
				ob.open("GET","loadCategory",false);
				ob.send();
				return true;
			}
			
			function load(){
				getSeller();
				getCategory();
			}
		</script>
	</head>
	<body onload = "load()">
		<form action="" method = "post">
			<label for = "sellerlist">Seller</label>	
			<div id = 'sellerList'>
			<!-- Seller List -->
			</div>
			<label for = "purchaseid">Purchase ID</label>
			<input type = "text" name = "purchaseid" id = "purchaseid" disabled = "true">
			<label for = "date">Date</label>
			<input type = "text" name = "date" id = "date" disabled = "true">
			<input type = "submit" name = "upload" value = "Upload">	
		</form>
		<form>
			<label for = "stockId">Stock Id</label>
			<input type = "text" name = "stockId" id = "stockId">
			<label for = "stockName">Stock Name</label>
			<input type = "text" name = "stockName" id = "stockId"></br>
			<label for = "stockCategory">Category</label>
			<div id = "categoryId">
			<!-- Category List -->
			</div>
			<label for = "gst">GST</label>
			<input type = "text" name = "gst" id = "gst" disabled = "true">
			<label for = "expdate">EXP Date</label>
			<input type = >
			<label for = "rate">Rate</label>
			<input type = "text" name = "rate" id = "rate">
			<label for = "quantity">Quantity</label>
			<input type = "text" name = "quantity" id = "quantity">
			<input type = "submit" value = "Add to Stock">
		</form>
	</body>
</html>