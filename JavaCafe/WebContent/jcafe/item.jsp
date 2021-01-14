<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jcafe/item.jsp</title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<%
	String itemNo = request.getParameter("itemNo");
%>
<script>
	$(function (){
		$.ajax({
			url : '../GetProductServlet',
			data: {item_no : "<%=itemNo%>"},
			dataType: 'json',
			success: function(result){
				console.log(result);
				$('#item_no').val(result.item_no);
				$('#item').val(result.item);
			},
			erorr: function(){
				console.log(reject);
			}
		});
		
		$('#btnChange').on('click', function(){
			
		});
	});
</script>
</head>
<body>
<form>
	<input type="text" id="item_no" name="item_no">
	<input type="text" id="item" name="item">
	<input type="submit" id="btnChange" name="수정">
</form>
</body>
</html>