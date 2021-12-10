<%@page import="util.CookieBox"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	CookieBox cookieBox = new CookieBox(request);
%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%--
	
	http://localhost:8080/FirstWeb/cookie/member/loginForm.jsp
	이것을
	/FirstWeb/cookie/member/login.jsp
	이렇게 쓸 수 있다.
	
	하지만 /FirstWeb 이 경로가 바뀔 수 있으므로 아래를 써 주어야 한다.
	<%=request.getContextPath()%>
	
	--%>

	<!-- <form action="/first/cookie/member/login.jsp"> -->
	<form action="<%=request.getContextPath()%>/cookie/member/login.jsp"
		method="post">
		<table>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="id"
					value="<%=(cookieBox.exists("saveId")) ? cookieBox.getValue("saveId") : ""%>"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="pw"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="checkbox" name="saveId"
					<%=(cookieBox.exists("saveId")) ? "checked" : ""%>>아이디 저장하기</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>