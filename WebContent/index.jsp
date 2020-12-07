<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>인사관리시스템</h1>
<fieldset>
<legend>인사관리 메인메뉴</legend>
<input type="button" value="조회" onclick="location.href='select.jsp'"/>
<input type="button" value="사원등록" onclick="location.href='insert.jsp'"/>
<input type="button" value="정보변경" onclick="location.href='update.jsp'"/>
<input type="button" value="퇴사처리" onclick="location.href='delete.jsp'"/>
<input type="button" value="종료" onclick="window.close()"/>
</fieldset>
<script>
</script>
</body>
</html>