<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<div id="aside">

	<%
		String asideTitle1 = "메뉴";
		String asideTitle2 = "최근글";
	%>

	<h3><%=asideTitle1%></h3>
	<ul>
		<%
			for (int i = 1; i <= 5; i++) {
				out.println("<li>메뉴" + i + "</li>");
			}
		%>
	</ul>

	<h3><%=asideTitle2%></h3>
	<ul>
		<%
			for (int i = 1; i <= 5; i++) {
				out.println("<li>메뉴" + i + "</li>");
			}
		%>
	</ul>

</div>