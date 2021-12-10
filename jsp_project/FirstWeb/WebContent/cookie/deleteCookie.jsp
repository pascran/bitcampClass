<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@page import="util.CookieBox"%>

<%
	Cookie[] cookies = request.getCookies();

	//2021.12.09
	CookieBox cookieBox = new CookieBox(request);
%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>쿠키 값 수정</h1>
	<hr>
	<h3>
		<%
			// 쿠키 검색 -> 쿠키 수정 (같은 이름의 쿠키를 저장하면 됨)
			if (cookies != null) {
				for (int i = 0; i < cookies.length; i++) {
					if (cookies[i].getName().equals("kName")) {
						// 삭제하고자 하는 값을 가지는 쿠키 객체를 생성
						Cookie c = new Cookie("kName", "이강인");

						// 쿠키의 유효시간을 0으로 설정
						c.setMaxAge(0);
						response.addCookie(c);

						break;
						// 같은 이름의 쿠키는 없으므로 찾으면 break
					}
				}
			}
			/////////////////////////////////////////
			// CookieBox 를 이용한 쿠키 삭제
			if(cookieBox.exists("uid")){
				response.addCookie(CookieBox.createCookie("uid", "cool", 0));
			}
		%>

		<a href="viewCookie.jsp">쿠키 보기</a>

	</h3>

</body>
</html>