<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>m's blog</title>

<style>

/* 웹폰트 */
@import
	url('https://fonts.googleapis.com/css2?family=Jua&family=Noto+Sans+KR&display=swap')
	;

/* 기본설정 */
* {
	margin: 0;
	padding: 0;
	font-family: 'Noto Sans KR', sans-serif;
}

body {
	background-color: #eee;
}

.margin_tb_5 {
	margin-top: 5px;
	margin-bottom: 10px;
}

.font_gray {
	color: #666;
}

.lineheight_180per {
	line-height: 180%;
}

/* 타이틀 폰트 */
.title_font {
	font-family: 'Jua', sans-serif;
}

/* main_wrap 설정 */
#main_wrap {
	background-color: white;
	width: 778px;
	/* height: 300px; */
	padding: 10px;
	border: 1px solid #ccc;
	border-radius: 5px;
	margin: 10px auto;
	/* 상하/좌우 */
	box-shadow: 3px 3px 10px #ccc;
}

/* header 설정 */
#header {
	padding: 30px;
}

/* 네비게이션 설정 */
#nav {
	border-top: 1px solid #ccc;
	border-bottom: 1px solid #ccc;
	overflow: hidden;
}

#nav>ul {
	float: left;
	list-style: none;
}

#nav>ul>li {
	float: left;
	padding: 5px 15px;
}

#nav>div {
	float: right;
}

/* 검색영역 */
#nav input {
	border: 1px solid #ccc;
	padding: 3px 20px;
	margin-top: 3px;
}

#nav input[type=text] {
	width: 100px;
	border-radius: 20px 0px 0px 20px;
}

#nav input[type=button] {
	border-radius: 0px 20px 20px 0px;
	margin-left: -1px;
	margin-right: 5px;
}

/* Contents 영역 설정 */
#contents_wrap {
	overflow: hidden;
}

#section {
	width: 600px;
	float: left;
}

#aside {
	width: 170px;
	float: right;
}

article {
	padding: 25px;
	border-bottom: 1px solid #ccc;
}

article>img {
	width: 500px;
}

/* aside 영역 설정 */
/* #contents_wrap>aside{
    padding-top: 30px;
} */
#aside>h3 {
	margin-top: 30px;
}

#aside>ul>li {
	list-style: none;
	padding-left: 10px;
}

/* footer 설정 */
#footer {
	height: 50px;
	text-align: center;
	line-height: 50px;
}
</style>

</head>

<body>

	<div id="main_wrap">
		<%@ include file="myBlog/header.jsp"%>
		<%@ include file="myBlog/nav.jsp"%>
		<div id="contents_wrap">
			<%@ include file="myBlog/section.jsp"%>
			<%@ include file="myBlog/aside.jsp"%>
		</div>
		<%@ include file="myBlog/footer.jsp"%>
	</div>

</body>

</html>