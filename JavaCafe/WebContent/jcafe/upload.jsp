<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jcafe/upload.jsp</title>
</head>
<body>
 <form method="post" enctype="multipart/form-data" action="../FileUpload">
  <input type="file" name="attch1" /><br>
  <input type="submit" value="파일업로드" />
 </form>
</body>
</html>