<%@ page language="java" contentType="text/html; charset=utf-8" %>

<html>
	<head>
		<title>cos 라이브러리를 이용한 파일 업로드 구현</title>
	</head>
	<body>
		<h3>cos 라이브러리를 이용한 파일 업로드 구현</h3>
		<form	action="fileUploadCos.jsp" enctype="multipart/form-data" method="post">
			올린이 : <input type="text" name="name"><br/>
			파일명 : <input type="file" name="fileName"><br/>
			<input type="submit" value="전송">			
		</form>
	</body>
</html>