<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>인사관리 퇴사처리 화면</h1>
<fieldset>
<legend>인사관리 사원정보 변경</legend>
<form action="Servlet">
<input type="hidden" value="d" name="flag"/>
<table>
<tr><td>성명 :</td><td><input type="text" name="name"/></td></tr>
<tr><td>사원번호 :</td><td><input type="text" name="id"/></td></tr>
<tr><td colspan="2"><input type="submit" value="삭제"/>
<input type="button" value="취소" onclick="location.href='index.jsp'"/>
</td></tr>
</table>
</form>
</fieldset>
</body>
</html>