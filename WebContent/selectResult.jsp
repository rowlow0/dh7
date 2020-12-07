<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.*" %>
    <%@page import="model.Dto" %>
    <%List<Dto> list=(ArrayList<Dto>)request.getAttribute("list"); %>
    <%System.out.println(list); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>직원 정보 조회 결과</h1>
<hr/>
<table>
<tr>
<td>성명</td>
<td>사번</td>
<td>직급</td>
<td>직책</td>
<td>연락처</td>
<td>소속부서</td>
</tr>
<%for(int i=0;i<list.size();i++){ %>
<tr>
<td><%=list.get(i).getName() %></td>
<td><%=list.get(i).getId() %></td>
<td><%=list.get(i).getPosition() %></td>
<td><%=list.get(i).getDuty() %></td>
<td><%=list.get(i).getPhone() %></td>
<td><%=list.get(i).getDept() %></td>
</tr>
<%} %>
</table>
<input type="button" value="확인" onclick="location.href='index.jsp'"/>
</body>
</html>
