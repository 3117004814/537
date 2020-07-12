<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>会员登录</title>
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
<!-- 引入自定义css文件 style.css -->
<link rel="stylesheet" href="css/style.css" type="text/css" />

<style>
body {
	margin-top: 20px;
	margin: 0 auto;
	width: 100%;
}

.carousel-inner .item img {
	width: 100%;
	height: 300px;
}
</style>
</head>

<body>


	<!-- 引入header.jsp -->
	<jsp:include page="userheader.jsp"></jsp:include>


	<div class="row" style="width: 1210px; margin: 0 auto;">
		<div class="col-md-12">
			<ol class="breadcrumb">
				<li><a href="#">首页</a></li>
			</ol>
		</div>


      <c:forEach items="${booklistById}" var="bookItem">
                    
			<div class="col-md-3" style="text-align:center;height:200px;padding:10px 0px;">
				<a href="${pageContext.request.contextPath}/book_info?bid=${bookItem.bid }">
					<img src="${bookItem.bimg }" width="130" height="130" style="display: inline-block;">
				</a>
				<p><a href="book_info?bid=${bookItem.bid }" style='color:#666'>书名：${bookItem.bname }</a></p>
				<p><font color="#E4393C" style="font-size:12px">作者：${bookItem.writer }</font></p>
			</div>
					

		</c:forEach>

	</div>

	



</body>

</html>