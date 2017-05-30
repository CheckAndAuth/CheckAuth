<%@ page language="java" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<title>非法链接</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=no" />
<style>
body{
	background-color: #5AC9C8;
	margin: 0;
	padding: 0;
	font-family: "黑体", Helvetica;
}
.content{
	margin-top:50px;
	display: block;
	width: 100%;
}
.content img{
	display: block;
	float: left;
	width: 120px;
	padding-left: 30px;
}
.msg{
	display: block;
	color:#fff;
	margin: 0 0 0 120px;
	padding: 0;
}
.msg h2{
	padding-top: 50px;
	font-size: 1.7rem;
}
.msg p{
	font-size: 1rem;
}
</style>
<body>
<div class="content">
	<img src="${pageContext.request.contextPath}/resources/images/err-img.png"/>
	<div class="msg">
		<h2>666!</h2>
		<p>抱歉！T_T找不到您要的页面...</p>
	</div>
</div>
</body>