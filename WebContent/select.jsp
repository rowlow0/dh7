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
<form action="Servlet">
<input type="hidden" name="flag" value="s"/>
<fieldset>
<legend>인사관리 조회화면</legend>
<input type="radio" value="checkId" name="check"/>사원번호로 조회<input type="text" name="id"/><br>
<input type="radio" value="checkDept" name="check"/>부서명으로 조회<select name="dept">
<option value="인사부">인사</option>
<option value="기획부">기획</option>
<option value="홍보부">홍보</option>
<option value="영업부">영업</option>
<option value="경리부">경리</option>
</select>
<input type="submit" value="조회"/><input type="button" value="취소" onclick="location.href='index.jsp'"/>
</fieldset>
</form>

<script>
</script>
</body>
</html>