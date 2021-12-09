<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	// application 객체의 속성 값을 가져온다!
	String strcnt = (String) application.getAttribute("cnt");
	//Object 를 반환하기 때문에 형변환

	int cnt = strcnt == null ? 0 : Integer.parseInt(strcnt);
	/* int cnt = strcnt == null ? 0 : Integer.valueOf(strcnt); */

	// application 객체의 속성 값 저장!
	application.setAttribute("cnt", String.valueOf(++cnt));
	// 증가를 시키고 들어가야 하기 때문에 cnt++ 이 아니다
%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>
		방문자 수
		<%=cnt%></h1>

</body>
</html>