<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>인사관리 사원정보 변경화면</h1>
<fieldset>
<legend>인사관리 사원정보 변경</legend>
<form action="Servlet">
<input type="hidden" value="u" name="flag"/>
<table>
<tr><td>성명 :</td><td><input type="text" name="name"/></td></tr>
<tr><td>사원번호 :</td><td><input type="text" name="id"/></td></tr>
<tr><td>소속부서 :</td><td><input type="text" name="dept"/></td></tr>
<tr><td>직급 :</td><td><input type="text" name="position"/></td></tr>
<tr><td>직책 :</td><td><input type="text" name="duty"/></td></tr>
<tr><td>연락처 :</td><td><input type="text" name="phone"/></td></tr>
<tr><td colspan="2"><input type="submit" value="등록"/>
<input type="button" value="취소" onclick="location.href='index.jsp'"/>
</td></tr>
</table>
</form>
</fieldset>
</body>
</html>