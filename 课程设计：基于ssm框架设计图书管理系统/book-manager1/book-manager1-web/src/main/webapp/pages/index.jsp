<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>gdut图书管理系统</title>
		<link rel="stylesheet" href="../css/bootstrap.min.css" type="text/css" />
		<script src="../js/jquery-1.11.3.min.js" type="text/javascript"></script>
		<script src="../js/bootstrap.min.js" type="text/javascript"></script>
	</head>

	<body>
		<div class="container-fluid">
			<!-- 引入header.jsp -->
			<jsp:include page="userheader.jsp"></jsp:include>
			<div class="container">
			<div class="row">
			<div class="col-md-2">	
			</div>
			<!-- 轮播图 -->
			<div class="container-fluid col-md-10">
				<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
					<!-- 轮播图的中的小点 -->
					<ol class="carousel-indicators">
						<li  data-target="#carousel-example-generic"  data-slide-to="0" class="active"></li>
						<li  data-target="#carousel-example-generic"  data-slide-to="1"></li>
						<li  data-target="#carousel-example-generic"  data-slide-to="2"></li>
					</ol>
					<!-- 轮播图的轮播图片 -->
					<div class="carousel-inner" role="listbox">
						<div class="item active">
							<img src="../imgs/037.jpg">
							<div class="carousel-caption">
								计算机组成与体系结构
							</div>
						</div>
						<div class="item">
							<img src="../imgs/012.jpg">
							<div class="carousel-caption">
								人间失格
							</div>
						</div>
						<div class="item">
							<img src="../imgs/003.jpg">
							<div class="carousel-caption">
								追风筝的人
							</div>
						</div>
					</div>

					<!-- 上一张 下一张按钮 -->
					<a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
						<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
						<span class="sr-only">Previous</span>
					</a>
					<a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
						<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
						<span class="sr-only">Next</span>
					</a>
				</div>
			</div>
			
			
			<div class="container-fluid">
				<div class="col-md-12">
					<h2>热门书籍&nbsp;&nbsp;<img src="../img/title2.jpg"/></h2>
				
				<div class="col-md-12">
                    <c:forEach items="${IndexBoolist}" var="bookItem">
                    
					<div class="col-md-3" style="text-align:center;height:200px;padding:10px 0px;">
						<a href="${pageContext.request.contextPath}/book_info?bid=${bookItem.bid }">
							<img src="${bookItem.bimg }" width="130" height="130" style="display: inline-block;">
						</a>
						<p><a href="book_info?bid=${bookItem.bid }" style='color:#666'>书名：${bookItem.bname }</a></p>
						<p><font color="#E4393C" style="font-size:12px">作者：${bookItem.writer }</font></p>
					</div>
					</c:forEach>
					
			</div>
			
			
			</div>			
			
			
			
		</div>
	</body>

</html>