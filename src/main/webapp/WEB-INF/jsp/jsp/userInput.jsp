<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>입력화면</title>
</head>
<body>
<!-- name 은 dao에서 가져옴 -->
	<form method="post" action="/jsp/user/insert">
		<label>이름</label> <input type="text" name="name">
		<label>생년월일</label> <input type="text" name="yyyymmdd">
		<label>이메일</label> <input type="text" name="email">
		<label>자기소개</label> <br>
		<textarea rows="5" cols="100" name="introduce"></textarea>
		<button type="submit">입력</button>
	</form>
</body>
</html>